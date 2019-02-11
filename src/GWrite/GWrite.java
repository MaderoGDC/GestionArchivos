/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author dmadero
 */
public class GWrite {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream output = new PrintStream("enteros.txt");
        Scanner input = new Scanner(System.in);
        output.println("numeros guardados");
        ArrayList en = new ArrayList<Integer>();
        System.out.println("escriba el numero a guardar");
        en.add(input.nextInt());
        boolean seguir = true;        
        for(int i=0; i>0 && seguir == true ;i++){

        
        }
    }
    public boolean parar(boolean a){
        a = !a;
        return a;
    }
}
