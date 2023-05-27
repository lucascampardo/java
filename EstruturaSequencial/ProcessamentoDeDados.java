public class ProcessamentoDeDados {

    // Programa que calcula a área de um trapézio
    public static void main(String[] args) {
        
        double b, B, h, area;
        // Sempre que a variável for do tipo double, é uma boa prática colocar o zero depois do ponto
    
        // Caso usar float, é necessário colocar o f depois do número

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);
    }
}