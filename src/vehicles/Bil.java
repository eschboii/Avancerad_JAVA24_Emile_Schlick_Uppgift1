package vehicles;

public class Bil extends Vehicle implements Rentable{

    public Bil(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra, int lager) {
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
