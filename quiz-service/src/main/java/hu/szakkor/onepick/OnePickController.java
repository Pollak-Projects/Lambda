package hu.szakkor.onepick;

import hu.szakkor.onepick.OnePickService;
import hu.szakkor.onepick.OnepickQuestion;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/quiz/OnePick")
public class OnePickController {

    private final OnePickService onePickService;

    @GetMapping
    public ResponseEntity<List<OnepickQuestion>> findAll() {
        return ResponseEntity.ok(onePickService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OnepickQuestion> findById(@PathVariable UUID uuid){
        return ResponseEntity.ok(onePickService.findById(uuid));
    }

    @PutMapping
    public ResponseEntity<Void> create(@RequestBody OnepickQuestion OnePick){
        onePickService.createOnePickQuestion(OnePick);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody OnepickQuestion OnePick){
        onePickService.updateOnePickQuestion(OnePick);
        return ResponseEntity.ok().build();
    }
}
