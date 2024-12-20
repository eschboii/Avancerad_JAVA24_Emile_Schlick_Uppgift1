package vehicles;

import java.util.ArrayList;

public class FordonsLager {
    ArrayList<Vehicle> fordonsLagerLista = new ArrayList<>();

    public FordonsLager() {
        setLagerSaldo();
    }

    private void setLagerSaldo(){
        Bil.laggTillBilTillLager(this);
        Motorcykel.laggTillMotorcykelTillLager(this);
        Traktor.laggTillTraktorTillLager(this);
    }

    public void sattVehicleTillLager(Vehicle vehicle){
        fordonsLagerLista.add(vehicle);
    }

    public void taBortFordonFranLager(Vehicle vehicle) {
        fordonsLagerLista.remove(vehicle);
    }

    public ArrayList<Vehicle> getLagerSaldo() {
        return fordonsLagerLista;
    }

    private int vehiclesILagerPerTyp(Class<? extends Vehicle> vehicleTyp) {
        int antal = 0;
        for (Vehicle vehicle : fordonsLagerLista) {
            if (vehicleTyp.isInstance(vehicle)) {
                antal++;
            }
        }
        return antal;
    }

    public int getBilLager() {
        return vehiclesILagerPerTyp(Bil.class);
    }

    public int getMotorcykelLager() {
        return vehiclesILagerPerTyp(Motorcykel.class);
    }

    public int getTraktorLager() {
        return vehiclesILagerPerTyp(Traktor.class);
    }
}
