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
public class Nadador extends Atleta{
    private int mnad;
    private String tipoNado;

    public int getMnad() {
        return mnad;
    }

    public void setMnad(int mnad) {
        this.mnad = mnad;
    }

    public String getTipoNado() {
        return tipoNado;
    }

    public void setTipoNado(String tipoNado) {
        this.tipoNado = tipoNado;
        
        
    }
    public String toString(){
        String saida;
        saida =
                "Nome:....."   + super.getNome() + 
                "\nIdade:...." + super.getIdade() +
                "\metros nadado:....."   + getMnad() +
                "\tipo nadado:" +  getTipoNado() ;
       
        
                return saida;
    }
}
