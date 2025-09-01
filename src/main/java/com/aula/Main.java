package com.aula;

import com.aula.classe.FilaEncadeada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FilaEncadeada<String> fila = new FilaEncadeada<>();

        fila.enfileirar("10");
        fila.enfileirar("A");
        fila.enfileirar("B");
        System.out.println("Primeiro Elemento: "+fila.primeiro());
        System.out.println("Tamanho da fila: "+fila.tamanho());
        fila.desenfileirar();
        System.out.println("Primeiro Elemento: "+fila.primeiro());
        System.out.println("Tamanho da fila: "+fila.tamanho());


    }
}