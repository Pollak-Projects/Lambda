package hu.szakkor.onepick;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "onepick", schema = "Quiz")
public class OnepickAnswer {
    @ManyToOne
    @Id
    @GeneratedValue
    private UUID id;

    private String answer;

    private boolean correct;

    OnepickQuestion ques;
}


