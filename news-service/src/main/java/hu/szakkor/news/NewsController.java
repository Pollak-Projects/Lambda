package hu.szakkor.news;

import hu.szakkor.newsPost.NewsPostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/news")
public class NewsController {
    private final NewsService newsService;

    @GetMapping
    public ResponseEntity<List<News>> findAll() { return ResponseEntity.ok(newsService.findAll());}

    @PostMapping("/{groupId}")
    public ResponseEntity<Void> save(@PathVariable String groupId) {
        newsService.NewsPostSave(groupId);
        return ResponseEntity.ok().build();
    }
}
