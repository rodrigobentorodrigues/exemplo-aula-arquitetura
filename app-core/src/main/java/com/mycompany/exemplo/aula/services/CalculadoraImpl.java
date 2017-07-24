package com.mycompany.exemplo.aula.services;

import com.mycompany.exemplo.aula.IFCalculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 */
@Stateless
@Remote(IFCalculadora.class)
public class CalculadoraImpl implements IFCalculadora{

    @Override
    public int somar(int a, int b) {
        return a+b;
    }

}
