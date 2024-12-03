package vehicles;

public interface Rentable {

    void hyraFordon(int fordonsVal, String fordon);
    void aterlamnaFordon(Vehicle vehicle);
    void beraknaKostnad();

    //metoder för att räkna ut hyra och returnera fordon + beräkna hyreskostnad

}
