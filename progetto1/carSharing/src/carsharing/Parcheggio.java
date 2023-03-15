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
public class Parcheggio {

    private int nPosti;//posti massimi parcheggio
    private String nome;//nome del parcheggio
    private ArrayList<Automobile> automobili;//array delle automobili presenti nel parcheggio
    private static int nParcheggio=0;

    public Parcheggio(String nome, int nPosti) {
        this.nome = nome;
        this.nPosti = nPosti;
        this.automobili = new ArrayList<Automobile>();
    }

    public boolean AddAuto(Automobile auto) {
        if (automobili.size() == nPosti) {
            return false;
        } else {
            automobili.add(auto);
            return true;
        }
    }

    public int getnPosti() {
        return nPosti;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String stringa = "{" + "nome=" + nome + ", nPosti=" + nPosti + ", automobili= ";
        for(int i=0; i<automobili.size();i++){
            stringa+=automobili.get(i).toString();
        }
        stringa+="},";
        return stringa;
    }

    public ArrayList<Automobile> getAutomobili() {
        return automobili;
    }

    public void setAutomobili(ArrayList<Automobile> automobili) {
        this.automobili = automobili;
    }

    public int getCount() {
        return automobili.size();
    }
    public boolean elimina(Automobile a){
       return automobili.remove(a);
    } 
    
    public boolean elimina(ArrayList<Automobile> array){
        boolean sem=false;
        if(!(array.isEmpty())){
            sem = true;
            for(Automobile a:array){
                automobili.remove(a);
            }
        }
        else sem=false;
        return sem;
    } 
    
    public boolean elimina(int indice){
        boolean sem=false;
        if(indice == -1)
            sem=false;
        else{ automobili.remove(indice); sem=true;}
        
        return sem;
    }
            
            
    public Automobile trova(String targa){
        for(Automobile a:automobili){
            if(a.getTarga().equals(targa))
                return a;
        }
        return null;
    }
    
    public int trova(Automobile a){
        int indice=automobili.indexOf(a);
        return indice;
    }
    
    public ArrayList<Automobile> trova(int n){
        ArrayList<Automobile> array = new ArrayList<Automobile>();
        for(Automobile a:automobili){
            if(a.getnViaggi()>=n)
                array.add(a);
        }
        return array;
    }
    

}
