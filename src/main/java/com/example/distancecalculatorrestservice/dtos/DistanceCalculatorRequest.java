package com.example.distancecalculatorrestservice.dtos;

public class DistanceCalculatorRequest {
    private double firstInput;
    private double secondInput;
    private String firstUnit;
    private String secondUnit;
    private String outputUnit;

    public DistanceCalculatorRequest(double firstInput, double secondInput, String firstUnit, String secondUnit, String outputUnit) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;
        this.firstUnit = firstUnit;
        this.secondUnit = secondUnit;
        this.outputUnit = outputUnit;
    }

    public double getFirstInput() {
        return firstInput;
    }

    public void setFirstInput(double firstInput) {
        this.firstInput = firstInput;
    }

    public double getSecondInput() {
        return secondInput;
    }

    public void setSecondInput(double secondInput) {
        this.secondInput = secondInput;
    }

    public String getFirstUnit() {
        return firstUnit;
    }

    public void setFirstUnit(String firstUnit) {
        this.firstUnit = firstUnit;
    }

    public String getSecondUnit() {
        return secondUnit;
    }

    public void setSecondUnit(String secondUnit) {
        this.secondUnit = secondUnit;
    }

    public String getOutputUnit() {
        return outputUnit;
    }

    public void setOutputUnit(String outputUnit) {
        this.outputUnit = outputUnit;
    }
}
