package com.example.distancecalculatorrestservice.interfaces;

import com.example.distancecalculatorrestservice.dtos.DistanceCalculatorRequest;

public interface DistanceCalculatorInterface {
    public abstract String distanceCalculator(DistanceCalculatorRequest distanceCalculatorRequest);
}
