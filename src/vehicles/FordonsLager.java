package vehicles;

import java.util.ArrayList;

public class FordonsLager {
    ArrayList<Vehicle> fordonsLagerLista = new ArrayList<>();

    public FordonsLager() {
        setLagerSaldo();
    }

    private void setLagerSaldo(){
        fordonsLagerLista.add(new Bil("Bil", "Volvo", "V70", "ABC123", 600));
        fordonsLagerLista.add(new Bil("Bil", "Peugeot", "207", "CBA321", 6969));
        fordonsLagerLista.add(new Bil("Bil", "Mazda", "626", "DEF456", 100));
        fordonsLagerLista.add(new Bil("Bil", "Tesla", "Model S", "FED654", 1));

        fordonsLagerLista.add(new Motorcykel("Motorcykel", "Suzuki", "GSX-8R", "SUP111", 400));
        fordonsLagerLista.add(new Motorcykel("Motorcykel", "Yamaha", "Hyper naked", "PUS420", 322));

        fordonsLagerLista.add(new Traktor("Traktor", "John Deere", "9 series", "FAM241", 600));
    }

    public ArrayList<Vehicle> getLagerSaldo() {
        return fordonsLagerLista;
    }

    public int getBilLager(){
        int antal = 0;
        for (Vehicle vehicle : fordonsLagerLista) {
            if (vehicle instanceof Bil) {
                antal++;
            }
        }
        return antal;
    }

    public int getMotorcykelLager(){
        int antal = 0;
        for (Vehicle vehicle : fordonsLagerLista) {
            if (vehicle instanceof Motorcykel) {
                antal++;
            }
        }
        return antal;

    }
    public int getTraktorLager(){
        int antal = 0;
        for (Vehicle vehicle : fordonsLagerLista) {
            if (vehicle instanceof Traktor) {
                antal++;
            }
        }
        return antal;

    }




}
