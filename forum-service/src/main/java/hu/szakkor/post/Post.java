package hu.szakkor.post;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.security.Timestamp;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "post", schema = "post")
public class Post implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID id; // id of the post itself

    private UUID groupID; // the group its published to
    private String message; // contents of the message
    private UUID sentBy; // id of user that published it
    private String title; // title
    
    @CreationTimestamp
    private Timestamp publishDate; // unix timestamp at creation
    
    private List<Attachment> attachments; // list of attachments, either link or file

    // TODO: add list of replies
    // @onetoomeany whatever
    // private List<Reply> replies;

}
