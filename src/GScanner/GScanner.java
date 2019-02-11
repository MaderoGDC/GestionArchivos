/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GScanner;

/**
 *
 * @author dmadero
 * 
 */
import java.io.*;
import java.util.*;

public class GScanner extends Exception{    
 
    public static void main(String[] args)throws FileNotFoundException  {
        Scanner input = new Scanner(new File("x/sy/a.txt"));
        int count = 0;
        while(input.hasNext()){
            String word = input.next();
            count ++;
        }
        System.out.println("total words" + count); 
    }
}
