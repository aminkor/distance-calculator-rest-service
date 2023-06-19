package com.example.distancecalculatorrestservice.controllers;

import com.example.distancecalculatorrestservice.dtos.DistanceCalculatorRequest;
import com.example.distancecalculatorrestservice.services.DistanceCalculatorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    DistanceCalculatorService distanceCalculatorService;

    @PostMapping("/distance")
    public String distanceCalculator(@Valid @RequestBody DistanceCalculatorRequest distanceCalculatorRequest) {
        return distanceCalculatorService.distanceCalculator(distanceCalculatorRequest);
    }
}
