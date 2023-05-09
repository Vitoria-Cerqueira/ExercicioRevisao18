//        Escreva um programa para inserir um elemento (posição específica)
//        em uma lista.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExDois {
    static Scanner teclado = new Scanner(System.in);

    static List<String> nomes = new ArrayList<>(3);

    public static void main(String[] args) {

        System.out.println("Digite os nomes: ");
        for (int i = 0; i < 3; i++) {
            nomes.add(teclado.next());
        }

        System.out.println("Qual nome voce quer adicionar?");
        nomes.add(2, teclado.next()); // aqui eu escolhi onde ia ser adicionado o nome


        // criei um for só pra mostrar o conteudo da lista um embaixo do outro.
        // mas podia ser só um system.out.print com o nomes e iria mostrar tudo dentro de um colchete.
        System.out.println(" ---------- Lista atualizada ------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }


    }

}
