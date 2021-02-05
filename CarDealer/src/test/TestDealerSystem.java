package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Car;
import model.CarDealershipCentralSystem;

public class TestDealerSystem {
	CarDealershipCentralSystem dealerSystem = new CarDealershipCentralSystem();
	Car car = new Car();

	
	@Test
	public void testTuneUp() {
		car.setYear(2012);
		String message = "The car should be in good conditions";
		String message2 = dealerSystem.tuneUp(car);
		
		
		assertEquals(message, message2);
	}
	
	@Test
	public void testNationality() {
		String make = "Ford";
		car.setMake(make);
		String carOrigin = dealerSystem.nationallity(car);
		String nationallity = "American";
		
		assertEquals(nationallity, carOrigin);
		
		
	}

}
