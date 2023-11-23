package hu.szakkor.reply;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/forum/post/reply")
public class ReplyController extends Reply {

    private final ReplyService replyService;

    public ResponseEntity<Void> replySent(@RequestBody Reply reply) {
        replyService.createReply(reply);
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<List<Reply>> replyFind() {
        return ResponseEntity.ok(replyService.findReply());
    }

}
