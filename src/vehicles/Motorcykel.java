package vehicles;

public class Motorcykel extends Vehicle implements Rentable{

    public Motorcykel(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra, int lager) {
        super(fordonsTyp, fordonsMarke, fordonsModell, regNr, dagsHyra, lager);
    }

    @Override
    public void hyraFord() {

    }

    @Override
    public void aterlamnaFordon() {

    }

    @Override
    public void beraknaKostnad() {

    }

}
