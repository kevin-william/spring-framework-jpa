package autonomous.controllers;

import autonomous.entities.Task;
import autonomous.repositories.ITaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
  private final ITaskRepository taskRepository;

  TaskController(ITaskRepository taskRepository){
    this.taskRepository = taskRepository;
  }

  @GetMapping("/tasks")
  List<Task> GetAll(){
    return taskRepository.findAll();
  }

  @PostMapping("/tasks")
  Task SaveTask(@RequestBody Task task){
    return taskRepository.save(task);
  }

  @PutMapping("/tasks")
  Task UpdateTask(@RequestBody Task task){
    return taskRepository.save(task);
  }

  @GetMapping("/tasks/{id}")
  Task GetById(@PathVariable long id){
    return taskRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("Id inválido"));
  }

}
