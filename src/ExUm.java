import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//        Escreva um programa para remover um elemento específico de uma
//        lista.
public class ExUm {
    static Scanner teclado = new Scanner(System.in);
    static  List<String> pessoas = new ArrayList<>();


    public static void main(String[] args) {

        listaNomes(qtaUsuario());
        removerNome();

    }
    public static int qtaUsuario (){
        System.out.println("Digite a quantidade de pessoas que você quer adicionar: ");
        int quantidade = teclado.nextInt();

        return quantidade;
    }

    public static void listaNomes(int quantidade){
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um nome: ");
            pessoas.add(teclado.next());

        }
        System.out.println("Nomes digitados: " + pessoas);

    }
    public static void removerNome (){
        System.out.println("Voce deseja remover algum nome da lista? \n 1-SIM  2-NÃO");
        int remove = teclado.nextInt();

        switch (remove){
            case 1:
                System.out.println("Qual nome voce deseja remover: ");
                pessoas.remove(teclado.next());
                System.out.println("---------------------- Lista atualizada ------------------------");
                for (int i = 0; i < pessoas.size(); i++) {
                    System.out.println(pessoas.get(i));
                    System.exit(0);
                }
            case 2:
                System.out.println("Finalizando o programa");
                break;

        }
    }
}