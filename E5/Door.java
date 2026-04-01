public class Door implements MapSite {
    private boolean open;
    public Door(Room roomA, Room roomB) {
        this.open = false;
    }
    @Override
    public void enter() {
        if (open) {
            System.out.println("You have entered a door.");
        } else {
            System.out.println("The door is closed.");
        }
    }
    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Room otherRoom(){
        return null;
    }
}
