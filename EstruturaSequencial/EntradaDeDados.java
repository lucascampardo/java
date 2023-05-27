import java.util.Scanner;

public class EntradaDeDados {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Fazer um sc.close() quando não for mais usar o Scanner
 
        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:\n" + x);
        System.out.println(y);
        System.out.println(z);

        sc.close();


    }
}
