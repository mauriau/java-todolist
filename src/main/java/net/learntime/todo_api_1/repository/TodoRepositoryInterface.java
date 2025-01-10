package net.learntime.todo_api_1.repository;

import net.learntime.todo_api_1.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepositoryInterface extends JpaRepository<Todo, Long> {
}
