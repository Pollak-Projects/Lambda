package hu.szakkor.reply;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/forum/post/reply")
public class ReplyController extends Reply {

    private final ReplyService replyService;

    @GetMapping
    public ResponseEntity<List<Reply>> findAll() {
        return ResponseEntity.ok(replyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reply> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(replyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody Reply reply) {
        replyService.createReply(reply);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody Reply reply) {
        replyService.updateReply(reply);
        return ResponseEntity.ok().build();
    }
}
