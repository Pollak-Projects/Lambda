package hu.szakkor.newsPost;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NewsPostRepository extends JpaRepository<NewsPost, UUID> {

}
