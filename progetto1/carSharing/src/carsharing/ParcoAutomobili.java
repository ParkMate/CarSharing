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
    
    public String rmAuto(String targa){
        boolean sem=false;
        for (Parcheggio p: parcheggi){
            for(Automobile a: p.getAutomobili()){
                if(a.getTarga().equals(targa)){
                    ArrayList<Automobile>tmp=p.getAutomobili();
                    tmp.remove(a);
                    p.setAutomobili(tmp);
                    sem=true;
                }
                else sem=false;
            }
        }
        
        if(sem) return "automobile con targa "+targa+" eliminata con successa";
        else return "automobile con targa "+targa+" non trovata";
    }
    
    public String addAuto(Automobile a,String nome){
        boolean messo=false;
        for(Parcheggio p:parcheggi){
        if(p.getNome().equals(nome))
                if(p.AddAuto(a)){
                    messo=true;
                }
        }
        if(messo){
            return "veicolo inserito con successo";
        }
        else return "errore durante l'inserimento del veicolo";
        
    }
    
    
}

