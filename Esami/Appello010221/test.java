package Esami.Appello010221;
public class test {
    public static void main(String[] args) {
        // 1)
        Orologio o = new Orologio();
        // 2)
        o.changeRequest();
        // 3)
        o.modeRequest();
        for (int i = 1; i <= 20; i++) {
            o.changeRequest();
        }
        o.modeRequest();
        for (int i = 1; i <= 30; i++) {
            o.changeRequest();
        }
        // 4)
        o.modeRequest();
        o.changeRequest();
        // 5)
        o.mostraOrario();
        // 6)
        o.modeRequest();
        o.changeRequest();
    }
}