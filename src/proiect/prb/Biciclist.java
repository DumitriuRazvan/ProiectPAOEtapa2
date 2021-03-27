package proiect.prb;

public class Biciclist extends Curier{
    private String modelBicicleta;


    Biciclist(){
        modelBicicleta = "MTB";
    }

    public Biciclist(String numeCurier, String modelBicicleta) {
        this.modelBicicleta = modelBicicleta;
        this.numeCurier = numeCurier;
    }

    @Override
    public Integer calculeazaMinute(Comanda c){
        if(c.getLocal() instanceof Restaurant)
        {
            int nrBucatiTotal = c.getNrBucatiMancare()  + c.getNrBucatiDesert() + c.getNrBucatiBautura();
            if(nrBucatiTotal <= 10)
                minuteDeplasare = 30;
            else if(nrBucatiTotal <= 20)
                minuteDeplasare = 40;
            else if(nrBucatiTotal <= 30)
                minuteDeplasare = 50;
        }
        else if(c.getLocal() instanceof Bar) {
            int nrBucatiTotal = c.getNrBucatiDesert() + c.getNrBucatiBautura();
            if(nrBucatiTotal <= 10)
                minuteDeplasare = 30;
            else if(nrBucatiTotal <= 20)
                minuteDeplasare = 40;
            else if(nrBucatiTotal <= 30)
                minuteDeplasare = 50;
        }
        return minuteDeplasare;
    }

    public String getModelBicicleta() {
        return modelBicicleta;
    }

    public void setModelBicicleta(String modelBicicleta) {
        this.modelBicicleta = modelBicicleta;
    }
}
