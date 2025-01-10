package net.learntime.todo_api_1.exception;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(Long id) {
        //super("Todo with id %s does not exist".formatted(id));
        super(String.format("Todo with id %s does not exist", id));
    }
}
