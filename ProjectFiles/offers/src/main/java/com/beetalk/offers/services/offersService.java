/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beetalk.offers.services;
import com.beetalk.offers.models.offers;
import com.beetalk.offers.repositories.offersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author Hamdan
 */
@Service
public class offersService {
    @Autowired
    offersRepository myoffersRepository;  
    
    @Autowired
    RestTemplate restTemplate;
    
    public List getAllOffers(){
       return myoffersRepository.findAll();
    }
    
    public offers saveOffer(offers off) {
        return myoffersRepository.save(off);
    }
}
