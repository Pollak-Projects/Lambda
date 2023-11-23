package hu.szakkor.forum;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(forumService.findAll());
    }

    @GetMapping
    public ResponseEntity<List<Forum>> FindAll() {
        return ResponseEntity.ok(forumService.findAll());
    }

    @PostMapping
    public ResponseEntity<Void> createNewForum(@RequestBody Forum forum) {
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateForum(@PathVariable String uuid) {
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteForum(@PathVariable String uuid) {
        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Void> deleteForum(@PathVariable UUID uuid) {
        // TODO: 11/9/2023 finish this
        return ResponseEntity.notFound().build();
    }

}
