package hu.szakkor.news;

import hu.szakkor.newsPost.NewsPost;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name = "news_upvoters")

public class NewsUpvoters implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private UUID id;

    private UUID userId;

    //donnoifmanytooneoronetomany
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "news_id")
    private NewsPost newsPost;
}
