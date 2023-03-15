/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carsharing;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author matte
 */
public class CarSharing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ParcoAutomobili parco1 = new ParcoAutomobili();
        Parcheggio p1 = new Parcheggio("pippo",50);
        Parcheggio p2 = new Parcheggio("nomeP",50);
        
        System.out.println(parco1.addPark(p1));
        System.out.println(parco1.addPark(p2));
        System.out.println(parco1.toString());
        
        Automobile a1 = new Automobile("targa","pippo");
        a1.setnViaggi(5);
        System.out.println(parco1.addAuto(a1, "pippo"));
        System.out.println(parco1.toString());
        System.out.println("");
        System.out.println("");
        System.out.println(parco1.transitaAuto(a1, "nomeP"));
        System.out.println(parco1.toString());
        
        
        
    }
    
}
