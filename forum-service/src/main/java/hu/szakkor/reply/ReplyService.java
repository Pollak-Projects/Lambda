package hu.szakkor.reply;

import hu.szakkor.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {

    private final ReplyRepository replyRepository;

    public void createReply(Reply reply) {
        replyRepository.save(reply);
    }

    public List<Reply> findReply() {
        return replyRepository.findAll();
    }

    public void updateReply(Reply reply) {
        try {
            replyRepository.findById(reply.getId())
                    .orElseThrow(() -> new ResourceNotFoundException("Can't find reply by query"));
        } catch (ResourceNotFoundException exception) {
            return;
        }
        replyRepository.save(reply);
    }

    public void deleteReply(Reply reply) {
        try {
            replyRepository.findById(reply.getId())
                    .orElseThrow(() -> new ResourceNotFoundException(("Can't find reply by query")));
        } catch (ResourceNotFoundException exception) {
            return;
        }
        replyRepository.deleteById(reply.getId());
    }
}
