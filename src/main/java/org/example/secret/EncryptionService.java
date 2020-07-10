package org.example.secret;

/**
 * Encrypts a message. We want this class being obfuscated.
 * @author Thomas Bolz
 */
public class EncryptionService {

    public String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            char[] toChars = Character.toChars(c+1);
            result.append(toChars);
        }
        return result.toString();
    }
}
