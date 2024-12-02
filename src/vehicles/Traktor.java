package vehicles;

public class Traktor extends Vehicle implements Rentable {

    public Traktor(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra) {
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
