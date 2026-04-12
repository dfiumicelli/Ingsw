package E9;

public class UnmodifiedState implements Status {
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
        // Can close if unmodified
        return true;
    }
    public String toString() {
        return "Unmodified";
    }
}
