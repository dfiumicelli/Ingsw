package E9;

public abstract class DocumentPart {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	public abstract String acceptParser(Parser parser);
}
