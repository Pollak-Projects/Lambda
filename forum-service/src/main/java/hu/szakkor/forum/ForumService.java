package hu.szakkor.forum;

import hu.szakkor.exception.ResourceNotFoundException;
import hu.szakkor.post.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ForumService {
    private final ForumRepository forumRepository;

    public List<Forum> findAll() {
        return forumRepository.findAll();
    }

    public void createForum(Forum forum) {
        forumRepository.save(forum);
    }

    public void updateForum(Forum forum_data) {
        final var forum = forumRepository.findById(forum_data.getId())
                .orElseThrow(() -> new RuntimeException("No forum under this id: " + forum_data.getId()));
        forumRepository.save(forum);
    }

    public Forum findByID(UUID uuid) {
        return forumRepository.findById(uuid).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
    }

    public void delete(Forum forum_data) {
        final var forum = forumRepository.findById(forum_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        forumRepository.delete(forum);
    }
}
