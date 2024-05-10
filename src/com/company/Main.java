package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

	// code quiz 2 for encryption (Information Security)
        //Taking Input From User
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Message to Encrypt:");
        String msg = input.nextLine();

        //input key for encryption
        System.out.println("Enter The Message Encryption Key:");
        int key = input.nextInt();

        String encrypted_String = "";

        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);
            if(Character.isLetter(ch)){
                char encryptedCh = ch;
                if (Character.isLowerCase(ch)) {
                    encryptedCh = (char) ((ch - 'a' + key) % 26 + 'a');
                }
                if (Character.isUpperCase(ch)) {
                    encryptedCh = (char) ((ch - 'A' + key) % 26 + 'A');
                }

                encrypted_String =(encrypted_String+encryptedCh);
            }

        }
        System.out.println("The Encrypted Message is: "+encrypted_String);}
    }


