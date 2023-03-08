/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carsharing;

import java.util.ArrayList;

/**
 *
 * @author Yassin
 */
public class ParcoAutomobili {
    private ArrayList<Parcheggio> parcheggi;


    public ParcoAutomobili() {
        this.parcheggi = new ArrayList<Parcheggio>();
    }

    public ArrayList<Parcheggio> getParcheggi() {
        return parcheggi;
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
    public String addPark(Parcheggio t){
        boolean sem = false;
        for(Parcheggio p:parcheggi){
            if(p.getNome().equals(t.getNome())){
                sem=false;
                break;
            }else sem=true;
        }
        if(sem){
            parcheggi.add(t);
            return "Aggiunto nuovo parcheggio";
        }else return "Parcheggio con nome già esistente";
    }
    
    public void rmAuto(int maxViaggi){
        for(Parcheggio p:parcheggi){
            for(Automobile a:p.getAutomobili()){
                if(a.getnViaggi()>=maxViaggi){
                    ArrayList<Automobile>tmp=p.getAutomobili();
                    tmp.remove(a);
                    p.setAutomobili(tmp);
                }
            }
        }
    }
    
    public void transitaAuto(Automobile a, String Nome){
        for(Parcheggio t:parcheggi){
            for(Automobile q:t.getAutomobili()){
                if(a.equals(a)){
                    t.getAutomobili().remove(a);
                }
            }
            if(t.getNome().equals(Nome)){
                t.AddAuto(a);
            }
        }
        
    }
}
