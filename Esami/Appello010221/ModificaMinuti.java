package Esami.Appello010221;

public class ModificaMinuti implements Mode{
    public ModificaMinuti(){

    }
    @Override
    public void handleChangeRequest(Orologio o) {
        o.setModalita(new ModificaVisualizzazione());
        
    }

    @Override
    public void handleModeRequest(Orologio o) {
        o.setMinuti(o.getMinuti()+1);
    }
    
}
