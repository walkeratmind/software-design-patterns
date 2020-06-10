package com.codemonk.strategy.chat;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class DESAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting using DES..\nMessage: " + message);

        return "encrypted message: " + message;
    }
}