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
    private final QuestionRepository questionRepository;
    private final AnswersRepository answersRepository;
    private final CorrectAnswersRepository correctAnswersRepository;

    public void createQuestion(Question question) {
        answersRepository.saveAll(question.getAnswers());
        correctAnswersRepository.saveAll(question.getCorrectAnswers());
        questionRepository.save(question);
    }

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Question findById(UUID id) {
        return questionRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
    }

    public void updateQuestion(Question question_data) {
        final var question = questionRepository.findById(question_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        answersRepository.saveAll(question_data.getAnswers());
        correctAnswersRepository.saveAll(question_data.getCorrectAnswers());
        questionRepository.save(question);
    }

    public void deleteQuestion(Question question_data) {
        final var question = questionRepository.findById(question_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        questionRepository.delete(question);
    }

}
