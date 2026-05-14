package Esami.Appello010221;

public class Visualizzazione24h implements Visualizzazione{
    public String getOrario(Orologio o){
        return o.getOre()+":"+o.getMinuti();
    }
}
