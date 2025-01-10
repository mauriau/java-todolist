package net.learntime.todo_api_1.exception;

public class TodoBadRequestException extends RuntimeException {
    public TodoBadRequestException(String message) {
        super(message);
    }
}
