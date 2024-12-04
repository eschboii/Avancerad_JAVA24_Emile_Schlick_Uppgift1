package vehicles;

public class FordonsHyrning implements Rentable{

    private FordonsLager fordonsLager;
    private Kund kund;

    public FordonsHyrning(FordonsLager fordonsLager, Kund kund) {
        this.fordonsLager = fordonsLager;
        this.kund = kund;
    }

    @Override
    public void hyraFordon (int fordonsVal, String fordon) {
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
            System.out.println();
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

    @Override
    public void aterlamnaFordon(Vehicle vehicle) {
        if (vehicle instanceof Bil) {
            kund.taBortBilFranKund(vehicle);
        } else if (vehicle instanceof Motorcykel) {
            kund.taBortMotorcykelFranKund(vehicle);
        } else if (vehicle instanceof Traktor) {
            kund.taBortTraktorFranKund(vehicle);
        }
    }

    @Override
    public void beraknaKostnad() {
        int totalKostnad = 0;

        for (Vehicle vehicle : kund.getTotaltLager()) {
            totalKostnad += vehicle.dagsHyra;
        }
        System.out.println("\nDen totala kostnaden för dina hyrda fordon är: " + totalKostnad + " SEK");
    }
}

