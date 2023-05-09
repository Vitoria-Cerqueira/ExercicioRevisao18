//        Faça um programa que contenha um método que receba o tamanho
//        de uma lista como parâmetro e que retorne a lista com a capacidade
//        inicial recebida pelo usuário. Logo depois faça um método que adicione
//        valores nessa lista, os valores devem ser recebidos pelo usuário
//        respeitando a capacidade inicial além disso esse método deve retornar
//        true caso a adição seja bem sucedida e false caso o contrário. Por fim
//        um método que retorna a média aritmética dos números armazenados
//        na lista.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExTres {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Qual o tamanho da lista? ");
        int tamanhoLista = teclado.nextInt();

        List<Integer> listaDeNumeros = capacidade(tamanhoLista);

        adicionarNumeroLista(listaDeNumeros,tamanhoLista);

        mediaAritmetica(listaDeNumeros);

    }


    public static List <Integer> capacidade (int tamanhoLista){

        List <Integer> lista = new ArrayList<>(tamanhoLista);
        return lista;

    }
    public static boolean adicionarNumeroLista(List <Integer> lista, int tamanhoLista){ // aqui eu estou importando a lsita existente
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Informe um numero");
            lista.add(teclado.nextInt());

        }
        return true;
    }
    public static double mediaAritmetica(List <Integer> lista){
        int total =0;

        for (int i = 0; i <lista.size(); i++) {
            total += lista.get(i);
        }
        System.out.println("Total da soma dos numeros " + total);

        double media=0;

        media = (double) total /lista.size();
        System.out.println("A media dos numeros é: " + media);
        return media;

    }
}
