// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[][] matrizA = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 6, 7, 16},
                {9, 10, 11, 12}
        };

        int[][] submatrizB = {
                {6, 7},
                {10, 11}
        };

        int ocorrencias = Matriz.contarSubmatriz(matrizA, submatrizB);
        System.out.println("A Submatriz B pode ser encontrada " + ocorrencias + " vezes dentro da matriz A.");

    }
}