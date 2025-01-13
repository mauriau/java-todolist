package net.learntime.todo_api_1.exception;

import net.learntime.todo_api_1.model.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TodoBadRequestExceptionHandler {

    @ExceptionHandler(value = TodoBadRequestException.class)
    public ResponseEntity<ApiError> handleException(TodoBadRequestException exception) {
        return new ResponseEntity<>(new ApiError(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
