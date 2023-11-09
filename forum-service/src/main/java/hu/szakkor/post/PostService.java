package hu.szakkor.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    // CRUD
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(String id){
        final var post = postRepository.findById(UUID.fromString(id)).orElseThrow(() ->
            new RuntimeException("No post found under this id: " + id )
        );
        return post;
    }

    // TODO getReplies()
    // TODO delete()
    

}

