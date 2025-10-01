public class BiggerCharacter {
    public static void main(String[] args) {
        String statement = "Java Programming";

        // Convert to char array
        char[] chars = statement.toCharArray();

        // Assume first character is the biggest
        char maxChar = chars[0];

        // Loop through all characters
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] > maxChar) {
                maxChar = chars[i];
            }
        }

        System.out.println("The biggest character is: " + maxChar);
    }
}
