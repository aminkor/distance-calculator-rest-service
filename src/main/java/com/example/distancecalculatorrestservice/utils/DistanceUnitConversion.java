package com.example.distancecalculatorrestservice.utils;

public final class DistanceUnitConversion {
    private DistanceUnitConversion(){}

    public static double convert(String fromUnit, double fromInput, String toUnit) {
        double converted = 0.00;
        if (fromUnit.equals("meter")) {
            if (toUnit.equals("yards")) {
                // yard constant
                converted = fromInput * 1.0936132983377;
            }
        }
        else if (fromUnit.equals("yards")) {
                // meter constant
                converted = fromInput * 0.9144;
        }
        else {
            return 0.00;
        }
        return converted;
    }
}
