
package hu.szakkor.post;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/forum/post")
public class PostController {

    private final PostService postService;

    @GetMapping
    public ResponseEntity<Post> findById(@RequestParam UUID id) {
        // FIXME implement error handeling if resource is not found
        final var post = postService.findById(id);
        return ResponseEntity.ok(post);
    }

    @GetMapping
    public ResponseEntity<List<Post>> findAll() {
        // FIXME implement error handeling if resource is not found
        final var post = postService.findAll();
        return ResponseEntity.ok(post);
    }

    @PostMapping
    public ResponseEntity<Void> createNewPost(@RequestBody PostRequest post) {
        // TODO deseralize attachments
        // attachments shall be sent as a list of links.
        // since we wont host files ourselves the links
        // from google drive shall be deseralized
        // into our Attachement::File type

        Post.builder()
                .message(post.message())
                .title(post.title())
                // TODO get user id from keycloak
                .sentBy(UUID.fromString("e496bb41-3cd8-4928-b8de-cfd2c15b866a"))
                .groupID(post.groupId())
                .attachments(post.attachments());

        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePost(@PathVariable UUID id, @RequestBody PostRequest post) {
        // FIXME add error handeling when user tries to edit non existent post
        postService.update(id, post);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable UUID id) {
        postService.delete(id);
        ;
        return ResponseEntity.ok().build();
    }

}
