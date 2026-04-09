package E8;

public class AudioBoard implements Board {
    public void play(String message) {
        System.out.println(message);
    }
    @Override
    public void update() {
        this.play("Update Received!");
    }
}
