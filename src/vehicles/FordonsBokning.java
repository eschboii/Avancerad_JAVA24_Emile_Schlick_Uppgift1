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
            System.out.println("3. Hyresavtal");
            System.out.println("4. Avsluta med kvitto");

            scanningInt();
            bokningsAlterntiv();
        }
    }

    private void bokningsAlterntiv() {
        switch (getVal()) {
            case 1:
                hyrFordonUI();
                break;
            case 2:
                aterlamnaFordonUI(kund.getTotaltLager());
                break;
            case 3:
                hyresavtalUI();
                break;
            case 4:
                System.out.println("Tack för att du hyr fordon hos Emiles fräsiga fordonsuthyrning");
                FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
                fordonsHyrning.beraknaKostnad();
                setBokning(false);
                break;
            default:
                System.out.println("Ogiltigt val, försök igen.");
                break;
        }
    }

    private void hyresavtalUI() {
        System.out.println("\nDitt hyresavtal:");

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

        FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
        fordonsHyrning.beraknaKostnad();

        System.out.println("\nTack, hyr gärna fler fordon!");
        System.out.println();
    }

    private void hyrFordonUI() {
        while (true) {
            System.out.println("Du kan välja mellan dessa fordon");
            System.out.printf("1. Bil, lagersaldo: %d\n", fordonsLager.getBilLager());
            System.out.printf("2. Motorcykel, lagersaldo: %d\n", fordonsLager.getMotorcykelLager());
            System.out.printf("3. Traktor, lagersaldo: %d\n", fordonsLager.getTraktorLager());
            System.out.println("4. Tillbaka");

            scanningInt();

            if (getVal() == 4) {
                viBokarFordon();
                break;
            } else if (getVal() >= 1 && getVal() <= 3) {
                fordonsAlternativ();
                break;
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    private void fordonsAlternativ() {
        switch (getVal()) {
            case 1:
                bilarPaLager();
                break;

            case 2:
                motorcykelPaLager();
                break;

            case 3:
                traktorPaLager();
                break;
            case 4:
                viBokarFordon();
                break;

            default:
                System.out.println("Ogiltigt val, försök igen.");
                hyrFordonUI();
                break;
        }
    }

    private void bilarPaLager() {
        int raknare = 1;

        while (true) {
            raknare = 1;
            System.out.println("Tillgängliga bilar:");

            ArrayList<Vehicle> tillgangligaBilar = new ArrayList<>();
            for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
                if (vehicle instanceof Bil) {
                    tillgangligaBilar.add(vehicle);
                    System.out.println(raknare + ". " + vehicle);
                    raknare++;
                }
            }

            if (tillgangligaBilar.isEmpty()) {
                System.out.println("Inga bilar tillgängliga.");
                System.out.println();
                hyrFordonUI();
                break;
            }

            System.out.println(raknare + ". Tillbaka");

            scanningInt();

            if (getVal() == raknare) {
                hyrFordonUI();
                break;
            } else if (getVal() > 0 && getVal() < raknare) {
                Vehicle valdBil = tillgangligaBilar.get(getVal() - 1);

                FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
                fordonsHyrning.hyraFordon(getVal(), "Bil");

                fordonsLager.taBortFordonFranLager(valdBil);

                System.out.println("Du har hyrt: " + valdBil);
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    private void motorcykelPaLager(){
        while (true) {
            int raknare = 1;
            System.out.println("Tillgängliga Motorcyklar:");

            ArrayList<Vehicle> tillgangligaMotorcyklar = new ArrayList<>();
            for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
                if (vehicle instanceof Motorcykel) {
                    tillgangligaMotorcyklar.add(vehicle);
                    System.out.println(raknare + ". " + vehicle);
                    raknare++;
                }
            }

            if (tillgangligaMotorcyklar.isEmpty()) {
                System.out.println("Inga motorcyklar tillgängliga.");
                System.out.println();
                hyrFordonUI();
                break;
            }

            System.out.println(raknare + ". Tillbaka");

            scanningInt();

            if (getVal() == raknare) {
                hyrFordonUI();
                break;
            } else if (getVal() > 0 && getVal() < raknare) {
                Vehicle valdMotorcykel = tillgangligaMotorcyklar.get(getVal() - 1);

                FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
                fordonsHyrning.hyraFordon(getVal(), "Motorcykel");

                fordonsLager.taBortFordonFranLager(valdMotorcykel);

                System.out.println("Du har hyrt: " + valdMotorcykel);
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    private void traktorPaLager(){
        while (true) {
            int raknare = 1;
            System.out.println("Tillgängliga Traktorer:");

            ArrayList<Vehicle> tillgangligaTraktorer = new ArrayList<>();
            for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
                if (vehicle instanceof Traktor) {
                    tillgangligaTraktorer.add(vehicle);
                    System.out.println(raknare + ". " + vehicle);
                    raknare++;
                }
            }

            if (tillgangligaTraktorer.isEmpty()) {
                System.out.println("Inga traktorer tillgängliga.");
                System.out.println();
                hyrFordonUI();
                break;
            }

            System.out.println(raknare + ". Tillbaka");

            scanningInt();

            if (getVal() == raknare) {
                hyrFordonUI();
                break;
            } else if (getVal() > 0 && getVal() < raknare) {

                Vehicle valdTraktor = tillgangligaTraktorer.get(getVal() - 1);

                FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
                fordonsHyrning.hyraFordon(getVal(), "Traktor");

                fordonsLager.taBortFordonFranLager(valdTraktor);

                System.out.println("Du har hyrt: " + valdTraktor);
            } else {
                System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

   private void aterlamnaFordonUI (ArrayList<Vehicle> hyrdaFordon){
       if (hyrdaFordon.isEmpty()) {
           System.out.println("Du har inga hyrda fordon att lämna tillbaka.");
           System.out.println();
           return;
       }

       System.out.println("Vilken av dina fordon vill du lämna tillbaka?");
       int raknare = 1;

       for (Vehicle hyrdaFordons : hyrdaFordon) {
           System.out.println(raknare + ". " + hyrdaFordons);
           raknare++;
       }

       System.out.println(raknare + ". Tillbaka");
       scanningInt();

       if (getVal() == raknare) {
           return;
       }

       aterlamnaFordonsAlternativ(hyrdaFordon);
    }

    private void aterlamnaFordonsAlternativ(ArrayList<Vehicle> hyrdaFordon){
        while (true) {
            int valtFordonsIndex = getVal() - 1;
            if (valtFordonsIndex >= 0 && valtFordonsIndex < hyrdaFordon.size()) {
                Vehicle aterlamnatFordon = hyrdaFordon.get(valtFordonsIndex);

                FordonsHyrning fordonsHyrning = new FordonsHyrning(fordonsLager, kund);
                fordonsHyrning.aterlamnaFordon(aterlamnatFordon);

                fordonsLager.sattVehicleTillLager(aterlamnatFordon);

                System.out.println("Du har lämnat tillbaka: " + aterlamnatFordon);
                System.out.println();
                break;
            } else {
                System.out.println("Ogiltigt val, försök igen.");
                scanningInt();
            }
        }
        aterlamnaFordonUI(hyrdaFordon);
    }

    private void scanningInt (){
        while (true) {
            if (scan.hasNextInt()) {
                val = scan.nextInt();
                scan.nextLine();
                setVal(val);
                break;
            } else {
                System.out.println("Var vänlig och välj ett tal mellan alternativen");
                scan.next();
            }
        }
    }

    public void closeScanner() {
        scan.close();
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
