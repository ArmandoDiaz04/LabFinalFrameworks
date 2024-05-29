package com.LabFinal.labFinal.service;

import com.LabFinal.labFinal.repository.PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Service
@RequestMapping
public class PService {
    @Autowired
    private PRepository repository;
    public List<Map<String, Object>> getHighPopulationCountries() {
        return repository.getHighPopulationCountries();
    }

    public List<Map<String, Object>> getPopulationIncrease(){
        return repository.getPopulationIncrease();
    }
    public List<Map<String, Object>> getPopulationIncrease2(){
        return repository.getPopulationIncrease2();
    }

    public List<Map<String, Object>> getPopulationGrowth() {
        return repository.getPopulationGrowth();
    }

    public List<Map<String, Object>> getPopulationDecrease() {
        return repository.getPopulationDecrease();
    }

    public List<Map<String, Object>> getPopulationIncreaseGrowth() {
        return repository.getPopulationIncrease();
    }
}
