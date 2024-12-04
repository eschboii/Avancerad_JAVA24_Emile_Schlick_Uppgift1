package vehicles;

public abstract class Vehicle {
    String fordonsTyp;
    String fordonsMarke;
    String fordonsModell;
    String regNr;
    int dagsHyra;

    public Vehicle(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra) {
        this.fordonsTyp = fordonsTyp;
        this.fordonsMarke = fordonsMarke;
        this.fordonsModell = fordonsModell;
        this.regNr = regNr;
        this.dagsHyra = dagsHyra;
    }

    public String toString() {
        return String.format("%s: %s %s - RegNr: %s, DagsHyra: %d SEK",
                fordonsTyp, fordonsMarke, fordonsModell, regNr, dagsHyra);
    }
}



