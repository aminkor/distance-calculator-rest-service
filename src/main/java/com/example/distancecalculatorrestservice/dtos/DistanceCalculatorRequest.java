package com.example.distancecalculatorrestservice.dtos;

public class DistanceCalculatorRequest {
    private double[] inputs;
    private String[] units;
    private String outputUnit;


    public DistanceCalculatorRequest(double[] inputs, String[] units, String outputUnit) {
        this.inputs = inputs;
        this.units = units;
        this.outputUnit = outputUnit;
    }

    public double[] getInputs() {
        return inputs;
    }

    public void setInputs(double[] inputs) {
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
