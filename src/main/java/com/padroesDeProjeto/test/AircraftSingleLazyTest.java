package com.padroesDeProjeto.test;

import com.padroesDeProjeto.dominio.AircraftSingleLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingleLazyTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        comprarAssento("1A");
        comprarAssento("1A");
        System.out.println(AircraftSingleLazy.getINSTANCE());
        System.out.println(AircraftSingleLazy.getINSTANCE());
        Constructor<AircraftSingleLazy> constructor = AircraftSingleLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        constructor.newInstance("767-900");
        System.out.println(AircraftSingleLazy.getINSTANCE());
    }

    private static void comprarAssento(String assento) {
        System.out.println(AircraftSingleLazy.getINSTANCE());
        AircraftSingleLazy aviao = AircraftSingleLazy.getINSTANCE();
        System.out.println(aviao.comprarAssento(assento));
    }
}
