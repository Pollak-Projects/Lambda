package hu.szakkor.newsPost;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/NewsPost")

public class NewsPostController {
    private final NewsPostService newsPostService;

    @GetMapping
    public ResponseEntity<List<NewsPost>> findAll() {
        return ResponseEntity.ok(newsPostService.findAll());
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody NewsPostRequest newsPostRequest) {
        newsPostService.newsPostSave(newsPostRequest);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody NewsPostRequest newsPostRequest) {
        newsPostService.newsPostUpdate(newsPostRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody NewsPostRequest newsPostRequest) {
        newsPostService.newsPostDelete(newsPostRequest);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/share")
    public ResponseEntity<Void> share(@RequestBody NewsPostRequest newsPostRequest) {
        newsPostService.newsPostShare(newsPostRequest);
        return ResponseEntity.ok().build();
    }

}
