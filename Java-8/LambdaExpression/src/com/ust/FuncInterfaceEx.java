package com.ust;

import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;

public class FuncInterfaceEx {
    public static void main(String args[]) {
    List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
    
    System.out.println("Printing the whole list : ");
    
    //Passing n as parameter
    eval(intList, n-> true);
    System.out.println("Printing even numbers : ");
    eval(intList, n-> n%2 == 0);
    }
    
     public static void eval(List<Integer> intList, Predicate<Integer> predicate)
     {
         for(Integer n : intList)
         {
             if(predicate.test(n)){
                 System.out.println(n + " ");
             }
         }
     }
       
}
