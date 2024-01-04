package hu.szakkor.multiplechoice;

import hu.szakkor.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

// NEVER TESTED MAY NOT WORK
@Service
@RequiredArgsConstructor
public class MultipleService {
    private final MultipleRepository multipleRepository;

    public void createQuestion(Question question) {
        multipleRepository.save(question);
    }

    public List<Question> findAll() {
        return multipleRepository.findAll();
    }

    public Question findById(UUID id) {
        return multipleRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
    }

    public void updateQuestion(Question question_data) {
        final var question = multipleRepository.findById(question_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        multipleRepository.save(question);
    }

    public void deleteQuestion(Question question_data) {
        final var question = multipleRepository.findById(question_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        multipleRepository.delete(question);
    }

}
