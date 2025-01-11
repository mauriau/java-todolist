package net.learntime.todo_api_1.validator;

import net.learntime.todo_api_1.exception.TodoBadRequestException;
import net.learntime.todo_api_1.model.Todo;
import net.learntime.todo_api_1.utils.StringIsBlank;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TodoValidator implements TodoValidatorInterface {

    @Override
    public void validate(Todo todo)
    {
        if(StringIsBlank.isNullOrBlank(todo.getTitle())){
            throw new TodoBadRequestException("title is mandatory");
        }

        if (StringIsBlank.isNullOrBlank(todo.getDescription())){
            throw new TodoBadRequestException("description is mandatory");
        }

        if (Objects.isNull(todo.getCompleted())){
            throw new TodoBadRequestException("completed is mandatory");
        }
    }
}
