/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Elements;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ntkhai
 */
public class Array_Processing {
    Scanner sc = new Scanner(System.in);    
    Elements element = new Elements();
    Random random = new Random();
    public int realDecimalNumber(String str)
    {
        int number = 0;
        while(true)
        {
            System.out.println(str);
            number = sc.nextInt();
            if(number >= 0)
            break;
        }
        return number;
    }
    
    public int[] generateRandomArray()
    {
        element.setSize(realDecimalNumber("Enter number of array:"));
        int[] a = new int[element.getSize()];
        for(int i = 0; i < element.getSize(); i++)
        {
            a[i] = random.nextInt(element.getSize());
        }
        return a;
    }
    
    public void showArr(String str, int[] a)
    {
        System.out.print(str + " array:[");
       for(int i = 0; i < a.length; i++)
       {
           if(i == a.length - 1)
               System.out.print(a[i]);
           else
           System.out.print(a[i] + ", ");
       }
        System.out.print("]");
    }
    
    
}
