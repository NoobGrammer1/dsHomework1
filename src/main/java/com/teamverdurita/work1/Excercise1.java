/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamverdurita.work1;

import java.util.Scanner;

/**
 *
 * @author noobgrammer
 */
public class Excercise1 {
    public static void main(String[] args) {
         boolean stay = true;
         Scanner opt = new Scanner(System.in);
         int option = 0;
        System.out.println("Hello, I'm gonna instaciate a 100 elements array B)");
        int oneHundred [] = new int[100];
        for (int i = 0; i < oneHundred.length; i++) {
            oneHundred[i] = 1 + (int) (99 * Math.random());
             //System.out.println(oneHundred[i]);
        }
       
        System.out.println("The array has been instaciated...");
        while (stay) {            
            System.out.println("Choose an option: ");
            System.out.println("1. Walk through.");
            System.out.println("2. Insert at the beginning");
            System.out.println("3. Insert where I want");
            System.out.println("4. Insert after where I want");
            System.out.println("5. Insert before where I want");
            System.out.println("6. Delete where where I want");
            System.out.println("7. Search element (index or value)");
            System.out.println("8. Update element where I want");
            System.out.println("9. Exit");  
            option = opt.nextInt();
            switch (option) {
                case 1: walkThrough(oneHundred);
                break;
                case 2: insertAtTheBeginning(oneHundred);
                break;
                case 3: insertAny(oneHundred);
                break;
                case 4: insertAfterAny(oneHundred);
                break;
                case 5: insertBeforeAny(oneHundred);
                break;
                case 6: deleteAny(oneHundred);
                break;
                case 7: searchInto(oneHundred);
                break;
                case 8: updateAny(oneHundred);
                break;
                default : stay = false;
            } 
        }
    }
    
    public static void walkThrough(int []array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " +(i+1)+ ": " + array[i]);
        }
    }
    
    public static void insertAtTheBeginning(int []array) {
        System.out.println("Insert the new element value: ");
        Scanner newValue = new Scanner(System.in);
        for (int i = array.length -1; i > 0  ; i--) {
            array[i] = array[i-1]; 
        }
        array[0] = newValue.nextInt();
        
    }
    
    public static void insertAny(int []array) {
        System.out.println("Give me the position you wanna change from (1-100): ");
        
        Scanner position = new Scanner(System.in);
        int pos = position.nextInt();
        System.out.println("Insert the new element value for the element "+ pos +": ");
        
        Scanner newValue = new Scanner(System.in);
        int newVal = newValue.nextInt();
        
         for (int i = array.length - 1; i >= pos  ; i--) {
            array[i] = array[i-1]; 
        }
        
        array[pos - 1] = newVal;
    }
    
    public static void insertAfterAny(int []array) {
        System.out.println("Give me the position you wanna change from (1-100): ");
        
        Scanner position = new Scanner(System.in);
        int pos = position.nextInt();
        System.out.println("Insert the new element value for the element "+ pos +": ");
        
        Scanner newValue = new Scanner(System.in);
        int newVal = newValue.nextInt();
        
         for (int i = array.length - 1; i > pos  ; i--) {
            array[i] = array[i-1]; 
        }
        
        array[pos ] = newVal;
    
    }
    
    public static void insertBeforeAny(int []array) {
         System.out.println("Give me the position you wanna change from (1-100): ");
        
        Scanner position = new Scanner(System.in);
        int pos = position.nextInt();
        
        System.out.println("Insert the new element value for the element "+ pos +": ");
        Scanner newValue = new Scanner(System.in);
        int newVal = newValue.nextInt();
        
        for (int i = array.length - 1; i >= pos  ; i--) {
            array[i] = array[i-1]; 
        }
        
        array[pos -2] = newVal;
    }
    
    
    public static void deleteAny(int []array) {
        System.out.println("Give me the position you wanna delete (1-100): ");
        Scanner position = new Scanner(System.in);
        int pos = position.nextInt();
                
        if (pos <= 100 && pos > 0) {
            array[pos - 1] = 0;
        } else {
            System.out.println(" No such as position, returning...");
        }
    }
    public static void searchInto(int []array) {
         System.out.println("Give me the what you wanna search (1-100): ");
        
        Scanner searchable = new Scanner(System.in);
        int num = searchable.nextInt();
       
        for (int i = 0; i < array.length; i++) {
            if (num ==  i) {
                System.out.print("I found a coincidence with INDEX :");
                System.out.println("array ["+i+"] = " +array[num -1]);
                } 
            if (num == array[i]) {
                System.out.print("I found a coincidence with VALUE :");
                System.out.println("array ["+i+"] = " +array[i]); 
            }
        }       
    }
     
    public static void updateAny(int []array) {
        Scanner position = new Scanner(System.in);
        Scanner newValue = new Scanner(System.in);
        Scanner confirmation = new Scanner(System.in);
        System.out.println("Give me the position you wanna change (1-100): ");
        int pos = position.nextInt();
        
        System.out.println("Insert the new element value for the element "+ pos +": ");
        int val = newValue.nextInt();
        
        System.out.println("You are going make this change : array["+(pos-1)+"] = " + array[pos-1] + " ==> array["+(pos-1)+"] = " + val);
        System.out.println("Do you want to continue? (y/n)");
        String con = confirmation.nextLine();
        if(con.equals("y")) {
            System.out.println("....");
          array[pos - 1] = val;
            System.out.println("Change made succesfully");
        } else {
            System.out.println("Aborting change and returning....");
        }
        
        
      
    }
}
