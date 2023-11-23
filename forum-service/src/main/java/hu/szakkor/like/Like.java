package hu.szakkor.like;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "like", schema = "Forum")
public class Like {
    @Id
    @GeneratedValue
    private UUID id;
    private UUID postId;
    private UUID userId;
    @CreationTimestamp
    private Timestamp sendTime;
}
