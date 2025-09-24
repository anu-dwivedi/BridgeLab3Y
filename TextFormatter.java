
public class TextFormatter {

    public static String autoCorrect(String input) {
        if (input == null || input.isEmpty()) return "";

        // Normalize spaces and trim
        input = input.trim().replaceAll("\\s+", " ");

        // Add space after punctuation if missing
        input = input.replaceAll("([.!?])(\\S)", "$1 $2");

        // Capitalize first letter of each sentence
        StringBuilder corrected = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (capitalizeNext && Character.isLetter(current)) {
                corrected.append(Character.toUpperCase(current));
                capitalizeNext = false;
            } else {
                corrected.append(current);
            }

            if (current == '.' || current == '?' || current == '!') {
                capitalizeNext = true;
            }
        }

        return corrected.toString();
    }

    // Example usage
    public static void main(String[] args) {
        String messyText = "hello world.this is a test!is it working?yes,it is.";
        String cleaned = autoCorrect(messyText);
        System.out.println(cleaned);
    }
}