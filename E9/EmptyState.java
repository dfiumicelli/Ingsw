package E9;

public class EmptyState implements Status {
    @Override
    public void handleEdit(WikiCodeDoc document) {
        document.setStatus(new ModifiedState());
    }
    @Override
    public void handleExport(WikiCodeDoc document) {
        // Do nothing special on export
    }
    @Override
    public boolean handleClosing(WikiCodeDoc document) {
        // Can close if empty
        return true;
    }
    public String toString() {
        return "Empty";
    }
}
