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
            case 2: //aterlamnaFordonUI(kund.getBilLager(),kund.getMotorcykelLager(),kund.getTraktorLager());
                break;
            case 3: kvittoUI();
                break;
            case 4: setBokning(false);
                scan.close();
        }
    }

    private void kvittoUI(){
        System.out.println("Kvitto: Ditt hyresavtal");

        System.out.println("\nTillgängliga bilar:");
        ArrayList<Vehicle> bilLager = kund.getBilLager();
        if (bilLager.isEmpty()) {
            System.out.println("Inga bilar hyrda.");
        } else {
            for (Vehicle vehicle : bilLager) {
                System.out.println(vehicle);
            }
        }

        // Print the rented motorcycles
        System.out.println("\nTillgängliga motorcyklar:");
        ArrayList<Vehicle> motorcykelLager = kund.getMotorcykelLager();
        if (motorcykelLager.isEmpty()) {
            System.out.println("Inga motorcyklar hyrda.");
        } else {
            for (Vehicle vehicle : motorcykelLager) {
                System.out.println(vehicle);
            }
        }

        System.out.println("\nTillgängliga traktorer:");
        ArrayList<Vehicle> traktorLager = kund.getTraktorLager();
        if (traktorLager.isEmpty()) {
            System.out.println("Inga traktorer hyrda.");
        } else {
            for (Vehicle vehicle : traktorLager) {
                System.out.println(vehicle);
            }
        }

        // Optional: Display any other information (e.g., total cost, etc.)
        System.out.println("\nTack för din hyra!");
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
            fordonsHyrning.hyrFordon(getVal(), "Bil");
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
            fordonsHyrning.hyrFordon(getVal(), "Motorcykel");
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
            fordonsHyrning.hyrFordon(getVal(), "Traktor");
        }

        hyrFordonUI ();
    }

   /* private void aterlamnaFordonUI (ArrayList antalBil, ArrayList antalMotorcykel, ArrayList antalTraktor){
        System.out.println("Vilken av dina fordon vill du lämna tillbaka?");

        if (antalBil > 0) {
            System.out.printf("1. Bil %d", kund.getBilLager());
            System.out.println();
        } else if (antalMotorcykel > 0) {
            System.out.printf("2. Motorcykel %d", kund.getMotorcykelLager());
            System.out.println();
        } else if (antalTraktor > 0) {
            System.out.printf("3. Traktor %d", kund.getTraktorLager());
            System.out.println();
        }

        System.out.println("4. Tillbaka");

        scanningInt();
        aterlamnaFordonsAlternativ(getVal());
    }*/

    private void aterlamnaFordonsAlternativ(int val){
        switch (val) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: viBokarFordon();
        }
    }

    private void hyrValtFordon(int val){
        switch (val) {
            case 1:
                break;
            case 2:
                break;
            case 3: hyrFordonUI();
                break;
            case 4:
            default:
                System.out.println("Ogiltigt val, försök igen.");
                break;
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
