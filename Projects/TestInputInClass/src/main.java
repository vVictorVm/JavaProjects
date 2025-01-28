import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeTemporaria = sc.nextLine();
        System.out.println("Digite a idade do ninja: ");;
        int idadeTemporaria = sc.nextInt();
        System.out.println("Digite a aldeia do ninja: ");
        sc.nextLine();
        String aldeiaTemporaria = sc.nextLine();
        
        Ninjas ninja = new Ninjas(nomeTemporaria, idadeTemporaria, aldeiaTemporaria);
        System.out.println("ninja = " + ninja);
        
        
    }
}
