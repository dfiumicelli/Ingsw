public abstract class AbstractMazeFactory {
    private int lastRoomNumber = 0;
    protected int nextRoomNumber() {
        return ++lastRoomNumber;
    }
}
