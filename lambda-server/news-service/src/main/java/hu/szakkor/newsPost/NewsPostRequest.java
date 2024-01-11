package hu.szakkor.newsPost;

import java.sql.Timestamp;
import java.util.UUID;

public record NewsPostRequest(
        String post,
        UUID userId,
        UUID newsId,
        UUID id
) {

}
