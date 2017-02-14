/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.text.MessageFormat;

/**
 *
 * @author Brian Snyder
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(String.format("string one %s, string two $%d", "testing",42));
    }
    
}
