package com.example.distancecalculatorrestservice.utils;

import java.util.List;

public final class MathUtils {
    private MathUtils(){}

    public static double sum(List<Double> list) {
        double sum = 0;
        for (double i: list) {
            sum += i;
        }
        return sum;
    }
}
