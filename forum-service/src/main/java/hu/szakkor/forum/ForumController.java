package hu.szakkor.forum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/forum")
public class ForumController {
    private final ForumService forumService;

    @GetMapping
    public ResponseEntity<List<Forum>> findAll(){
        return ResponseEntity.ok(forumService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Forum> getForumById(@PathVariable UUID uuid) {
        return ResponseEntity.ok(forumService.findByID(uuid));
    }

    @PostMapping
    public ResponseEntity<Void> createNewForum(@RequestBody Forum forum){
        forumService.createForum(forum);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateForum(@PathVariable Forum forum){
        forumService.updateForum(forum);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteForum(@PathVariable UUID uuid){
        // TODO: 11/9/2023 finish this
        return ResponseEntity.notFound().build();
    }


}
