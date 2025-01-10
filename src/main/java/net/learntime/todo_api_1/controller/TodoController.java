package net.learntime.todo_api_1.controller;

import net.learntime.todo_api_1.exception.TodoNotFoundException;
import net.learntime.todo_api_1.model.Todo;
import net.learntime.todo_api_1.repository.TodoRepositoryInterface;
import net.learntime.todo_api_1.validator.TodoValidatorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/todos")
public class TodoController {

    @Autowired
    private TodoRepositoryInterface repository;

    @Autowired
    private TodoValidatorInterface validator;

    @GetMapping
    public List<Todo> getAll(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Todo getById(@PathVariable Long id)
    {
        return repository.findById(id).orElseThrow(() -> new TodoNotFoundException(id));
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo)
    {
        validator.validate(todo);

        return repository.save(todo);
    }

    @PutMapping("{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo todo)
    {
        validator.validate(todo);

        var entity = repository.findById(id).orElseThrow(() -> new TodoNotFoundException(id));
        entity.setTitle(todo.getTitle());
        entity.setDescription(todo.getDescription());
        entity.setCompleted(todo.getCompleted());

        repository.save(entity);

        return entity;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id)
    {
        repository.deleteById(id);
    }
}
