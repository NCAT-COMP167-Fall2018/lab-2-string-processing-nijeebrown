/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author d16diall
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    private static String [] records; 
        
    
    public static boolean checkNames(String frstName, String lstName){
        if(Character.isUpperCase(frstName.charAt(0))){
            for(int i =0; i< frstName.length();i++){
                if(!Character.isLowerCase(frstName.charAt(i)) || !Character.isUpperCase(frstName.charAt(i))){
                    return false;
                   
                }
            }
        }
            if(Character.isUpperCase(lstName.charAt(0))){
                for(int i = 1; i< lstName.length(); i++){
                if(!Character.isLowerCase(frstName.charAt(i)) || !Character.isUpperCase(lstName.charAt(i))){
                   return false;
                }
            }
    }
            return true;
    }
    public static boolean checkGender (String gender){
        gender = gender.toLowerCase();
        return gender.equals("female")  || gender.equals("male");
    }
    public static void main(String[] args) throws FileNotFoundException{
        String[] record;
        record = new String[100];
    
        try { 
            Scanner reader = new Scanner(new File(args[0]));
            int currentIndex = 0;
            while(reader.hasNext()){
                String [] line =reader.nextLine().split(",");
                String fstName = line[0].trim();
                String lstName = line[1].trim();
                String age = line[2].trim();
                String gender = line[3].trim();
                String phoneNum = line[4].trim();
                String email = line[5].trim();
            
                if(checkNames(fstName, lstName) && checkGender(gender)){
                }
                
                records[currentIndex] = String.format("%-20s%-20s%-10s%10s%-20s%30s", fstName, lstName , gender,age, phoneNum, email);
                System.out.print(records[currentIndex]);
                currentIndex++;
                
            }
        }
        catch (FileNotFoundException ex){
                    
                  System.err.println("Input file not found");
                    System.exit(-1);
                    }
        }
    }
                  
                    
    

