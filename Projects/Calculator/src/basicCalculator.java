import java.util.Scanner;

public class basicCalculator {

    float primeiroNumero;
    float segundoNumero;
    String operador;
    float resultado;



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
                resultado = primeiroNumero + segundoNumero;
                System.out.println("O resultado de  " + primeiroNumero + " + " + segundoNumero + " = " + resultado);
                break;

            case "-":
                resultado = primeiroNumero - segundoNumero;
                System.out.println("O resultado de  " + primeiroNumero + " - " + segundoNumero + " = " + resultado);
                break;

            case "x":
                resultado = primeiroNumero * segundoNumero;
                System.out.println("O resultado de  " + primeiroNumero + " x " + segundoNumero + " = " + resultado);
                break;

            case "/":
                if (segundoNumero == 0) {
                    System.out.println("Divisão por zero não é permitida!");
                }
                else {
                resultado = primeiroNumero / segundoNumero;
                System.out.println("O resultado de  " + primeiroNumero + " / " + segundoNumero + " = " + resultado);
                break;
                }

            default:
                System.out.println("Operação invalida");
        }
    }
}
