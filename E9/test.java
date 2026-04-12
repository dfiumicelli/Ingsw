package E9;

public class test {

	public static void main(String[] args) {
		WikiCodeDoc doc = new WikiCodeDoc(new EmptyState());
		System.out.println(doc.getStatus().toString()+", can be closed: "+doc.canClose());

		DocumentPart title = new BoldText();
		title.setText("SOME TITLE: ");
		HyperLinks link = new HyperLinks();
		link.setText("MY PAGE");
		link.setUrl("https://www.google.it");
		DocumentPart text = new PlainText();
		text.setText(" BYE BYE ");
		doc.addPart(title);
		doc.addPart(link);
		doc.addPart(text);
		System.out.println(doc.getStatus().toString()+", can be closed: "+doc.canClose());
		
		Parser p1 = new HTMLParser();
		System.out.println("EXPORT: "+doc.acceptParser(p1));
		System.out.println(doc.getStatus().toString()+", can be closed: "+doc.canClose());
	}

}
