package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Car;
import model.CarDealershipCentralSystem;

public class TestTotalCost {
	Car car = new Car();
	CarDealershipCentralSystem dealerSystem = new CarDealershipCentralSystem();

	@Test
	public void testTotalCost() {
		car.setCost(8000);
		car.setMiles(55000);
		int totalCost = dealerSystem.totalValue(car);
		assertEquals(totalCost, 11500);
	}
	
}
