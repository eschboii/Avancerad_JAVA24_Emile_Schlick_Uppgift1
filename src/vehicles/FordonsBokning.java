package vehicles;
import java.util.Scanner;

public class FordonsBokning {

    FordonsLager fordonsLager = new FordonsLager();
    Kund kund = new Kund(0,0,0);

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
            System.out.println("1. Välj fordon");
            System.out.println("2. Lämna tillbaka fordon");
            System.out.println("3. Kvitto");
            System.out.println("4. Avsluta med kvitto");

            scanningInt();
            bokningsAlterntiv(getVal());

        }
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

        scanningInt ();
        fordonsAlternativ(getVal());
    }

    private void aterlamnaFordonUI (int antalBil, int antalMotorcykel, int antalTraktor){
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
    }

    private void bokningsAlterntiv(int val){
        switch (val) {
            case 1: hyrFordonUI();
                break;
                case 2: aterlamnaFordonUI(kund.getBilLager(),kund.getMotorcykelLager(),kund.getTraktorLager());
                    break;
                    case 3: //anropaberakningsmetod
                        break;
            case 4: setBokning(false);
                scan.close();//anropaberakningsmetod
        }
    }

    private void fordonsAlternativ(int val){
        setBokning(false);
        switch (val) {
            case 1:
                for (Vehicle vehicle : fordonsLager.getLagerSaldo()){
                    System.out.println(vehicle);
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: viBokarFordon();
        }
    }

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

    private void scanningInt (){
        while (!scan.hasNextInt()) {
            System.out.println("Var vänlig och välj mellan alternativen 1, 2, 3 och 4");
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
