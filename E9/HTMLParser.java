package E9;

public class HTMLParser implements Parser {
	public String parse(PlainText plainText) {
		return plainText.getText();
	}

	public String parse(BoldText boldText) {
		return "<b>" + boldText.getText() + "</b>";
	}

	public String parse(HyperLinks hyperLinks) {
		return "<a href=\"" + hyperLinks.getUrl() + "\">" + hyperLinks.getText() + "</a>";
	}

}
