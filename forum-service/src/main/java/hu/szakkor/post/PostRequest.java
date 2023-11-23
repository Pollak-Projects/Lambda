package hu.szakkor.post;

import java.util.UUID;

import java.util.List;

public record PostRequest(

        String title,
        UUID groupID,
        String message,
        List<Attachment> attachments) {

}
