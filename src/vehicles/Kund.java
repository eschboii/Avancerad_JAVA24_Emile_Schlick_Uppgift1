package vehicles;

import java.util.ArrayList;

public class Kund {
    private ArrayList<Vehicle> bilLager = new ArrayList<>();
    private ArrayList<Vehicle> motorcykelLager = new ArrayList<>();
    private ArrayList<Vehicle> traktorLager = new ArrayList<>();

    // Method to add the rented vehicle to the appropriate list
    public void addVehicleToRental(Vehicle vehicle) {
        if (vehicle instanceof Bil) {
            bilLager.add(vehicle);
        } else if (vehicle instanceof Motorcykel) {
            motorcykelLager.add(vehicle);
        } else if (vehicle instanceof Traktor) {
            traktorLager.add(vehicle);
        }
    }

    // Getter methods for each type of rented vehicle
    public ArrayList<Vehicle> getBilLager() {
        return bilLager;
    }
    public ArrayList<Vehicle> getMotorcykelLager() {
        return motorcykelLager;
    }
    public ArrayList<Vehicle> getTraktorLager() {
        return traktorLager;
    }
}

