package com.classesInternas.test;

public class classesExternas03{
    static class ninho {
        private String sobrenome = "Sena";
        String print() {
            return (new classesExternas03().nome + " " + sobrenome);
        }
    }

    private String nome = "Leandro";
    public static void main(String[] args) {
        ninho n = new ninho();
        System.out.println(n.print());
    }
}
