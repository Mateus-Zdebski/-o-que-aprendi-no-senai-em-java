/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projexer2.oop2;

/**
 *
 * @author mateus_zdebski
 */
public class Futebol {
    private String clube;
    private int nrgols;

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public int getNrgols() {
        return nrgols;
    }

    public void setNrgols(int nrgols) {
        this.nrgols = nrgols;
    }
    public String toString(){
        String saida;
         saida = "\Quantos gol" + getNrgols() +
                     "\O nome do clube" + getClube() ;
                return saida;
    }
    }
