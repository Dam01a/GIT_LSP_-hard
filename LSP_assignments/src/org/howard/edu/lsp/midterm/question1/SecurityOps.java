package org.howard.edu.lsp.midterm.question1;

/**
 * The SecurityOps class provides a method to encrypt text by writing all of the even-indexed characters first,
 * followed by all of the odd-indexed characters, ignoring punctuation and whitespace.
 */
public class SecurityOps {

    /**
     * Encrypts the input text by writing all of the even-indexed characters first, followed by all of the odd-indexed
     * characters, ignoring punctuation and whitespace.
     *
     * @param text the text to be encrypted
     * @return the encrypted text
     */
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();

        // Append even-indexed characters
        for (int i = 0; i < text.length(); i += 2) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                encryptedText.append(c);
            }
        }

        // Append odd-indexed characters
        for (int i = 1; i < text.length(); i += 2) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }
}


