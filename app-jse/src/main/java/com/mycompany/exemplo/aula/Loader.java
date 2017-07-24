/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.aula;

import javax.swing.JOptionPane;

/**
 *
 * @author ifpb
 */
public class Loader {
    
    public static void main(String[] args) {
        String nome = "java:global/exemplo-aula-core/CalculadoraImpl";
        
        
        IFCalculadora calculadora = new ServiceLocator().
                lookup(nome, IFCalculadora.class);

        System.out.println(calculadora.somar(55, 1580616));
    }
    
}
