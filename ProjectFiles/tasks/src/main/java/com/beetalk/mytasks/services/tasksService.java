/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beetalk.mytasks.services;

import com.beetalk.mytasks.models.tasks;
import java.util.List;
import com.beetalk.mytasks.repositories.tasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 *
 * @author Hamdan
 */
@Service
public class tasksService {
    @Autowired
    tasksRepository rep;  
    
    @Autowired
    RestTemplate restTemplate;
    public List getAlltasks(){
       return rep.findAll();
    }
    
    public tasks saveTask(tasks tasks) {
        return rep.save(tasks);
    }
    
    
}
