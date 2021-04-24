package com.pantz;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMe {

    private String passwordToHash;


    public HashMe(String passwordToHash) {
        this.passwordToHash = passwordToHash;
    }


   // not necessary
    public String getPasswordToHash() {
        return passwordToHash;
    }


    /**
     * @author apantzar
     * @param passwordToHash --> Given password
     * @return --> Hashed password value
     * @throws NoSuchAlgorithmException --> exception
     */
    public String theHasher(String passwordToHash) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(passwordToHash.getBytes());

        byte [] digest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();

        for(byte theByte: digest){

            stringBuffer.append(String.format("%02x", theByte & 0xff));

        }


        return stringBuffer.toString();
    }


}
