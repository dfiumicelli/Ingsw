package Esami.Appello010221;

public class Visualizzazione12h implements Visualizzazione{
    public String getOrario(Orologio o){
        int ore=o.getOre();
        if(ore>12){
            ore=ore-12;
        }
        return ore+":"+o.getMinuti();
    }
}
