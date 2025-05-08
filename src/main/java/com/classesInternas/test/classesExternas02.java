package com.classesInternas.test;

public class classesExternas02 {
    private String nome = "Leandro";

    void print(String p) {
        String sobrenome = "Sena";
        final class test {
            public void printTest() {
                System.out.println(p);
                System.out.println(nome + " " + sobrenome);
            }
        }
        test t = new test();
        t.printTest();
    }
    public static void main(String[] args) {
        classesExternas02 c = new classesExternas02();
        c.print("LZ");
    }
}
