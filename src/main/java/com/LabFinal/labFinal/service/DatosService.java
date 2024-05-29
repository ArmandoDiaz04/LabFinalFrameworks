package com.LabFinal.labFinal.service;

import com.LabFinal.labFinal.repository.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatosService {
    @Autowired
    DatosRepository datosRepository;

    public List<Object[]> HighPopulationCountry() {
        return  datosRepository.HighPopulationCountry();
    }

    public List<Object[]> IncreasePopulation(){
        return datosRepository.IncreasePopulation();
    }
}
