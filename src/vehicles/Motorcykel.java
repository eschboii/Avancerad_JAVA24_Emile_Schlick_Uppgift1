package vehicles;

public class Motorcykel extends Vehicle implements Rentable{

    public Motorcykel(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra) {
        super(fordonsTyp, fordonsMarke, fordonsModell, regNr, dagsHyra);
    }

    public static void laggTillMotorcykelTillLager(FordonsLager lager) {
        Motorcykel mc1 = new Motorcykel("Motorcykel", "Suzuki", "GSX-8R", "SUP111", 400);
        Motorcykel mc2 = new Motorcykel("Motorcykel", "Yamaha", "Hyper naked", "PUS420", 322);
        lager.sattVehicleTillLager(mc1);
        lager.sattVehicleTillLager(mc2);
    }


    @Override
    public void hyraFordon() {

    }

    @Override
    public void aterlamnaFordon() {

    }

    @Override
    public void beraknaKostnad() {

    }
}