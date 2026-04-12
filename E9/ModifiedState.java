package E9;

public class ModifiedState implements Status {
    @Override
    public void handleEdit(WikiCodeDoc document) {
        document.setStatus(new ModifiedState());
    }
    @Override
    public void handleExport(WikiCodeDoc document) {
        document.setStatus(new UnmodifiedState());
    }
    @Override
    public boolean handleClosing(WikiCodeDoc document) {
        // Cannot close if modified
        return false;
    }
    public String toString() {
        return "Modified";
    }
}
