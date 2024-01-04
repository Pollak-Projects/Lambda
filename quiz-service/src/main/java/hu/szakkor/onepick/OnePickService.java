package hu.szakkor.onepick;

import hu.szakkor.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OnePickService {

    private final OnePickRepositoryQuestion onePickRepositoryQuestion ;
    private final OnePickRepositoryAnswer onePickRepositoryAnswer ;

    public List <OnepickQuestion> findAll(){
        return onePickRepositoryQuestion.findAll();
    }
    public OnepickQuestion findById(UUID uuid) {

        return onePickRepositoryQuestion.findById(uuid).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
    }

}
