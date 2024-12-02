package vehicles;
import java.util.Scanner;

public class FordonsBokning {
    private boolean bokaFordon;
    private int val;
    Scanner scan = new Scanner(System.in);

    public FordonsBokning() {
        setBokning(true);
        viBokarFordon();
    }

    public void viBokarFordon() {
        while (bokaFordon) {
            System.out.println("Hej, välkommen till Emiles fordonsbokning!");
            System.out.println("Var vänlig välj ett av alternativen");
            System.out.println();
            System.out.println("1. Välj fordon");
            System.out.println("2. Lämna tillbaka fordon");
            System.out.println("3. Avsluta med kvitto");

            if (scan.hasNextInt()) {
                val = scan.nextInt();
                setVal(val);

            } else {
                System.out.println("Var vänlig och välj mellan alternativen 1, 2 och 3");
                scan.nextLine();
                System.out.println();
            }

            if (val == 3) {
                setBokning(false);
            }
        }
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

    public void setBokning(boolean bokaFordon) {
        this.bokaFordon = bokaFordon;
    }
}
