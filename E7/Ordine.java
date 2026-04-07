package E7;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public abstract class Ordine {
    private Date data;
    private Cliente cliente;
    private List<ElementoOrdine> elementi;
    private Sconto strategiaSconto;
    public Ordine(Date data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        this.elementi = new ArrayList<>();
    }
    public Date getData() {
        return data;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void aggiungiElemento(ElementoOrdine elemento) {
        for (ElementoOrdine e : elementi) {
            if (e.getProdotto().getCodice().equals(elemento.getProdotto().getCodice())) {
                e.aggiungiQuantita(elemento.getQuantita());
                return;
            }
        }
        elementi.add(elemento);
    }
    public float calcolaTotale() {
        float totale = 0;
        for (ElementoOrdine e : elementi) {
            totale += e.getQuantita() * e.getProdotto().getPrezzo();
        }
        return totale;
    }
    public void setStrategiaSconto(Sconto sconto) {
        this.strategiaSconto = sconto;
    }
    public Sconto getStrategiaSconto() {
        return strategiaSconto;
    }
    public List<ElementoOrdine> getElementi() {
        return elementi;
    }
    public void paga() {
        if (strategiaSconto != null) {
            float totaleScontato = strategiaSconto.applicaSconto(this);
            System.out.println("Totale da pagare: " + totaleScontato);
        } else {
            System.out.println("Totale da pagare: " + calcolaTotale());
        }
        doPostPagamento();
    }
    protected abstract void doPostPagamento();
}
