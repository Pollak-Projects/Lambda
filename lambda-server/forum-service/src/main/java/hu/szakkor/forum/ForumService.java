package hu.szakkor.forum;

import hu.szakkor.exception.ResourceNotFoundException;
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
        forumRepository.findById(forum_data.getId())
                .orElseThrow(() -> new RuntimeException("No forum under this id: " + forum_data.getId()));
        forumRepository.save(forum_data);
    }

    public Forum findByID(UUID uuid) {
        return forumRepository.findById(uuid).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
    }

    public void delete(UUID id) {
        final var forum = forumRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        forumRepository.delete(forum);
    }
}
