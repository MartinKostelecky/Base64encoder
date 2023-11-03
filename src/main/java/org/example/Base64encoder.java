package org.example;

import java.util.Base64;
import java.util.Scanner;

public class Base64encoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for encoding: ");
        // Input string to be encoded
        String inputString = scanner.nextLine();

        // Encode the string to Base64
        byte[] encodedBytes = Base64.getEncoder().encode(inputString.getBytes());

        // Convert the byte array to a Base64-encoded string
        String encodedString = new String(encodedBytes);

        // Display the Base64-encoded string
        System.out.println("Base64-encoded string: " + inputString + " encoded in: " + encodedString);
    }
}
