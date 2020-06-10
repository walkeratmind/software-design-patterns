package com.codemonk.strategy.chat;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class ChatClient {
//    private String encryptionAlgorithm;
//
//    public ChatClient(String encryptionAlgorithm) {
//        this.encryptionAlgorithm = encryptionAlgorithm;
//    }

//    public void send(String message) {
//        if (encryptionAlgorithm == "DES")
//            System.out.println("Encrypting message using DES");
//        else if (encryptionAlgorithm == "AES")
//            System.out.println("Encrypting message using AES");
//        else
//            throw new UnsupportedOperationException("Unsupported encryption algorithm");
//
//        System.out.println("Sending the encrypted message...");
//    }

    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        String encryptedMessage = encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
