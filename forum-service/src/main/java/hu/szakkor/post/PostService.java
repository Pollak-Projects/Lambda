package hu.szakkor.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> findAll() {
        // TODO add error handeling if nothing was found
        return postRepository.findAll();
    }

    public Post findById(UUID id) {
        // TODO add error handeling if nothing was found
        final var post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No post found under this id: " + id));
        return post;
    }

    public void deletePost(UUID post_id) {
        final var post = postRepository.findById(post_id)
                .orElseThrow(() -> new RuntimeException("No post found under this id: " + post_id));
        postRepository.delete(post);
    }

    public void updatePost(Post post) {
        final var saved_post = postRepository.findById(post.getId())
                .orElseThrow(() -> new RuntimeException("No post found under this id: " + post.getId()));

        // TODO better implementation of this...
        postRepository.save(saved_post);
    }

    public void createPost(Post post) {
        postRepository.save(post);

    }

}
