package hu.szakkor.like;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/forum/post/like")
public class LikeController extends Like {
    private final LikeService likeService;

    @DeleteMapping
    public ResponseEntity<Void> updateLike(@RequestBody Like like) {
        likeService.deleteLike(like);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> createLike(@RequestBody Like like) {
        likeService.createLike(like);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Like>> findAll() {
        return ResponseEntity.ok(likeService.findAll());
    }

}
