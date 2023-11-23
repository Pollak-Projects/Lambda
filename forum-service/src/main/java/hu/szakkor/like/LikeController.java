package hu.szakkor.like;


import hu.szakkor.reply.Reply;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/forum/post/like")
public class LikeController extends Like{
    private final LikeService likeService;
    @PostMapping

    public ResponseEntity<Void> replySent(@RequestBody Like like){
        likeService.createLike(like);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<Like>> likeFind(){
        return ResponseEntity.ok(likeService.findAll());
    }
}

