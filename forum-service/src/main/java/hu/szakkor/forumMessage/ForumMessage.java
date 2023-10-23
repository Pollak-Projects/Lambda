package hu.szakkor.forumMessage;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.szakkor.forum.Forum;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ForumMessage implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID id;

    private String msg;

    @JsonIgnore
    private UUID userID;

    @Transient  // @Transistent = Csak egy lokális változó, nem lesz benne az adatbázisban
    private String userName;

    @CreationTimestamp
    private Timestamp createdAt;

    @ManyToOne(
            cascade = CascadeType.ALL, fetch = FetchType.EAGER
    )
    @JoinColumn(name = "forum_id")
    private Forum forum;
}
