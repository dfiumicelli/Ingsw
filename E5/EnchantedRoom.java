public class EnchantedRoom extends Room {
    public EnchantedRoom(int roomNumber) {
        super(roomNumber);
    }
    @Override
    public void enter() {
        System.out.println("You have entered an enchanted room.");
    } 
}
