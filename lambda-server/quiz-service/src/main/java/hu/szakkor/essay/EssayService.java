package hu.szakkor.essay;

import hu.szakkor.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EssayService {

    private final EssayRepository essayRepository;

    public void createEssay(Essay essay) {
        essayRepository.save(essay);
    }

    public List<Essay> findAll() {
        return essayRepository.findAll();
    }

    public Essay findById(UUID id) {
        final var essay = essayRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        return essay;
    }

    public void updateEssay(Essay essay_data) {
        final var essay = essayRepository.findById(essay_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        essayRepository.save(essay);
    }

    public void deleteEssay(Essay essay_data) {
        final var essay = essayRepository.findById(essay_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        essayRepository.delete(essay);
    }
}
