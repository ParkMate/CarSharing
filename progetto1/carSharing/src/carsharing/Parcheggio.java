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
    
    public Parcheggio(String nome, int nPosti){
        this.nome=nome;
        this.nPosti=nPosti;
        this.automobili=new ArrayList<Automobile>();
    }
    
    public boolean AddAuto(Automobile auto){
        if(automobili.size() == nPosti){
            return false;
        }
        else{ 
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
        return "Parcheggio{" + "nome=" + nome + ", nPosti=" + nPosti + ", automobili=" + automobili + '}';
    }

    public ArrayList<Automobile> getAutomobili() {
        return automobili;
    }

    public void setAutomobili(ArrayList<Automobile> automobili) {
        this.automobili = automobili;
    }
    
    public int getCount(){
        return automobili.size();
    }
    
    
    
    
}
