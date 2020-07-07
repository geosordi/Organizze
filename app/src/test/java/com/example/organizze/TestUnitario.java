package com.example.organizze;

import com.example.organizze.model.Usuario;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestUnitario {
    @Test
    public void validarDespesaInicial(){
        Usuario usuario = new Usuario();
        Double esperado = 0.00;
        assertEquals(esperado, usuario.getDespesaTotal());
    }

    @Test
    public void validarDespesaInicialNula(){
        Usuario usuario = new Usuario();
        //Double esperado = null;
        //assertFalse(String.valueOf(usuario.getDespesaTotal().equals(esperado)), false);
        Assert.assertNotNull(usuario.getDespesaTotal());
    }

    @Test
    public void validarReceitaInicial(){
        Usuario usuario = new Usuario();
        Double esperado = 0.00;
        assertEquals(esperado, usuario.getReceitaTotal());
    }

    @Test
    public void validarReceitaInicialNula(){
        Usuario usuario = new Usuario();
        //Double esperado = null;
        //assertFalse(String.valueOf(usuario.getReceitaTotal().equals(esperado)), false);
        Assert.assertNotNull(usuario.getReceitaTotal());
    }
}
