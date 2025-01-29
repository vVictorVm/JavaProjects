
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        // TODO: Criar uma calculadora(BONITA) que mostre o historico de calculos.
        // Criar um array onde fica todos os resultados anteriores com a conta
        // ex: Conta 1: 3x7 = 21, Conta 2: 4/2 = 2.

        // Iniciar o Scanner
        Scanner sc = new Scanner(System.in);


        // Variaveis
        char escolha = ' ';

        // Iniciar Classes
        basicCalculator calulator = new basicCalculator();
        itens itens = new itens();

        // Iniciando o progama
        itens.linha();
        System.out.println(" - - - - - Calculadora - - - - -");
        System.out.println();
        System.out.print("Deseja iniciar o programa? [Sim/Não]: ");
        escolha = sc.nextLine().toUpperCase().charAt(0);
        itens.linha();

        while (escolha != 'S' && escolha != 'N') {
            System.out.print("Escolha incorreta!\n Deseja iniciar o programa? [Sim/Não]: ");
            escolha = sc.nextLine().toUpperCase().charAt(0);
        }

        while (escolha == 'S'){
            calulator.calculadoraBasica();
            itens.linha();
            System.out.print("Deseja iniciar um novo calculo? [Sim/Não]: ");
            escolha = sc.nextLine().toUpperCase().charAt(0);
        }
        if (escolha == 'N'){
            System.out.println("Encerrando o progama...");
        }






    }
}
