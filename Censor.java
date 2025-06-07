

public class Censor {
    public static String censorBadWords(String[] wordsToCensor, String paragraph) {
        for (String badWord : wordsToCensor) {
            String masked = createMaskedWord(badWord);
            
            paragraph = paragraph.replaceAll("(?i)\\b" + badWord + "\\b", masked);
        }
        return paragraph;
    }

    
    public static String createMaskedWord(String word) {
        if (word.length() <= 1) {
            return word; 
        }

        String masked = word.charAt(0) + "*".repeat(word.length() - 1);
        return masked;
    }

   
    public static void main(String[] args) {

        String[] sensitiveWords = {"gun", "suicide"};

       
        String inputParagraph =( "The detective arrived at the crime scene and found a gun lying near the victim. According to the initial reports the case appeared to be a suicide. The investigators are still gathering evidence to confirm the cause of death.");

       
        String censoredText = censorBadWords(sensitiveWords, inputParagraph);

        
        System.out.println("Censored Paragraph:");
        System.out.println(censoredText);
    }
}
