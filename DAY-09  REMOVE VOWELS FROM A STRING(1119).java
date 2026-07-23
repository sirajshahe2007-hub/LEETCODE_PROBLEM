public class Main {
    public static void main(String[] args) {
        String originalText = "Dhaanish chennai college of engineering";
        
        String textWithoutVowels = originalText.replaceAll("[aeiouAEIOU]", "");
        
        System.out.println("Original String:");
        System.out.println(originalText);
        
        System.out.println("\nString after removing vowels:");
        System.out.println(textWithoutVowels);
    }
}
