package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.ShippingVehicle;

public class ShipmentTest {

    
	@ParameterizedTest
	@CsvSource({
			"-1, -1, -1, -1",
            "-1, -1, 0, -1",
            "-1, -1, 100, -1",
            "-1, 0, -1, -1",
            "-1, 0, 0, -1",
            "-1, 0, 100, -1",
			"-1, 100, -1, -1",
            "-1, 100, 0, -1",
            "-1, 100, 100, -1",
            "0, -1, -1, -1",
            "0, -1, 0, -1",
            "0, -1, 100, -1",
			"0, 0, -1, -1",
            "0, 0, 0, 0:0:0",
            "0, 0, 100, 0:0:100",
            "0, 100, -1, -1", 
            "0, 100, 0, 0:100:0",
			"0, 100, 100, -1",
            "100, -1, -1, -1",
            "100, -1, 0, -1",
            "100, -1, 100, -1",
            "100, 0, -1, -1",
			"100, 0, 0, 100:0:0",
            "100, 0, 100, -1",
            "100, 100, -1, -1",
            "100, 100, 0, 100:100:0",
			"100, 100, 100, -1" })
	void testCalculate(int small, int medium, int large, String expected) {
		List<Integer> expectedList = "-1".equals(expected) ? List.of(-1)
				: Arrays.stream(expected.split(":")).map(Integer::parseInt).collect(Collectors.toList());

		ShippingVehicle box = new ShippingVehicle();
		List<Integer> actual = box.calculate(small, medium, large);
		assertEquals(expectedList, actual);
	}
}
