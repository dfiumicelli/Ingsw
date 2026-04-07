package E7;

public class ElementoOrdine {
    private int quantita;
    private Prodotto prodotto;
    public ElementoOrdine(int quantita, Prodotto prodotto) {
        this.quantita = quantita;
        this.prodotto = prodotto;
    }
    public int getQuantita() {
        return quantita;
    }
    public void aggiungiQuantita(int quantita) {
        this.quantita += quantita;
    }
    public Prodotto getProdotto() {
        return prodotto;
    }
}
