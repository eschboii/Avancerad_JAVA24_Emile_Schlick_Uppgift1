package vehicles;

public class FordonsHyrning {

    private FordonsLager fordonsLager;
    private Kund kund;

    // Constructor
    public FordonsHyrning(FordonsLager fordonsLager, Kund kund) {
        this.fordonsLager = fordonsLager;
        this.kund = kund;
    }

    // Method to rent a vehicle based on user choice
    public void hyrFordon (int fordonsVal) {
        int raknare = 1;
        Vehicle valtFordon = null;

        // Find the selected vehicle based on the user's input
        for (Vehicle vehicle : fordonsLager.getLagerSaldo()) {
            if (vehicle instanceof Bil) {
                if (raknare == fordonsVal) {
                    valtFordon = vehicle;  // Store the selected vehicle
                    break;
                }
                raknare++;
            }
        }

        // If a vehicle was selected, proceed with rental
        if (valtFordon != null) {
            // Add the selected vehicle to the customer's rented vehicles
            addVehicleToCustomerRental(valtFordon);

            // Remove the selected vehicle from FordonsLager stock
            removeVehicleFromStock(valtFordon);

            System.out.println("Fordon valt: " + valtFordon);
        } else {
            System.out.println("Ogiltigt val, ingen bil valdes.");
        }
    }

    // Method to add the vehicle to the customer's rental list
    private void addVehicleToCustomerRental(Vehicle vehicle) {
        if (vehicle instanceof Bil) {
            kund.addVehicleToRental(vehicle);  // Add the vehicle to the customer's bilLager
        } else if (vehicle instanceof Motorcykel) {
            kund.addVehicleToRental(vehicle);  // Add the vehicle to the customer's motorcykelLager
        } else if (vehicle instanceof Traktor) {
            kund.addVehicleToRental(vehicle);  // Add the vehicle to the customer's traktorLager
        }
    }

    // Method to remove the rented vehicle from FordonsLager stock
    private void removeVehicleFromStock(Vehicle vehicle) {
        fordonsLager.taBortFordonFranLager(vehicle);  // Remove the vehicle from stock
    }
}

