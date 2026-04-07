package E7;

public class Discount implements Sconto {
    private float percentualeSconto;

    public Discount(float percentualeSconto) {
        this.percentualeSconto = percentualeSconto;
    }

    @Override
    public float applicaSconto(Ordine ordine) {
        float totale = ordine.calcolaTotale();
        return totale - (totale * (percentualeSconto / 100));
    }
    
}
