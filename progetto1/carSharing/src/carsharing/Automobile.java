/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carsharing;

/**
 *
 * @author matte
 */
public class Automobile {

    private String targa;
    private int nViaggi = 0;
    private String pos;

    public Automobile(String targa, String pos) {
        this.targa = targa;
        this.pos = pos;
    }

    public String getTarga() {
        return targa;
    }

    public int getnViaggi() {
        return nViaggi;
    }

    public String getPos() {
        return pos;
    }

    public void setnViaggi(int nViaggi) {
        this.nViaggi = nViaggi;
    }

    public void setPosPark(String pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Automobile{" + "targa=" + targa + ", nViaggi=" + nViaggi + ", pos=" + pos + '}';
    }

    public void viaggia() {
        nViaggi++;
    }

}
