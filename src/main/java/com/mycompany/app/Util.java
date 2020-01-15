/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

/**
 *
 * @author catchmycity
 */
public class Util {

    public static Integer add(Integer a, Integer b) {
        if (a == null) {
            return null;
        }
        if (b == null) {
            return null;
        }
        return a + b;
    }

    public static String getBaseUrl() {
        return "http://catchmycity.com";
    }

    public static String generateStoreDetails(String mobileNo) {

        String baseUrl = Util.getBaseUrl();

        return baseUrl + "/" + mobileNo;

    }

}
