/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.beetalk.offers.repositories;
import com.beetalk.offers.models.offers;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Hamdan
 */
public interface offersRepository extends JpaRepository<offers, Integer> {
  
}
