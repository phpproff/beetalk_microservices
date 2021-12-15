/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beetalk.cloudgateway.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Hamdan
 */
@RestController

public class FallBackController {
    @GetMapping("/offersfallback")
    public String offersFallBackMethod(){
        return "offers Service down ...";
    }
    
    @GetMapping("/tasksfallback")
    public String tasksFallBackMethod(){
        return "Tasks Service down ...";
    }
}
