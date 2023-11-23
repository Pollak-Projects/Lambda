package hu.szakkor.reply;

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
@Table(name = "reply", schema = "Forum")
public class Reply {

    @Id
    @GeneratedValue
    private UUID id;

    private UUID postId;

    private String sender;

    private String title;

    private String message;

    @CreationTimestamp
    private Timestamp sendTime;

}
