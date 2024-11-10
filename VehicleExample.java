
public class VehicleExample {

	public VehicleExample() {
		
	}

	public static void main(String[] args) {
		
		Vehicle VehcOne = new Car();
		Vehicle VehcTwo = new Motorcycle();
		
		System.out.println("Car has: " + VehcOne.getWheels() + " wheels.");
		System.out.println("Motorcycle has: " + VehcTwo.getWheels() + " wheels.");

	}

}
