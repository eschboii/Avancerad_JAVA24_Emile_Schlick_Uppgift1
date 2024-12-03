package vehicles;
import java.util.ArrayList;
import java.util.Scanner;

public class FordonsBokning {

    FordonsLager fordonsLager = new FordonsLager();
    Kund kund = new Kund();

    private boolean bokaFordon;
    private int val;

    Scanner scan = new Scanner(System.in);

    public FordonsBokning() {
        setBokning(true);
        viBokarFordon();
    }

    public void viBokarFordon() {
        while (isBokning()) {
            System.out.println("Hej, välkommen till Emiles fordonsbokning!");
            System.out.println("Var vänlig välj ett av alternativen");
            System.out.println();
            System.out.println("1. Välj mellan fordonsalternativen!");
            System.out.println("2. Lämna tillbaka fordon");
            System.out.println("3. Kvitto");
            System.out.println("4. Avsluta med kvitto");

            scanningInt();
            bokningsAlterntiv();
        }
    }

    private void bokningsAlterntiv(){
        switch (getVal()) {
            case 1: hyrFordonUI();
                break;
            case 2: aterlamnaFordonUI(kund.getTotaltLager());
                break;
            case 3: kvittoUI();
                break;
            case 4: setBokning(false);
                scan.close();
        }
    }

    private void kvittoUI(){
        System.out.println("Kvitto: Ditt hyresavtal");

        System.out.println("\nHyrda bilar:");
        ArrayList<Vehicle> bilLager = kund.getBilLager();
        if (bilLager.isEmpty()) {
            System.out.println("Inga bilar hyrda.");
        } else {
            for (Vehicle vehicle : bilLager) {
                System.out.println(vehicle);
            }
        }

        System.out.println("\nHyrda motorcyklar:");
        ArrayList<Vehicle> motorcykelLager = kund.getMotorcykelLager();
        if (motorcykelLager.isEmpty()) {
            System.out.println("Inga motorcyklar hyrda.");
        } else {
            for (Vehicle vehicle : motorcykelLager) {
                System.out.println(vehicle);
            }
        }

        System.out.println("\nHyrda traktorer:");
        ArrayList<Vehicle> traktorLager = kund.getTraktorLager();
        if (traktorLager.isEmpty()) {
            System.out.println("Inga traktorer hyrda.");
        } else {
            for (Vehicle vehicle : traktorLager) {
                System.out.println(vehicle);
            }
        }

        System.out.println("\nTotal kostnad:");
        System.out.println();

        // Optional: Display any other information (e.g., total cost, etc.)
        System.out.println("\nTack, hyr gärna fler fordon!");
        System.out.println();
    }

    private void hyrFordonUI (){
        System.out.println("Du kan välja mellan dessa fordon");
        System.out.printf("1. Bil, lagersaldo: %d", fordonsLager.getBilLager());
        System.out.println();
        System.out.printf("2. Motorcykel, lagersaldo: %d", fordonsLager.getMotorcykelLager());
        System.out.println();
        System.out.printf("3. Traktor, lagersaldo: %d", fordonsLager.getTraktorLager());
        System.out.println();
        System.out.println("4. Tillbaka");

        scanningInt();
        fordonsAlternativ();
    }

    private void fordonsAlternativ() {
        setBokning(false);
        switch (val) {
            case 1: bilarPaLager();
                break;

            case 2:motorcykelPaLager();
                break;

            case 3: traktorPaLager();
                break;
            case 4:
                setBokning(true);
                viBokarFordon();
                break;
            default:
                System.out.println("Ogiltigt val, försök igen.");
                break;
        }
    }

    private void bilarPaLager (){
        System.out.println("Tillgängliga bilar:");
        int raknare = 1;
        for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
            if (vehicle instanceof Bil) {
                System.out.println(raknare + ". " + vehicle);
                raknare++;
            }
        }

        System.out.println(raknare + ". Tillbaka");

        scanningInt();

        if (getVal() == 5) {
            hyrFordonUI();
        } else {
            FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
            fordonsHyrning.hyraFordon(getVal(), "Bil");
        }

        hyrFordonUI ();

    }

    private void motorcykelPaLager(){
        System.out.println("Tillgängliga Motorcyklar:");
        int raknare = 1;
        for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
            if (vehicle instanceof Motorcykel) {
                System.out.println(raknare + ". " + vehicle);
                raknare++;
            }
        }
        System.out.println(raknare + ". Tillbaka");

        scanningInt();

        if (getVal() == 3){
            hyrFordonUI();
        } else {
            FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
            fordonsHyrning.hyraFordon(getVal(), "Motorcykel");
        }

        hyrFordonUI ();
    }

    private void traktorPaLager(){
        System.out.println("Tillgängliga Traktorer:");
        int raknare = 1;
        for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
            if (vehicle instanceof Traktor) {
                System.out.println(raknare + ". " + vehicle);
                raknare++;
            }
        }
        System.out.println(raknare + ". Tillbaka");

        scanningInt();

        if (getVal() == 2){
            hyrFordonUI();
        } else {
            FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
            fordonsHyrning.hyraFordon(getVal(), "Traktor");
        }

        hyrFordonUI ();
    }

   private void aterlamnaFordonUI (ArrayList<Vehicle> hyrdaFordon){
        System.out.println("Vilken av dina fordon vill du lämna tillbaka?");
        int raknare = 1;

       for (Vehicle hyrdaFordons : hyrdaFordon) {
           System.out.println(raknare + ". " + hyrdaFordons);
           raknare++;
       }

       System.out.println(raknare + ". Tillbaka");

       scanningInt();
       //if
       aterlamnaFordonsAlternativ(hyrdaFordon);
    }

    private void aterlamnaFordonsAlternativ(ArrayList<Vehicle> hyrdaFordon){
        switch (getVal()) {
            case 1: FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);

               // fordonsHyrning.aterlamnaFordon(Bil);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: viBokarFordon();
        }
    }

    private void scanningInt (){
        while (!scan.hasNextInt()) {
            System.out.println("Var vänlig och välj ett tal mellan alternativen");
            scan.next();
            System.out.println();
        }
        val = scan.nextInt();
        setVal(val);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public boolean isBokning() {
        return bokaFordon;
    }

    private void setBokning(boolean bokaFordon) {
        this.bokaFordon = bokaFordon;
    }
}
