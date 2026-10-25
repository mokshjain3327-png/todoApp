package com.Todo.todoApp.Repository;

import com.Todo.todoApp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
