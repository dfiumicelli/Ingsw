package E9;
import java.util.ArrayList;
import java.util.List;
public class WikiCodeDoc {
	private List<DocumentPart> parts;
	private Status status;
	public WikiCodeDoc(Status status) {
		this.parts = new ArrayList<>();
		this.status = status;
	}
	public void addPart(DocumentPart part) {
		parts.add(part);
		status.handleEdit(this);
	}
	public void removePart(DocumentPart part) {
		status.handleEdit(this);
		parts.remove(part);
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public boolean canClose() {
		return getStatus().handleClosing(this);
	}
	public String acceptParser(Parser parser) {
		status.handleExport(this);
		StringBuilder result = new StringBuilder();
		for (DocumentPart part : parts) {
			result.append(part.acceptParser(parser));
		}
		return result.toString();
	}
}
