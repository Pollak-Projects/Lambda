package hu.szakkor.essay;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/quiz/essay")
public class EssayController extends Essay{

    private final EssayService essayService;

    @GetMapping
    public ResponseEntity<List<Essay>> findAll() {
        return ResponseEntity.ok(essayService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Essay> findById(@PathVariable UUID uuid){
        return ResponseEntity.ok(essayService.findById(uuid));
    }

    @PutMapping
    public ResponseEntity<Void> create(@RequestBody Essay essay){
        essayService.createEssay(essay);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Essay essay){
        essayService.updateEssay(essay);
        return ResponseEntity.ok().build();
    }
}
