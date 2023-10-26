package hu.szakkor.news;

import hu.szakkor.newsPost.NewsPost;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "news")
public class News implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID Id;

    private UUID groupId;

    @OneToMany(mappedBy = "news", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NewsPost> newsPost;
}

