/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionarchivos;

import java.io.File;

/**
 *
 * @author dmadero
 */
public class GestionArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //File f = new File("hamlet.txt");
        File f = new File("x");
        System.out.println("exist returns " + f.exists());
        if(f.isDirectory()){            
        String lista[] = f.list();
            for(String nombre : lista){
                if(f.isDirectory()) 
                System.out.println("nombre de la carpeta: "+nombre);
            }
        }     
        //System.out.println("canRead returns"+ f.canRead());
        //System.out.println("lenght returns"+ f.length());
        //System.out.println("getAbsolute returns" + f.getAbsolutePath());
        //System.out.println("carpeta" + f.list);
    }
    
}
