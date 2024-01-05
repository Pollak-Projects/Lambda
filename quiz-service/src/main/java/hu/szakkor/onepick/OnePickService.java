package hu.szakkor.onepick;

import hu.szakkor.essay.Essay;
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
    public void createOnePickQuestion(OnepickQuestion onepickQuestion_data) {
        onePickRepositoryQuestion.save(onepickQuestion_data);
    }
    public List <OnepickQuestion> findAll(){
        return onePickRepositoryQuestion.findAll();
    }
    public OnepickQuestion findById(UUID uuid) {

        return onePickRepositoryQuestion.findById(uuid).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
    }

    public void updateOnepickQuestion(OnepickQuestion onepickQuestion_data) {
        final var OnepickQuestion = onePickRepositoryQuestion.findById(onepickQuestion_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        onePickRepositoryQuestion.save(OnepickQuestion);
    }

    public void deleteEssay(OnepickQuestion onepickQuestion_data) {
        final var OnepickQuestion = onePickRepositoryQuestion.findById(onepickQuestion_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        onePickRepositoryQuestion.delete(OnepickQuestion);
    }

}
