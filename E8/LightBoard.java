package E8;

public class LightBoard implements Board {
    public void blinkLights() {
        System.out.println("Blinking lights on the LightBoard!");
    }
    @Override
    public void update() {
        this.blinkLights();
    }
}
