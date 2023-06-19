package com.example.distancecalculatorrestservice;

import com.example.distancecalculatorrestservice.utils.DistanceUnitConversion;
import com.example.distancecalculatorrestservice.utils.MathUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DistanceCalculatorRestServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void whenConvertingFromYardsToMeter_thenConversionMustBeValid(){
		assertEquals(DistanceUnitConversion.convert("meter", 1, "yards"), 1.0936132983377);
	}

	@Test
	void whenConvertingFromMeterToYard_thenConversionMustBeValid(){
		assertEquals(DistanceUnitConversion.convert("yards", 1, "meter"), 0.9144);
	}

	@Test
	void whenAddingSumOfAListOfDouble_thenTheSumMustBeValid() {
		List<Double> list = Arrays.asList(1.38, 2.56, 4.3);
		assertEquals(MathUtils.sum(list), 8.24);

	}


}
