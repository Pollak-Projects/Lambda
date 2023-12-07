package hu.szakkor.multiplechoice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "correct_answers", schema = "multiple_choice")
public class CorrectAnswers {
    @Id
    @GeneratedValue
    private UUID id;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Question correctAnswer;
}
