package com.kleberaluizio.search;

public class Main {
    public static void main(String[] args){
        String name = "da";

        Thread threadSignature1 = new Thread(new TextSearchTask("assinaturas1.txt", name));
        Thread threadSignature2 = new Thread(new TextSearchTask("assinaturas2.txt", name));
        Thread threadAuthors = new Thread(new TextSearchTask("autores.txt", name));

        threadSignature1.start();
        threadSignature2.start();
        threadAuthors.start();

    }
}
