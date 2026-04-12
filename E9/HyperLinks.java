package E9;

public class HyperLinks extends DocumentPart {
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String acceptParser(Parser parser) {
		return parser.parse(this);
	}

}
