package com.tasklist.to_do_task.controller;

import com.tasklist.to_do_task.model.Task;
import com.tasklist.to_do_task.repository.TaskRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class ToDoController {

  @Autowired
  TaskRepository repository;

  @PostMapping
  public void createTask(@RequestBody Task task) {
    repository.save(task);
  }

  @GetMapping
  public List<Task> listTask() {
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Task> listOne(@PathVariable("id") String id) {
    return repository.findById(id);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable("id") String id) {
    repository.deleteById(id);
  }
}
