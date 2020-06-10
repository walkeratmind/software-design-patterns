package com.codemonk.strategy.chat;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Monday, 08-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void main(String[] args) {
        show();
    }

    public static void show() {
        ChatClient chatClient = new ChatClient(new DESAlgorithm());
        chatClient.send("encrypt this");
    }
}
