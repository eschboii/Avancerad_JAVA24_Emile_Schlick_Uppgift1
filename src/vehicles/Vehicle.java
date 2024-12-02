package vehicles;

public abstract class Vehicle {
    String fordonsTyp;
    String fordonsMarke;
    String fordonsModell;
    String regNr;

    int dagsHyra;
    int forseningsTillagg;

    public Vehicle(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra, int forseningsTillagg) {
        this.fordonsTyp = fordonsTyp;
        this.fordonsMarke = fordonsMarke;
        this.fordonsModell = fordonsModell;
        this.regNr = regNr;
        this.dagsHyra = dagsHyra;
        this.forseningsTillagg = forseningsTillagg;
    }

    abstract double totalHyreskostnad();

    public String getFordonstyp(){
        return fordonsTyp;
    }

    public String getFordonsMarke(){
        return fordonsMarke;
    }
    public String getFordonsModell(){
        return fordonsModell;
    }
    public String getRegNr(){
        return regNr;
    }
    public int getDagsHyra(){
        return dagsHyra;
    }
    public int getForseningsTillagg(){
        return forseningsTillagg;
    }


}



