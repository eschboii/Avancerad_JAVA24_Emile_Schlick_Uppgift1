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

    public ArrayList<Vehicle> getLagerSaldo() {
        return fordonsLagerLista;
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

    private int vehiclesILagerPerTyp(Class<? extends Vehicle> vehicleTyp) {
        // Refererar till något som kan vara antingen Vehicle eller en subklass, t.ex bil
        int antal = 0;
        for (Vehicle vehicle : fordonsLagerLista) {
            if (vehicleTyp.isInstance(vehicle)) {
                antal++;
            }
        }
        return antal;
    }




}
