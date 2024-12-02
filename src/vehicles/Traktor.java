package vehicles;

public class Traktor extends Vehicle implements Rentable {

    public Traktor(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra, int lager) {
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
