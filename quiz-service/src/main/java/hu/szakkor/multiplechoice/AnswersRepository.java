package hu.szakkor.multiplechoice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnswersRepository extends JpaRepository<Answers, UUID> {

}

