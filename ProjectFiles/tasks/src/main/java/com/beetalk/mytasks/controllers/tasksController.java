/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beetalk.mytasks.controllers;

import com.beetalk.mytasks.models.tasks;
import com.beetalk.mytasks.services.tasksService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hamdan
 */
@RestController
@RequestMapping("/tasks")
public class tasksController {
    @Autowired
    tasksService service;
            
    @GetMapping("/all")
    public List getData(){
        return service.getAlltasks();
    }
    
    @PostMapping("/")
    public tasks saveTask(@RequestBody tasks tasks){
        return service.saveTask(tasks);
    }
    
   
    
}
