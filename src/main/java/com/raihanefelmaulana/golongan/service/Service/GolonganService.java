/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raihanefelmaulana.golongan.service.Service;

import com.raihanefelmaulana.golongan.service.Entity.Golongan;
import com.raihanefelmaulana.golongan.service.Repository.GolonganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service

public class GolonganService {
    @Autowired
    private GolonganRepository golonganRepository;
    
       public Golongan saveGolongan(Golongan golongan) {
        if (golongan.getGolonganGajiPokok() == 1) {
            long gajipokok = 3000000;
            golongan.setGolonganGajiPokok(gajipokok);
        } else if (golongan.getGolonganGajiPokok() == 2){
            long gajipokok = 2000000;
            golongan.setGolonganGajiPokok(gajipokok);
        } else if (golongan.getGolonganGajiPokok() == 3){
            long gajipokok = 1000000;
            golongan.setGolonganGajiPokok(gajipokok);
        } else if (golongan.getGolonganGajiPokok() == 4){
            long gajipokok = 500000;
            golongan.setGolonganGajiPokok(gajipokok);
        } 
        return golonganRepository.save(golongan);
    }
    
    public Golongan findGolonganById(Long golonganId){
        return golonganRepository.findByGolonganId(golonganId);
    }
}
