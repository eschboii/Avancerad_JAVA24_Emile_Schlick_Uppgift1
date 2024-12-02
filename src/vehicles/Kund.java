package vehicles;

public class Kund {
    private int bilLager;
    private int motorcykelLager;
    private int traktorLager;



    public Kund(int bilLager, int motorcykelLager, int traktorLager) {
        this.bilLager = bilLager;
        this.motorcykelLager = motorcykelLager;
        this.traktorLager = traktorLager;
        setBillager();
    }

    private int setBillager(){
        return bilLager;
    }

    public int getBilLager() {
        return bilLager;
    }

    public int getMotorcykelLager() {
        return motorcykelLager;
    }

    public int getTraktorLager() {
        return traktorLager;
    }



    //Kundens totala hyrningskostnad, kundens hyrda fordon, kunna lamna tillbaka valt fordon, hur många dagar som kunden vill hyra ett fordon
}
