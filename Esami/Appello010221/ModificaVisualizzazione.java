package Esami.Appello010221;

public class ModificaVisualizzazione implements Mode{
    public ModificaVisualizzazione(){

    }
    @Override
    public void handleChangeRequest(Orologio o) {
        o.setModalita(new VisualizzaOrario());
        
    }

    @Override
    public void handleModeRequest(Orologio o) {
        if (o.getVisualizzazione() instanceof Visualizzazione12h){
            o.setVisualizzazione(new Visualizzazione24h());
        }
        else{
            o.setVisualizzazione(new Visualizzazione12h());
        }
    }
    
}
