public class Wall implements MapSite {
    public Wall() {
        
    }
    @Override
    public void enter() {
        System.out.println("You have hit a wall.");
    }
}
