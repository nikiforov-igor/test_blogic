package com.blogic.springbootanj.service;

import com.blogic.springbootanj.model.Tasks;
import com.blogic.springbootanj.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksService {

    @Autowired
    private TasksRepository tasksRepository;

    public List<Tasks> getAllTasks(){
        return tasksRepository.findAll();
    }
    public Tasks getTaskById(Long id) { return tasksRepository.findById(id).get();}
    public Tasks addTask(Tasks tasks){
        return tasksRepository.save(tasks);
    }
    public Tasks updateTask(Tasks tasks){ return tasksRepository.save(tasks); }
    public void deleteTask(Long id){ tasksRepository.deleteById(id); }
}
