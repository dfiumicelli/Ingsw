package E9;

public interface Parser {
	String parse(PlainText plainText);
	String parse(BoldText boldText);
	String parse(HyperLinks hyperLinks);
}
