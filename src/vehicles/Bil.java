package vehicles;

public class Bil extends Vehicle{

    public Bil(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra) {
        super(fordonsTyp, fordonsMarke, fordonsModell, regNr, dagsHyra);
    }

    public static void laggTillBilTillLager(FordonsLager lager) {
        Bil bil1 = new Bil("Bil","Volvo", "V70", "ABC123", 600);
        Bil bil2 = new Bil("Bil", "Peugeot", "207", "CBA321", 6969);
        Bil bil3 = new Bil("Bil", "Mazda", "626", "DEF456", 100);
        Bil bil4 = new Bil("Bil", "Tesla", "Model S", "FED654", 1);
        lager.sattVehicleTillLager(bil1);
        lager.sattVehicleTillLager(bil2);
        lager.sattVehicleTillLager(bil3);
        lager.sattVehicleTillLager(bil4);
    }
}