package com.example.distancecalculatorrestservice.controllers;

import com.example.distancecalculatorrestservice.dtos.DistanceCalculatorRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PostMapping("/distance")
    public String distanceCalculator(@RequestBody DistanceCalculatorRequest distanceCalculatorRequest) {
        return distanceCalculatorRequest.getFirstUnit();
    }
}
