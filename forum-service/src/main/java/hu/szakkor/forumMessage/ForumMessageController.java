package hu.szakkor.forumMessage;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/forum/post")
public class ForumMessageController {
    @PostMapping
    public ResponseEntity<Void> createNewPost(@RequestBody ForumMessage forumMessage){
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Void> getPostById(@PathVariable String uuid) {
        return ResponseEntity.notFound().build();
    }


}
