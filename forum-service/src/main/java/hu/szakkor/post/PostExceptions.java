package hu.szakkor.post;

public class PostExceptions extends RuntimeException {
    
    public PostNotFoundException (String message){
        super(message)
    }
    
}
