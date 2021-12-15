/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beetalk.offers.controllers;

import com.beetalk.offers.models.offers;
import com.beetalk.offers.services.offersService;
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
@RequestMapping("/offers")
public class offerController {
    @Autowired
    offersService myofferService;
            
    @GetMapping("/all")
    public List getData(){
        return myofferService.getAllOffers();
    }
    
    @PostMapping("/")
    public offers saveOffer(@RequestBody offers offer){
        return myofferService.saveOffer(offer);
    }
    
}
