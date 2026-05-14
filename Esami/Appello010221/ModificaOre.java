package Esami.Appello010221;

public class ModificaOre implements Mode{
    public void handleModeRequest(Orologio o){
        o.setModalita(new ModificaMinuti());
    }
    public void handleChangeRequest(Orologio o){
        o.setOre(o.getOre()+1);
    }
}
