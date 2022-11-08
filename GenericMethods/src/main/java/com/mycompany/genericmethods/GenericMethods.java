/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.genericmethods;

/**
 *
 * @author Ulima
 */
public class GenericMethods {
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }
  
    public static void main(String[] args)
    {
        genericDisplay(5);
        genericDisplay("Selena Gomez");
        genericDisplay(10.0);
    }
}

