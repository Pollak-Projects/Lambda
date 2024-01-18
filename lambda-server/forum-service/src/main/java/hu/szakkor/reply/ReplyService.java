package hu.szakkor.reply;

import hu.szakkor.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReplyService {

    private final ReplyRepository replyRepository;

    public void createReply(Reply reply) {
        replyRepository.save(reply);
    }

    public List<Reply> findAll() {
        return replyRepository.findAll();
    }

    public Reply findById(UUID id) {
        final var reply = replyRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        return reply;
    }

    public void updateReply(Reply reply_data) {
        final var reply = replyRepository.findById(reply_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        replyRepository.save(reply);
    }

    public void deleteReply(Reply reply_data) {
        final var reply = replyRepository.findById(reply_data.getId()).orElseThrow(
                () -> new ResourceNotFoundException("Cant find anything with this id"));
        replyRepository.delete(reply);
    }
}
