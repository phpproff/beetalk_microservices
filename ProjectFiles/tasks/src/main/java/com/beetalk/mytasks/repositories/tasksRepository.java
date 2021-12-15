/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.beetalk.mytasks.repositories;
import com.beetalk.mytasks.models.tasks;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Hamdan
 */
public interface tasksRepository extends JpaRepository<tasks, Integer> {
   
}
