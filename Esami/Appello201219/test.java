package Esami.Appello201219;

public class test {
    public static void main(String[] args) {
        TextWrapper textWrapper = new TextWrapper("Hello");
        LongWrapper longWrapper = new LongWrapper(12345);
        
        textWrapper.addChild(longWrapper);
        
        Wrapper duplicatedTextWrapper = textWrapper.duplicate();
        
        System.out.println("Original Text: " + textWrapper.getText());
        System.out.println("Duplicated Text: " + ((TextWrapper)duplicatedTextWrapper).getText());
        
        System.out.println("Original Child Value: " + ((LongWrapper)textWrapper.getChildren().get(0)).getValue());
        System.out.println("Duplicated Child Value: " + ((LongWrapper)duplicatedTextWrapper.getChildren().get(0)).getValue());
    }
}
