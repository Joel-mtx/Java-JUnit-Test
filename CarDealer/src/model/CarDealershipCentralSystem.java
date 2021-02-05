package model;

import java.util.ArrayList;

public class CarDealershipCentralSystem {
	
	public int totalValue(Car car) {
			
			int maxMiles = 100000;
			int profit = 2000;
			int maxProfit = 3500;
			
		if(car.getMiles() < maxMiles) {
			 car.setCost(car.getCost() + maxProfit);
			
		}else {
			car.setCost(car.getCost() + profit);
		}
		return car.getCost();	
		}
	
	public String tuneUp(Car car) {
		int goodYear = 2010;
		String message = "The car will need a service check up";
		String newerMessage = "The car should be in good conditions";
		
		if(car.getYear() < goodYear) {
			return message;
		}else {
			return newerMessage;
		}
	}
	
	public String nationallity(Car car) {
		ArrayList<String> nationals = new ArrayList<String>();
		ArrayList<String> foreigners = new ArrayList<String>();
		
		String national = "American";
		String foreign = "Foreing";
		
		nationals.add("Ford");
		nationals.add("Chevrolet");
		
		foreigners.add("Toyota");
		foreigners.add("Volks Wagen");
		
		if(car.getMake().equals(nationals.get(0)) || car.getMake().equals(nationals.get(1))) {
			return national;
		}else {
			return foreign;
	
		}
}
}

