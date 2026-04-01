public class Room implements MapSite {
    private int number;
    public Room(int number) {
        this.number = number;
    }

    @Override
    public void enter() {
        System.out.println("You have entered room " + number + ".");
    }
    public MapSite getSide(Side side) {
        return null;
    }
    public void setSide(Side side, MapSite mapSite) {
        // Implementation for setting the side of the room
    }
    public int getNumber() {
        return number;
    }
}
