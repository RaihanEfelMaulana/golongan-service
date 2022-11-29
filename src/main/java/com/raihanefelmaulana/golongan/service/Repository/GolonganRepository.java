/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.raihanefelmaulana.golongan.service.Repository;

import com.raihanefelmaulana.golongan.service.Entity.Golongan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository

public interface GolonganRepository extends JpaRepository<Golongan, Long>{

    public Golongan findByGolonganId(Long golonganId);
    
}