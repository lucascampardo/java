public class operadores_aritmeticos {
    public static void main(String[] args) {
        /*
        * Operadores aritméticos
        * + para Adição
        * - para Subtração
        * * para multiplicação
        * '/' para divisão
        * % para resto de divisão(módulo)
        *
        * Regra de Precedência: 1° lugar -> Multiplicação, Divisão, Módulo
        * 2° lugar -> Adição, Subtração */

        int n1 = 2 * 6 / 3; // 4
        int n2 = 3 + 2 * 4; // 11
        int n3 = (3 + 2) * 4; // 20
        int n4 = 60 / (3 + 2) * 4; // 48
        int n5 = 60 / ((3 + 2) * 4); // 3
        int n6 = 14 % 3; // 2
        int n7 = 19 % 5; // 4
    }
}
