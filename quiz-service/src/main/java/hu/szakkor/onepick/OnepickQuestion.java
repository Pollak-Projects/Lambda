package hu.szakkor.onepick;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "onepick", schema = "Quiz")
public class OnepickQuestion {
    @Id
    @GeneratedValue
    @OneToMany(mappedBy = "ques")
    private UUID id;

    private String question;

    private UUID groupId;
    List<OnepickAnswer> ans;
}
