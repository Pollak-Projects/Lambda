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
        return postRepository.findAll();
    }

    public Post findById(UUID id) {
        final var post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No post found under this id: " + id));
        return post;
    }

    public void delete(UUID post_id) {
        postRepository.deleteById(post_id);
    }

    public void update(UUID id, PostRequest post) {
        final var saved_post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No post found under this id: " + id));

        // TODO better implementation of this...
        saved_post.setMessage(post.message());
        saved_post.setGroupID(post.groupId());
        saved_post.setTitle(post.title());
        saved_post.setAttachments(post.attachments());

        postRepository.save(saved_post);

    }

}
