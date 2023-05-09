//         Peça ao usuário dois números e exiba em ordem decrescente
//        (suponha números diferentes).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExQuatro {
    static Scanner teclado = new Scanner(System.in);
    static List <Integer> numero = new ArrayList<>();
    
    public static void main(String[] args) {
        numeroUsuario();
    }
    public static void numeroUsuario(){
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o primeiro numero inteiro:");
            numero.add(teclado.nextInt());
        }
        if (numero.get(0) < numero.get(1)) {
            System.out.println(numero.get(1) + " " + numero.get(0)); // get é pegar, ou seja, pegar o indice zero
        }
        else if (numero.get(1) < numero.get(0)){
            System.out.println(numero.get(0) + " " + numero.get(1));
        }
        else {
            System.out.println("ERR");
        }

        System.out.println(numero.size()); // pra saber o tamanho da lista
    }
}

