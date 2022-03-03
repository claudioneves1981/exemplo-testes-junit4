package com.teste;

public class CalculadoraNova {

    public int somar(int ...valores){
        // return 0; //test fail
        // return valorA + valorB; test passed dois valores
        int soma = 0;
        for(int valor : valores){
            soma += valor;
        }
        return soma;
    }

}
