package hu.szakkor.news;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepository newsRepository;

    public List<News> findAll() {return newsRepository.findAll();}

    public void NewsPostSave(String groupId) {
        final News news = News.builder().groupId(UUID.fromString(groupId)).build();
        newsRepository.save(news);
    }
}
