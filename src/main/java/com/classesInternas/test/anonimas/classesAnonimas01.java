package com.classesInternas.test.anonimas;

import com.classesInternas.test.anonimas.dominio.Animal;

public class classesAnonimas01 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void andar() {
                System.out.println("O cachorro está andando");
            }
        };
        a.andar();
    }
}
