package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterfaces;
import com.coderhouse.interfaces.SerVivoInterface;

public class Personas implements SerVivoInterface, AccionesInterfaces{

    @Override
    public void emitirSonido() {
        // TODO Auto-generated method stub
    }

    @Override
    public void moverse() {
        // TODO Auto-generated method stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
    }

    @Override
    public void dormir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dormir'");
    }

    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'respirar'");
    }

    @Override
    public void jugar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jugar'");
    }

}
