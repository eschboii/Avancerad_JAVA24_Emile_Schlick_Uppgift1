package vehicles;

public class Traktor extends Vehicle{

    public Traktor(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra) {
        super(fordonsTyp, fordonsMarke, fordonsModell, regNr, dagsHyra);
    }

    public static void laggTillTraktorTillLager(FordonsLager lager) {
        Traktor traktor1 = new Traktor("Traktor","John Deere", "9 series", "FAM241", 600);
        lager.sattVehicleTillLager(traktor1);
    }
}
