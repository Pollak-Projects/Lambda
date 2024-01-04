package hu.szakkor.multiplechoice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/quiz/multiplechoice")
public class MultipleController {
    private final MultipleService multipleService;

    @GetMapping
    public ResponseEntity<List<Question>> findAll() {
        return ResponseEntity.ok(multipleService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> findById(@PathVariable UUID id){
        return ResponseEntity.ok(multipleService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Question question){
        multipleService.createQuestion(question);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Question question){
        multipleService.updateQuestion(question);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestBody Question question){
        multipleService.deleteQuestion(question);
        return ResponseEntity.ok().build();
    }
}
