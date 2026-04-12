package E9;

public class PlainTextParser implements Parser {
	@Override
	public String parse(PlainText part) {
		return part.getText();
	}

	@Override
	public String parse(BoldText part) {
		return part.getText();
	}

	@Override
	public String parse(HyperLinks part) {
		return part.getText()+" ["+part.getUrl()+"]";
	}

}
