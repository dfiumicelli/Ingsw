package E7;

public class Promo implements Sconto {
    public Promo(float percentualeSconto) {
        
    }

    @Override
    public float applicaSconto(Ordine ordine) {
        Prodotto costaMeno = null;
        float min = 0;

        for (ElementoOrdine e : ordine.getElementi()) {
            float prezzo = e.getQuantita() * e.getProdotto().getPrezzo();
            if (prezzo < min || min == 0) {
                min = prezzo;
                costaMeno = e.getProdotto();
            }
        }
        float prezzoScontato = ordine.calcolaTotale() - costaMeno.getPrezzo() + (costaMeno.getPrezzo() * 0.5f);
        return prezzoScontato;
    }
    
}
