package com.tasklist.to_do_task.repository;

import com.tasklist.to_do_task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {}
