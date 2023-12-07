package hu.szakkor.multiplechoice;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "questions")
public class Question implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID id;

    private String question;

    @OneToMany(mappedBy = "answer",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Answers> answers;

    @OneToMany(mappedBy = "correctAnswer",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CorresctAnswers> correctAnswers;
}
