package E9;

public interface Status {
	public void handleEdit(WikiCodeDoc document);
	public void handleExport(WikiCodeDoc document);
	public boolean handleClosing(WikiCodeDoc document);
}
