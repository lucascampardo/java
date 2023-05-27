// Exemplo 4
public class Casting {

    public static void main(String[] args) {

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        // Casting é a conversão de um tipo de dado para outro
        // Nesse caso, o resultado será um número de ponto flutuante, pois o casting foi feito para double
        resultado = (double) a / b;

        System.out.println(resultado);
    }
}