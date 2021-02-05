package model;

public class Car {
	private int miles;
	private int year;
	private String make;
	private String model;
	private int cost;
	private String naitonallity;
	
	

	public Car() {
		super();
	}

	public Car(int miles, int year, String make, String model, int cost) {
		super();
		this.miles = miles;
		this.year = year;
		this.make = make;
		this.model = model;
		this.cost = cost;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String getNaitonallity() {
		return naitonallity;
	}

	public void setNaitonallity(String naitonallity) {
		this.naitonallity = naitonallity;
	}

	@Override
	public String toString() {
		return "Car [miles=" + miles + ", year=" + year + ", make=" + make + ", model=" + model + ", cost=" + cost
				+ "]";
	}
	
	
	
	

}
