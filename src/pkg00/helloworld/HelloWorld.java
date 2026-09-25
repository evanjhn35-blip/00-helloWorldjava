/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;
import java.util.Scanner;

/**
 *
 * @author ejehannin
 */
public class HelloWorld {
    
    /**
     * @param args the command line arguments
     */
    //EXO 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        //System.out.print("saisir un nombre a : "); //ecrire le nombre a
        //int a = sc.nextInt(); //integrer l'entier a       
        //System.out.print(" saisir un nombre b : "); //ecrire le nombre b
        //int b = sc.nextInt(); //integrer l'entier b
        //int z; //integrer l'entier z
        //int res; //integrer l'entier res qui sera le resultat du calcul
        //z=a+b; // faire le calcul a+b
        //res=z*2; // multiplier le tout par 2
        //System.out.println("Le resultat de (a+b)*2 est : " +res ); //le resultat
        
        
        
    
        
        //EXO4
        System.out.print("saisir un nombre x : ");
        int x = sc.nextInt();
        
        System.out.print(" saisir un nombre y : ");
        int y = sc.nextInt();
        
        System.out.println("sans permutation, x : " +x +"  y: " +y );
        int z =0;
        
        z=x;
        x=y;
        y=z;
        
        System.out.println("apres permutation, x : " +x +"  y: " +y );
        
       
        //hello World
        //System.out.println("Hello World by EJ!");
        
        //Ex0 2
        //System.out.println("j'affiche un message");
        //System.out.println("sur deux lignes.");
        
        
        
        
    
    }
    
}
