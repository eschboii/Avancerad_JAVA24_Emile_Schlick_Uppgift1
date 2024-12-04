import vehicles.FordonsBokning;

public class Main {
    public static void main(String[] args) {
        FordonsBokning fordonsBokning = new FordonsBokning();
        fordonsBokning.viBokarFordon();

        fordonsBokning.closeScanner();
        }
    }
