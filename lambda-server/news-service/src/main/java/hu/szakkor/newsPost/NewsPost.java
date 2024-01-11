package hu.szakkor.newsPost;

import com.fasterxml.jackson.annotation.JsonIgnore;
import hu.szakkor.news.News;
import hu.szakkor.news.NewsUpvoters;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "news")
public class NewsPost implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID id;

    private String post;

    @JsonIgnore
    private UUID userId;

    @CreationTimestamp
    private Timestamp createdAt;

    @ManyToOne(
            cascade = CascadeType.ALL, fetch = FetchType.EAGER
    )
    @JoinColumn(name = "post_id")
    private News news;

    @OneToMany(mappedBy = "newsPost", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NewsUpvoters> newsUpvoters;
}
