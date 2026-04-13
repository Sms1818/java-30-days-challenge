
import java.util.ArrayList;
import java.util.List;

/*
Problem

Design a Vehicle Rental System.

A company rents different types of vehicles:

Car
Bike
Truck

Each vehicle should have:

vehicleNumber
a method:
double calculateRent(int days)
Rules
Car rent = 2000 * days
Bike rent = 500 * days
Truck rent = 5000 * days
Extra requirement

Every vehicle should also have a common method:

void showDetails()

that prints:

Vehicle Number: XXX
In main
Store different vehicles in a single collection
For each vehicle:
show details
print rent for 3 days
*/

// Solution: My intuition was to use an abstract class Vehicle which will have a common property vehicleNumber and an abstract method calculateRent() which will be implemented by the classes Car, Bike and Truck. Each class will provide its own implementation of the calculateRent() method to calculate the rent based on the given rules. It will call the parent class constructor to initialize the vehicleNumber property and override the calculateRent() method to provide the specific rent calculation logic for each vehicle type. The showDetails() method will be implemented in the Vehicle class to print the vehicle number. In the main method, we will create objects of each vehicle type, store them in a collection and loop through them to show their details and print their rent for 3 days.

// Output:
// Vehicle Number: CAR123
// Rent for 3 days: 6000.0

// Vehicle Number: BIKE456
// Rent for 3 days: 1500.0

// Vehicle Number: TRUCK789
// Rent for 3 days: 15000.0

abstract class Vehicle{
    private String vehicleNumber;
    public Vehicle(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public abstract double calculateRent(int days);
    public void showDetails(){
        System.out.println("Vehicle Number: "+getVehicleNumber());
    }
    public final double getRent(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("Days must be positive");
        }
        return calculateRent(days);
    }
}
class Car extends Vehicle{
    public Car(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public double calculateRent(int days) {
        return 2000*days;
    }
}
class Bike extends Vehicle{
    public Bike(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public double calculateRent(int days) {
        return 500*days;
    }
}
class Truck extends Vehicle{
    public Truck(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public double calculateRent(int days) {
        return 5000*days;
    }
}
public class VehicleRentalSystemDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123"));
        vehicles.add(new Bike("BIKE456"));
        vehicles.add(new Truck("TRUCK789"));

        for(Vehicle v : vehicles){
            v.showDetails();
            System.out.println("Rent for 3 days: "+v.getRent(3));
            System.out.println();
        }

    }
}
