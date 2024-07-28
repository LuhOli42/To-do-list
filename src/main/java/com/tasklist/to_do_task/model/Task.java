package com.tasklist.to_do_task.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column
  private String task_id;

  @Column(length = 50, nullable = false)
  private String title;

  @Column(length = 255, nullable = false)
  private String description;

  public Task() {}

  public Task(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getId() {
    return task_id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return (
      "Task [id=" +
      task_id +
      ", title=" +
      title +
      ", description=" +
      description +
      "]"
    );
  }
}
