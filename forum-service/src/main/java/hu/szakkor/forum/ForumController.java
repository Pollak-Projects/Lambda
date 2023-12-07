package hu.szakkor.forum;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.ws.rs.QueryParam;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/forum")
public class ForumController {
    private final ForumService forumService;

    @GetMapping
    public ResponseEntity<List<Forum>> findAll() {
        // TODO add error handeling if forums are nonexistent
        return ResponseEntity.ok(forumService.findAll());
    }

    @GetMapping("/")
    public ResponseEntity<Forum> findById(@RequestParam("id") UUID uuid) {
        // TODO add error handeling if forum is nonexistent
        return ResponseEntity.ok(forumService.findByID(uuid));
    }

    @PostMapping
    public ResponseEntity<Void> createNewForum(@RequestBody Forum forum) {
        forumService.createForum(forum);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updateForum(@RequestBody Forum forum) {
        // TODO add error handeling if forum is nonexistent
        forumService.updateForum(forum);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteForum(@RequestParam("id") UUID id) {
        forumService.delete(id);
        return ResponseEntity.ok().build();
    }

}
