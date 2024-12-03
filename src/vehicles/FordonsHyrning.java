package vehicles;

public class FordonsHyrning {

    private FordonsLager fordonsLager;
    private Kund kund;

    public FordonsHyrning(FordonsLager fordonsLager, Kund kund) {
        this.fordonsLager = fordonsLager;
        this.kund = kund;
    }

    public void hyrFordon (int fordonsVal, String fordon) {
        int raknare = 1;
        Vehicle valtFordon = null;


        for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
            if (fordon.equals("Bil") && vehicle instanceof Bil) {
                if (raknare == fordonsVal) {
                    valtFordon = vehicle;
                    break;
                }
                raknare++;

            } else if (fordon.equals("Motorcykel") && vehicle instanceof Motorcykel) {
                if (raknare == fordonsVal) {
                    valtFordon = vehicle;
                    break;
                }
                raknare++;

            } else if (fordon.equals("Traktor") && vehicle instanceof Traktor) {
                if (raknare == fordonsVal) {
                    valtFordon = vehicle;
                    break;
                }
                raknare++;
            }
        }

        if (valtFordon != null) {
            laggTillFordonTillKundHyrd(valtFordon);
            taBortFordonFranLager(valtFordon);

            System.out.println("Fordon valt: " + valtFordon);
        } else {
            System.out.println("Ogiltigt val, ingen bil valdes.");
        }
    }

    private void laggTillFordonTillKundHyrd(Vehicle vehicle) {
        if (vehicle instanceof Bil) {
            kund.laggTillFordonPaHyrd(vehicle);
        } else if (vehicle instanceof Motorcykel) {
            kund.laggTillFordonPaHyrd(vehicle);
        } else if (vehicle instanceof Traktor) {
            kund.laggTillFordonPaHyrd(vehicle);
        }
    }

    private void taBortFordonFranLager(Vehicle vehicle) {
        fordonsLager.taBortFordonFranLager(vehicle);
    }
}

