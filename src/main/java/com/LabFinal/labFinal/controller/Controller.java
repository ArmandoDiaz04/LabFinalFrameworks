package com.LabFinal.labFinal.controller;

import com.LabFinal.labFinal.service.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/Datos")
public class Controller {
    @Autowired
    private PService service;
    @GetMapping("/")
    public List<Map<String, Object>> getHighPopulationCountries(){
        return service.getHighPopulationCountries();
    }
    @GetMapping("/increase")
    public List<Map<String, Object>> getPopulationIncrease(){
        return service.getPopulationIncrease();
    }

    @GetMapping("/increaseCountry")
    public List<Map<String, Object>> getPopulationGrowth(){
        return service.getPopulationGrowth();
    }

    @GetMapping("/populationDecrease")
    public List<Map<String, Object>> getPopulationDecrease() {
        return service.getPopulationDecrease();
    }

    @GetMapping("/populationIncrease")
    public List<Map<String, Object>> getPopulationIncreaseGrowth() {
        return service.getPopulationIncreaseGrowth();
    }
}
