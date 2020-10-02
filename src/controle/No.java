/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;


/**
 *
 * @author 
 */
public class No {
    
    private int inteiro;
    private No esquerda;
    private No Direita;

    public No() {
    }

    
  

    public No(int inteiro) {
        this.inteiro =inteiro;
    }

   


    public int getInt() {
        return inteiro;
    }

    public void setInt(int inteiro) {
        this.inteiro =inteiro;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return Direita;
    }

    public void setDireita(No Direita) {
        this.Direita = Direita;
    }
    
    
    
}
