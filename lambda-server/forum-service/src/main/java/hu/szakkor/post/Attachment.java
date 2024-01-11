package hu.szakkor.post;


public enum Attachment {
    // TODO: as the server itself wont store any files this should be implemented with google drive.
    File, // any extension (.png .exe.... anything)
    Link // anything that's https://....
}
