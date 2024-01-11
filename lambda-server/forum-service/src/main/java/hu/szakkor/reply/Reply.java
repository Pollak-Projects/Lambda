package hu.szakkor.reply;

import jakarta.persistence.*;
import lombok.*;

import java.security.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
