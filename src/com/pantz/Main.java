package com.pantz;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {


        String pass = "YourPassword"; //type a password here
        HashMe hashMe = new HashMe(pass);
        System.out.println(hashMe.getPasswordToHash() +"=" +"" +hashMe.theHasher(pass));

    }
}
