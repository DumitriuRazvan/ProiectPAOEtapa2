package proiect.prb;

abstract public class Curier {
    protected Integer minuteDeplasare;
    protected String numeCurier;

    public Integer calculeazaMinute(Comanda c){
        return 0;
    }

    public Integer getMinuteDeplasare() {
        return minuteDeplasare;
    }

    public void setMinuteDeplasare(Integer minuteDeplasare) {
        this.minuteDeplasare = minuteDeplasare;
    }

    public String getNumeCurier() {
        return numeCurier;
    }

    public void setNumeCurier(String numeCurier) {
        this.numeCurier = numeCurier;
    }
}



