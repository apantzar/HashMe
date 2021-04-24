package com.pantz;

import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class HashMeTest {

    @Test
    void theHasher() throws NoSuchAlgorithmException {

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Test cases for encryption                                                                                 //
        //Passwords cases:: random passwords for each case                                                         //
        ///////////////////////////////////////////////////[TESTS] /////////////////////////////////////////////////

        HashMe hashMe = new HashMe("password");
        assertEquals("5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8", hashMe.theHasher("password"));


        HashMe hashMe2 = new HashMe("bwhfiwgfowfwefb1@&^159G");
        assertEquals("6dd1400d66680d34e4a20a3529b9b060427cbf1573e0963605d1dcdc70e4d012", hashMe2.theHasher("bwhfiwgfowfwefb1@&^159G"));


        HashMe hashMe3 = new HashMe("jkfbiyviyYVYUV41217!@?");
        assertEquals("5af9d3e30459892aacc21fbbc1f3a63c986566d2dc11746f63f6a82cb8ed5b96", hashMe3.theHasher("jkfbiyviyYVYUV41217!@?"));



        HashMe hashMe4 = new HashMe("jBIUbdk54846879766SDN3WJ22&&");
        assertEquals("fd16057776f483b0e67a0e73d0358223a5cd0907614db9632607ab051e9b2279", hashMe4.theHasher("jBIUbdk54846879766SDN3WJ22&&"));


        HashMe hashMe5 = new HashMe("1525448467451387681358763513874");
        assertEquals("d89eea1c041b221c2c9b8e9e268a0dfad1a2fab0159cacc129c286db37fb4d31", hashMe5.theHasher("1525448467451387681358763513874"));



        HashMe hashMe6 = new HashMe("Hjjbj54@@hbiucmsk25 1");
        assertEquals("5233cf1656fa877c59d0f322b7ab4992e5fa22a235c12e886cf2ad65b9d31d3e", hashMe6.theHasher("Hjjbj54@@hbiucmsk25 1"));



        HashMe hashMe7 = new HashMe("AHUYBHIGOEFGYWEARGQWGBIOBWIFGBLSHK");
        assertEquals("9ad498ccfcaa342c7226d299912a1d98da405984f434d5024114631b8c9922c6", hashMe7.theHasher("AHUYBHIGOEFGYWEARGQWGBIOBWIFGBLSHK"));



        HashMe hashMe8 = new HashMe("1hJj)807##");
        assertEquals("81fc2979ba876ccf0cc6230bd00dc6f63cb54b80ef37b4f0708b40fbbb2d0fb1", hashMe8.theHasher("1hJj)807##"));




        HashMe hashMe9 = new HashMe("εκξδβ;ιφβ5408");
        assertEquals("adf3aa7e634e74ee260f86df130739ad93fdbf292a37ea87bb4f149079fcaeee", hashMe9.theHasher("εκξδβ;ιφβ5408"));



        HashMe hashMe10 = new HashMe("$%^&^*&)&^)(^*(&^*^$");
        assertEquals("4e2b1991070518bbae49a4f0ed0380ffc3e42b478385ffbab996d617a2515133", hashMe10.theHasher("$%^&^*&)&^)(^*(&^*^$"));






    }
}