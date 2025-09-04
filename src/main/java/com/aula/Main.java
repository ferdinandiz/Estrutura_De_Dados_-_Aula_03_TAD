package com.aula;

import com.aula.classe.FilaEncadeada;
import com.aula.classe.FilaSimples;

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
//        System.out.println("Primeiro Elemento: "+fila.primeiro());
//        System.out.println("Tamanho da fila: "+fila.tamanho());
//        System.out.println("Saiu da Fila: "+ fila.desenfileirar());
//        System.out.println("Primeiro Elemento: "+fila.primeiro());
//        System.out.println("Tamanho da fila: "+fila.tamanho());

        FilaSimples<String> filaSimples = new FilaSimples<>(5);
        filaSimples.enfileirar("7");
        filaSimples.enfileirar("10");
        filaSimples.enfileirar("6");
        filaSimples.printFila();
        System.out.println("Tamanho: "+filaSimples.tamanho());
        filaSimples.enfileirar("A");
        filaSimples.enfileirar("B");
        filaSimples.enfileirar("C");
        filaSimples.printFila();
        System.out.println("Tamanho: "+filaSimples.tamanho());
        System.out.println("Retirado: "+filaSimples.desenfileirar());
        filaSimples.printFila();
        System.out.println("Tamanho: "+filaSimples.tamanho());
        filaSimples.desenfileirar();
        filaSimples.desenfileirar();
        filaSimples.desenfileirar();
        filaSimples.desenfileirar();
        filaSimples.desenfileirar();
        filaSimples.printFila();

    }
}