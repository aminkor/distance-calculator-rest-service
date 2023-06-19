package com.example.distancecalculatorrestservice.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class DistanceCalculatorRequest {
    @NotNull(message = "Must not be null")
    @Size(min = 2, max = 2, message = "Must be 2 values only")
    private Double[] inputs;
    @NotNull(message = "Must not be null")
    @Size(min = 2, max = 2,  message = "Must be 2 values only")
    private String[] units;

    @NotBlank(message = "outputUnit is mandatory")
    private String outputUnit;


    public DistanceCalculatorRequest(Double[] inputs, String[] units, String outputUnit) {
        this.inputs = inputs;
        this.units = units;
        this.outputUnit = outputUnit;
    }

    public Double[] getInputs() {
        return inputs;
    }

    public void setInputs(Double[] inputs) {
        this.inputs = inputs;
    }

    public String[] getUnits() {
        return units;
    }

    public void setUnits(String[] units) {
        this.units = units;
    }

    public String getOutputUnit() {
        return outputUnit;
    }

    public void setOutputUnit(String outputUnit) {
        this.outputUnit = outputUnit;
    }
}
