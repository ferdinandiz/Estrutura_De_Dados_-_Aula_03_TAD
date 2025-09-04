package com.aula.classe;

import com.aula.iClasse.Fila;

import java.util.NoSuchElementException;

public class FilaSimples<T> implements Fila<T> {
    private Object[] dados;
    private Integer inicio;
    private Integer fim;
    private Integer tamanho;

    public FilaSimples(Integer capacidadeInicialDaNossaFila){
        this.dados = new Object[capacidadeInicialDaNossaFila];
        this.inicio = 0;
        this.fim = 0;
        this.tamanho = 0;
    }

    public FilaSimples(){
        this(10);
    }

    @Override
    public void enfileirar(T item) {
        if(tamanho == dados.length){
            redimensionar(dados.length * 2);
        }
        dados[fim] = item;
        fim = (fim+1)% dados.length;
        tamanho++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T desenfileirar() {
        if(vazia()) throw new NoSuchElementException("Fila está Vazia!");
        T item = (T) dados[inicio];
        dados[inicio] = null;
        inicio = (inicio+1)%dados.length;
        tamanho--;

        if(tamanho>0 && tamanho == dados.length/4){
            redimensionar(dados.length/2);
        }
        return item;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T primeiro() {
        if(vazia())throw new NoSuchElementException("Fila Vazia!");
        return (T)dados[inicio];
    }

    @Override
    public Boolean vazia() {
        return tamanho == 0;
    }

    @Override
    public Integer tamanho() {
        return tamanho;
    }

    private void redimensionar(int novoTamanho) {
        Object[] novo = new Object[Math.max(5,novoTamanho)];
        for(int i=0;i<tamanho;i++){
            novo[i] = dados[(inicio+i)%dados.length];
        }
        dados = novo;
        inicio=0;
        fim=tamanho;
    }

    public void printFila(){
        System.out.println("Impressão da Fila: ");
        if(vazia()){
            System.out.println("** vazia **");
        } else {
            System.out.print(dados[inicio]);
            for (int i=inicio+1;i<inicio+tamanho;i++){
                System.out.print(" - "+dados[i]);
            }
            System.out.println();
        }

    }
}
