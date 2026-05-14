package Esami.Appello010221;

public class Orologio {
    private int ore;
    private int minuti;
    private Mode modalita;
    private Visualizzazione visualizzazione;
    public Orologio(){
        this.ore=0;
        this.minuti=0;
        this.modalita=new VisualizzaOrario();
        this.visualizzazione=new Visualizzazione12h();
    }
    public int getOre() {
        return ore;
    }
    public void setOre(int ore) {
        this.ore = ore;
    }
    public int getMinuti() {
        return minuti;
    }
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }
    public Mode getModalita() {
        return modalita;
    }
    public void setModalita(Mode modalita) {
        this.modalita = modalita;
    }
    public Visualizzazione getVisualizzazione() {
        return visualizzazione;
    }
    public void setVisualizzazione(Visualizzazione visualizzazione) {
        this.visualizzazione = visualizzazione;
    }
    public void mostraOrario(){
        String orario=visualizzazione.getOrario(this);
        System.out.println(orario);
    }
    public void illuminaSchermo(){
        System.out.println("Simulazione di schermo illuminato");
    }
    public void changeRequest(){
        modalita.handleChangeRequest(this);
    }
    public void modeRequest(){
        modalita.handleModeRequest(this);
    }
}
