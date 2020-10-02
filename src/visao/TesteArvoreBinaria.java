/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.Arvore;

import modelo.Pessoa;

/**
 *
 * @author 
 */
public class TesteArvoreBinaria {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        
       
        
        
        arvore.adicionar(32);
        arvore.adicionar(14);
        arvore.adicionar(35);
        arvore.adicionar(9);
        arvore.adicionar(13);
        arvore.adicionar(15);
        arvore.adicionar(45);
        arvore.adicionar(55);
        
        arvore.adicionar(54);
        arvore.adicionar(19); 
        arvore.adicionar(69);
        arvore.adicionar(60);
        arvore.adicionar(37);
        arvore.adicionar(5);
        arvore.adicionar(21);
        arvore.adicionar(24);
        arvore.adicionar(17);
        arvore.adicionar(44);
        arvore.adicionar(59);
        
     
       
        
       System.out.println(arvore.pesquisar(14));
        
        arvore.remover(5);
      //  arvore.remover(pesso2);
      //   System.out.println(arvore.pesquisar(14));
        
       // System.out.println(arvore.pesquisar(6));
       arvore.InOrder();
       
        
    }
}
