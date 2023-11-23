package hu.szakkor.like;

import hu.szakkor.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class LikeService {
    private final LikeRepository likeRepository;
    public List<Like> findAll() { return likeRepository.findAll();}

    public void createLike(Like like) { likeRepository.save(like); }

    public void updateLike(Like like) { likeRepository.save(like); }

    public Like findByID(UUID uuid) {
        return likeRepository.findById(uuid).orElseThrow(
                ()-> new ResourceNotFoundException("Cant find anything with this id")
        );
    }


}
