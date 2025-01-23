import java.util.Scanner;

public class basicCalculator {

    int primeiroNumero;
    int segundoNumero;
    String operador;


    Scanner sc = new Scanner(System.in);

    public void calculadoraBasica(){
        System.out.print("Digite o primeiro Numero: ");
        primeiroNumero = sc.nextInt();
        System.out.print("Digite a operação desejada [x,/,+,-]: ");
        sc.nextLine();
        operador = sc.nextLine();
        System.out.print("Digite o segundo Numero: ");
        segundoNumero = sc.nextInt();
        switch (operador) {
            case "+":
                System.out.printf("Resultade de %d + %d = %d",primeiroNumero,segundoNumero,(primeiroNumero+segundoNumero));
                break;

            case "-":
                System.out.printf("Resultade de %d - %d = %d",primeiroNumero,segundoNumero,(primeiroNumero-segundoNumero));
                break;

            case "x":
                System.out.printf("Resultade de %d x %d = %d",primeiroNumero,segundoNumero,(primeiroNumero*segundoNumero));
                break;

            case "/":
                System.out.printf("Resultade de %d - %d = %d",primeiroNumero,segundoNumero,(primeiroNumero/segundoNumero));
                break;

            default:
                System.out.println("Operação invalida");
        }
    }
}
