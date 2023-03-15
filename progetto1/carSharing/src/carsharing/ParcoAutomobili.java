/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carsharing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author matte
 */
public class ParcoAutomobili {

    private ArrayList<Parcheggio> parcheggi;

    public ParcoAutomobili() {
        this.parcheggi = new ArrayList<Parcheggio>();
    }

    /*public String rmAuto(String targa) throws Exception{
        boolean sem = false;
        if(!parcheggi.isEmpty()){
            int pos=0;
            Parcheggio aux = parcheggi.get(pos);
            ArrayList<Automobile> tmp;
            for (Parcheggio p : parcheggi) {
                for (Automobile a : p.getAutomobili()) {
                    if (a.getTarga().equals(targa)) {
                        System.out.println("sono arrivato qui");
                        aux = p;
                        System.out.println("ho salvato il parcheggio in un ausiliare");
                        tmp = aux.getAutomobili();
                        System.out.println("ho salvato il parcheggio delle auto");
                        tmp.remove(a);
                        System.out.println("ho rimosso l'auto dal parcheggio temporaneo");
                        aux.setAutomobili(tmp);
                        System.out.println("ho modificato il parcheggio ausiliare");
                        
                        sem = true;
                    } else {
                        sem = false;
                    }
                }
            }

            if (sem) {
                pos = parcheggi.indexOf(aux);
                parcheggi.set(pos, aux);
                return "automobile con targa " + targa + " eliminata con successa";
            } else {
                return "automobile con targa " + targa + " non trovata";
            }    
        }
        else return "non esistono parcheggi da eliminare";
    }*/
    
    
    
    
    
    
    
    

    public String addPark(Parcheggio t) {
  
        boolean sem = false;
        if(!parcheggi.isEmpty()){
            for (Parcheggio p : parcheggi) {
                if (p.getNome().equals(t.getNome())) {
                    sem = false;
                    break;
                } else {
                    sem = true;
                }
            }
            if (sem) {
                parcheggi.add(t);
                return "Aggiunto nuovo parcheggio";
            } else {
                return "Parcheggio con nome già esistente";
            }
        }
        else{
            parcheggi.add(t);
            return "Aggiunto nuovo parcheggio";           
        }
    }
    
    public String addAuto(Automobile a, String nome) {
        boolean messo = false;
        for (Parcheggio p : parcheggi) {
            if (p.getNome().equals(nome)) {
                int pos = parcheggi.indexOf(p);
                if (parcheggi.get(pos).AddAuto(a)){
                    messo = true;
                }
            }
        }
        if (messo) {
            return "veicolo inserito con successo";
        } else {
            return "errore durante l'inserimento del veicolo";
        }

    }

    @Override
    public String toString() {
        String stringa = "ParcoAutomobili{" + " parcheggi= ";
        for(int i=0;i<parcheggi.size();i++){
            stringa+=i+"->"+parcheggi.get(i).toString();
        }
        stringa+='}';
        return stringa;
    }
    
    
    public String rmAuto(int maxViaggi) {
        boolean sem=false;
        if(!(parcheggi.isEmpty())){
            for (Parcheggio p : parcheggi) {
                if(p.elimina(p.trova(maxViaggi))){
                    sem = true;
                }
            }        
        }
        if(sem){
            return "rimosse tutte le auto che hanno superato "+maxViaggi+" viaggi";
        }
        else return "non sono state trovate delle auto con più di "+maxViaggi+" viaggi";
    }
    
    public String rmAuto(String targa) throws Exception{
        boolean sem = false;
        if(!parcheggi.isEmpty()){
            for (Parcheggio p : parcheggi) {
                if(p.elimina(p.trova(targa)))
                    sem=true;
            }

            if (sem) {
                return "automobile con targa " + targa + " eliminata con successa";
            } else {
                return "automobile con targa " + targa + " non trovata";
            }    
        }
        else return "non esistono parcheggi da eliminare";
    }
    
    public String transitaAuto(Automobile a, String Nome) {
        boolean sem=false;
        boolean tmp=false;
        for (Parcheggio t : parcheggi) {
            if(t.elimina(t.trova(a))){
                tmp=true;
            }
        }
        
        if(tmp){
            for(Parcheggio t:parcheggi){
                if(t.getNome().equals(Nome)){
                    a.viaggia();
                    if(t.AddAuto(a)){
                        sem=true;
                    }
                }
            }
        }
        
        if(sem){
            return "auto con targa "+a.getTarga()+" transitata con successo nel parcheggio "+Nome;
        }
        else return "impossibile transitare l'auto con targa "+a.getTarga();
        

    }
    
    

}
