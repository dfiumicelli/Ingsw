public interface MazeFactory {
    public Room createRoom();
    public Wall createWall();
    public Door createDoor(Room roomA, Room roomB);
    public Maze createMaze();
}