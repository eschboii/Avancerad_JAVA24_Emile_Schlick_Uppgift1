package vehicles;

public class Motorcykel extends Vehicle implements Rentable{

    public Motorcykel(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra) {
        super(fordonsTyp, fordonsMarke, fordonsModell, regNr, dagsHyra);
    }

    @Override
    public void hyraFordon() {

    }

    @Override
    public void aterlamnaFordon() {

    }

    @Override
    public void beraknaKostnad() {

    }

}
