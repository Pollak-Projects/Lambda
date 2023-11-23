
package hu.szakkor.post;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
public class PostController {

    private final PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> findAll() {
        // FIXME implement error handeling if resource is not found
        return ResponseEntity.ok(postService.findAll());
    }

    @GetMapping("/id")
    public ResponseEntity<Post> findById(@RequestParam UUID id) {
        // FIXME implement error handeling if resource is not found
        return ResponseEntity.ok(postService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> createNewPost(@RequestBody Post post) {
        // TODO deseralize attachments
        // attachments shall be sent as a list of links.
        // since we wont host files ourselves the links
        // from google drive shall be deseralized
        // into our Attachement::File type
        postService.createPost(post);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> updatePost(@RequestBody Post post) {
        // FIXME add error handeling when user tries to edit non existent post
        postService.updatePost(post);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deletePost(@PathVariable UUID id) {
        // FIXME add error handeling when user tries to edit non existent post
        postService.deletePost(id);
        return ResponseEntity.ok().build();
    }

}
