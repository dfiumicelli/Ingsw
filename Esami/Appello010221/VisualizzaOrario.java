package Esami.Appello010221;

public class VisualizzaOrario implements Mode{
    public VisualizzaOrario(){

    }
    public void handleChangeRequest(Orologio o) {
        o.setModalita(new ModificaOre());
        
    }
    public void handleModeRequest(Orologio o){
        System.out.println(o.getOre()+":"+o.getMinuti());
    }
}
