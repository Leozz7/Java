package com.classesInternas.test;

public class classesExternas01 {
    private String nome = "Monkey D. Luffy";

    class interna {
        public void printClasseExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(classesExternas01.this);
        }
    }

    public static void main(String[] args) {
        classesExternas01 c = new classesExternas01();

        interna i = c.new interna();

        i.printClasseExterna();
    }
}
