package E9;

public class PlainText extends DocumentPart {
	public String acceptParser(Parser parser) {
		return parser.parse(this);
	}
}
