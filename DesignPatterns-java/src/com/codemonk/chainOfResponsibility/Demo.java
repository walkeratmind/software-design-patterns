package com.codemonk.chainOfResponsibility;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Tuesday, 09-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void main(String[] args) {
        // authenticator -> Logger -> Compressor -> Encryptor
        Encryptor encryptor = new Encryptor(null);
        Compressor compressor = new Compressor(encryptor);
//        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(compressor);


        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));


    }
}
