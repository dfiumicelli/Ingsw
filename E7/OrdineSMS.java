package E7;

import java.util.Date;

public class OrdineSMS extends Ordine {
    public OrdineSMS(Date data, Cliente cliente) {
        super(data, cliente);
    }

    @Override
    public void doPostPagamento() {
        System.out.println("Invio ordine via SMS a " + getCliente().getNome() + " " + getCliente().getCognome());
    }
    
}
