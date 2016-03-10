/**
 * Checks if given <code>text</code> is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */
public static boolean isPalindrome(String text) {
    char[] letter = new char[text.length()];
        int j = 0;

        for(int i = 0; i < text.length(); i++)
        {
            if (Character.isLetterOrDigit(text.charAt(i)))
                letter[j++]=Character.toLowerCase(text.charAt(i));
        }
        for(int i = 0; i < (j-1)/2; i++)
        {
            if (letter[i] != letter[j-1-i])
                return false;
        }
        return true; // your implementation here
}