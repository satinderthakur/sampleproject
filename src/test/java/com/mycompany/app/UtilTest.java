/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author catchmycity
 */
public class UtilTest {

    public UtilTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        System.out.println("add");
        Integer a = 15;
        Integer b = 15;
        Integer expResult = 30;
        Integer result = Util.add(a, b);
        assertEquals(expResult, result);

        assertEquals(null, Util.add(15, null));
        assertEquals(null, Util.add(null, 15));
        assertEquals(null, Util.add(null, null));
    }

    @Test
    public void testGetBaseUrl() {
        System.out.println("getBaseUrl");
        String expResult = "http://catchmycity.com";
        String result = Util.getBaseUrl();
        assertEquals(expResult, result);
    }

    @Test
    public void testGenerateStoreDetails() {
        System.out.println("generateStoreDetails");
        String mobileNo = "1234567890";
        String expResult = Util.getBaseUrl() + "/" + mobileNo;
        String result = Util.generateStoreDetails(mobileNo);
        assertEquals(expResult, result);
    }

}
