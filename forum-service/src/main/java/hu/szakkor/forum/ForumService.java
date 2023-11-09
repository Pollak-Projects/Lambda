package hu.szakkor.forum;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
@RequiredArgsConstructor
public class ForumService {
    private final ForumRepository forumRepository;



    public List<Forum> findForum() {
        return forumRepository.findAll();
    }
}
