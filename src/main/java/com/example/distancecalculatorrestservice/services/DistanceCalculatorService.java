package com.example.distancecalculatorrestservice.services;

import com.example.distancecalculatorrestservice.dtos.DistanceCalculatorRequest;
import com.example.distancecalculatorrestservice.interfaces.DistanceCalculatorInterface;
import com.example.distancecalculatorrestservice.utils.DistanceUnitConversion;
import com.example.distancecalculatorrestservice.utils.MathUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DistanceCalculatorService implements DistanceCalculatorInterface {
    @Override
    public String distanceCalculator(DistanceCalculatorRequest distanceCalculatorRequest) {
        // get the output unit
        // iterate input units, convert if necessary
        // add both of them
        String distanceOutput = "";
        List<Double> processedUnit = new ArrayList<>();
        for (int i = 0; i < distanceCalculatorRequest.getUnits().length; i++) {
            if (!distanceCalculatorRequest.getUnits()[i].equalsIgnoreCase(distanceCalculatorRequest.getOutputUnit())) {
                // if not same unit with desired output. need to convert
                processedUnit.add(DistanceUnitConversion.convert(
                        distanceCalculatorRequest.getUnits()[i],
                        distanceCalculatorRequest.getInputs()[i],
                        distanceCalculatorRequest.getOutputUnit()
                ));
            }
            else {
                processedUnit.add(distanceCalculatorRequest.getInputs()[i]);
            }
        }

        distanceOutput = MathUtils.sum(processedUnit) + " " + distanceCalculatorRequest.getOutputUnit();

        return distanceOutput;
    }
}
