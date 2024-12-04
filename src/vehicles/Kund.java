package vehicles;

import java.util.ArrayList;

public class Kund {
    private ArrayList<Vehicle> bilLager = new ArrayList<>();
    private ArrayList<Vehicle> motorcykelLager = new ArrayList<>();
    private ArrayList<Vehicle> traktorLager = new ArrayList<>();
    private ArrayList<Vehicle> totalaFordon = new ArrayList<>();

    public void laggTillFordonPaHyrd(Vehicle vehicle) {
        if (vehicle instanceof Bil) {
            bilLager.add(vehicle);
        } else if (vehicle instanceof Motorcykel) {
            motorcykelLager.add(vehicle);
        } else if (vehicle instanceof Traktor) {
            traktorLager.add(vehicle);
        }

        totalaFordon.add(vehicle);
    }

    public void taBortBilFranKund(Vehicle vehicle) {
        bilLager.remove(vehicle);
        totalaFordon.remove(vehicle);
    }

    public void taBortMotorcykelFranKund(Vehicle vehicle) {
        motorcykelLager.remove(vehicle);
        totalaFordon.remove(vehicle);
    }

    public void taBortTraktorFranKund(Vehicle vehicle) {
        traktorLager.remove(vehicle);
        totalaFordon.remove(vehicle);
    }

    public ArrayList<Vehicle> getBilLager() {
        return bilLager;
    }
    public ArrayList<Vehicle> getMotorcykelLager() {
        return motorcykelLager;
    }
    public ArrayList<Vehicle> getTraktorLager() {
        return traktorLager;
    }

    public ArrayList<Vehicle> getTotaltLager() {
        return totalaFordon;
    }
}

