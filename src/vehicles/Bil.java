package vehicles;

public class Bil extends Vehicle implements Rentable{

    public Bil(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra) {
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
