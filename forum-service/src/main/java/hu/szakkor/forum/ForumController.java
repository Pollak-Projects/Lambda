package hu.szakkor.forum;

<<<<<<< HEAD
=======
import lombok.Getter;
import lombok.RequiredArgsConstructor;
>>>>>>> db40d4dbb20128609bacb60fd597903df19df2c2
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/forum")
public class ForumController {
    private final ForumService forumService;

    @GetMapping
    public ResponseEntity<List<Forum>> findAll(){
        return ResponseEntity.ok(forumService.findAll());
    }

<<<<<<< HEAD
    @GetMapping
    public ResponseEntity<List<Forum>> findForum() {
        return ResponseEntity.ok(forumService.findForum());
    }

    @PostMapping
    public ResponseEntity<Void> createNewForum(@RequestBody Forum forum) {
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateForum(@PathVariable String uuid) {
=======
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
>>>>>>> db40d4dbb20128609bacb60fd597903df19df2c2
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
<<<<<<< HEAD
    public ResponseEntity<Void> deleteForum(@PathVariable String uuid) {
        return ResponseEntity.notFound().build();
    }

=======
    public ResponseEntity<Void> deleteForum(@PathVariable UUID uuid){
        // TODO: 11/9/2023 finish this
        return ResponseEntity.notFound().build();
    }


>>>>>>> db40d4dbb20128609bacb60fd597903df19df2c2
}
