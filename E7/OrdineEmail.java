package E7;

import java.util.Date;

public class OrdineEmail extends Ordine {

    public OrdineEmail(Cliente cliente, Date data) {
        super(data, cliente);
    }

    public void doPostPagamento() {
        System.out.println("Invio ordine via email a " + getCliente().getEmail());
    }
    
}
