/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carsharing;
import java.util.ArrayList;
/**
 *
 * @author matte
 */
public class ParcoAutomobili {
    private ArrayList<Parcheggio> parcheggi;
    
    public ParcoAutomobili(){
        this.parcheggi = new ArrayList<Parcheggio>();
    }
    
    public void rmAuto(String targa){
        for (Parcheggio p: parcheggi){
            for(Automobile a: p.getAutomobili()){
            
            }
        }
    }
    
    
}
