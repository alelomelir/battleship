import java.util.Random;
//import java.util.Scanner;

public class battleship {

    public static void main(String[] args) {

        // int coor1;
        // int coor2;

        Random rand = new Random();
        int random = rand.nextInt(9);

        int[][] arregloBi = new int[2][2];
        {
            int i = 0;
            int j = 0;
            for (i = 0; i < 2; i++) {
                for (j = 0; j < 2; j++) {
                    arregloBi[i][j] = rand.nextInt(10);
                }
            }
            int[][] arreglo3 = new int[2][2];
            for (i = 0; i <= 2; i++) {
                for (j = 0; j <= 2; j++) {
                    System.out.println(arregloBi[i][j]); // i y j para que sea dinamico
                    arreglo3[i][j] = arregloBi[i][j];
                }
            }
            for (i = 0; i <= 2; i++) {
                for (j = 0; j <= 2; j++) {

                }
            }

            // Scanner coordenada = new Scanner(System.in);
        }

    }

}
