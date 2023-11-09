package hu.szakkor.forum;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/forum")
public class ForumController {
    private final ForumService forumService;

    public ForumController(ForumService forumService) {
        this.forumService = forumService;
    }



    @GetMapping
    public ResponseEntity<List<Forum>> findForum(){
        return ResponseEntity.ok(forumService.findForum());
    }

    @PostMapping
    public ResponseEntity<Void> createNewForum(@RequestBody Forum forum){
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateForum(@PathVariable String uuid){
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteForum(@PathVariable String uuid){
        return ResponseEntity.notFound().build();
    }




}
