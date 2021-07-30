package com.blogic.springbootanj;

import com.blogic.springbootanj.model.Tasks;
import com.blogic.springbootanj.repository.TasksRepository;
import com.blogic.springbootanj.service.TasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/tasks")
public class TasksController {
     @Autowired
    private TasksService tasksService;

    @GetMapping("/all")
    public List<Tasks> getAll(){
        List<Tasks> tasks=tasksService.getAllTasks();
        return tasks;
    }
    @PostMapping("/addtask")
    public void save(@RequestBody Tasks tasks){
        tasksService.addTask(tasks);
    }

    @PutMapping("/updatetask")
    public Tasks updatetask(@PathVariable(value = "id") Long id,@RequestBody Tasks tasks){
        Tasks t = tasksService.getTaskById(id);
        t.setResponsibleman(tasks.getResponsibleman());
        t.setTaskauthor(tasks.getTaskauthor());
        t.setTask(tasks.getTask());
        t.setControlattribute(tasks.getControlattribute());
        t.setExecutionattribute(tasks.getExecutionattribute());
        t.setTextoftask(tasks.getTextoftask());
        return tasksService.updateTask(t);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        tasksService.deleteTask(id);
    }

}
