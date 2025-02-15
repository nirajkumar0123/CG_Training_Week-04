package regex.censorbadwords;

public class ReplaceBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

//        String[] badWords = {"damn", "stupid"};
//
//        String regex = String.join("|", badWords);

        String replacedText = text.replaceAll("(?i)\\b(damn|stupid)\\b", "****");

        System.out.println("Original: " + text);

        System.out.println("Formatted: " +replacedText);

    }
}
