package hu.szakkor.newsPost;

import hu.szakkor.news.News;
import hu.szakkor.news.NewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NewsPostService {


    private final NewsRepository newsRepository;
    private final NewsPostRepository newsPostRepository;
    public List<NewsPost> findAll() {return newsPostRepository.findAll();}

    public void newsPostSave(NewsPostRequest request)
    {
        News news = newsRepository
                .findById(request.newsId())
                .orElseThrow(()->new RuntimeException("No submit found under this id: " +  request
                        .userId()));

        NewsPost newsPost = NewsPost.builder()
                .post(request.post())
                .userId(request.userId())
                .news(news).build();

        newsPostRepository.save(newsPost);
    }

    public void newsPostUpdate(NewsPostRequest request) {

        NewsPost newsPost = newsPostRepository.findById(request.id()).orElseThrow(()->new RuntimeException("No submit found under this id: " +  request.userId()));

        newsPost.setPost(request.post());
        newsPostRepository.save(newsPost);
    }

    public NewsPost newsPostShare(NewsPostRequest request) {
        return newsPostRepository.findById(request.id()).orElseThrow(()->new RuntimeException("No submit found under this id: " +  request.userId()));
    }
    
    public void newsPostDelete(NewsPostRequest request) {
        NewsPost newsPost = newsPostRepository.findById(request.id()).orElseThrow(()->new RuntimeException("No submit found under this id: " +  request.userId()));

        newsPostRepository.delete(newsPost);
    }
}


