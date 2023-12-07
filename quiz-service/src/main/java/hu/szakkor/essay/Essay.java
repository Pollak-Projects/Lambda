package hu.szakkor.essay;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "essay", schema = "Forum")
public class Essay {
    @Id
    @Generated
    private UUID uuid;

    private String content;

}
