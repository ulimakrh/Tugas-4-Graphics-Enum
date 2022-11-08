/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test;

/**
 *
 * @author Ulima
 */

public class Enum {
    enum Days {
      SUNDAY,
      MONDAY,
      TUESDAY,
      WEDNESDAY,
      THURSDAY,
      FRIDAY,
      SATURDAY
  }
  public static void main(String[] args) { 
    
    Days myDays = Days.SUNDAY;

    switch(myDays) {
      case MONDAY:
        System.out.println("Today is Monday");
        break;
      case TUESDAY:
         System.out.println("Today is Tuesday");
        break;
      case WEDNESDAY:
        System.out.println("Today is Wednesday");
        break;
      case THURSDAY:
        System.out.println("Today is Thursday");
        break;
       case FRIDAY:
        System.out.println("Today is Friday");
        break;
       case SATURDAY:
        System.out.println("Today is Thursday");
        break;
       case SUNDAY:
        System.out.println("Today is Sunday");
        break;
    }
  } 
    
}