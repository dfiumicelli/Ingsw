package E9;

public class BoldText extends DocumentPart {
	public String acceptParser(Parser parser) {
		return parser.parse(this);
	}
}
