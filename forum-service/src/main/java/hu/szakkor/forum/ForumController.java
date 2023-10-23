package hu.szakkor.forum;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
