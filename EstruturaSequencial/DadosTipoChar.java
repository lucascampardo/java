import java.util.Scanner;

public class DadosTipoChar {
    
    public static void main(String[] args) {

        char x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um caractere: ");
        x = sc.next().charAt(0);

        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
