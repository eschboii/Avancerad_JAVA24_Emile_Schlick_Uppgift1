package vehicles;

public abstract class Vehicle {
    String fordonsTyp;
    String fordonsMarke;
    String fordonsModell;
    String regNr;

    int dagsHyra;
    int lager;

    public Vehicle(String fordonsTyp, String fordonsMarke, String fordonsModell, String regNr, int dagsHyra, int lager) {
        this.fordonsTyp = fordonsTyp;
        this.fordonsMarke = fordonsMarke;
        this.fordonsModell = fordonsModell;
        this.regNr = regNr;
        this.dagsHyra = dagsHyra;
        this.lager = lager;
    }

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
    public int getLager(){
        return lager;
    }


}



