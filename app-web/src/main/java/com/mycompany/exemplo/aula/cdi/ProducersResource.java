package com.mycompany.exemplo.aula.cdi;

import com.mycompany.exemplo.aula.IFCalculadora;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    
    @Produces 
    @Resource(lookup = "java:global/exemplo-aula-core/CalculadoraImpl")
    private IFCalculadora calculadora;

}
