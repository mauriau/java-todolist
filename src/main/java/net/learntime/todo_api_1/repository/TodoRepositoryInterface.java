package net.learntime.todo_api_1.repository;

import net.learntime.todo_api_1.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface TodoRepositoryInterface extends JpaRepository<Todo, Long> {
}
