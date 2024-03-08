import java.util.Random;
import java.util.Scanner;

public class battleship {

    public static void main(String[] args) {

        Random rand = new Random();
        int c1 = rand.nextInt(10);
        int c2 = rand.nextInt(10);

        char[][] arregloBi = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arregloBi[i][j] = '*';
            }
        }

        arregloBi[c1][c2] = '<'; // guardando el barco en el arreglo bidimensional en las coordenadas aleatorias

        int coor1 = 0;
        int coor2 = 0;

        Scanner scnr = new Scanner(System.in);

        int vidas = 5;
        while (vidas > 0) {

            System.out.println("Introduce la coordenada x (letra): ");
            coor1 = ParseInt(scnr.next().charAt(0));

            // char coor1Chart = ' ';
            // coor1Chart = scnr.next().charAt(0);
            // int coor1Num = ParseInt(coor1Chart);

            System.out.println("Introduce la coordenada y (numero): ");
            coor2 = scnr.nextInt();

            if (arregloBi[coor1][coor2] == '<') {
                System.out.println("Le atinaste!!!!");
                vidas = 0;
            } else {
                System.out.println("No le atinaste :(");
                vidas--;
                System.out.println("Te restan " + vidas + " vidas");

            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(' ');
                System.out.print(' ');
                System.out.print(arregloBi[i][j]);
            }
            System.out.println("");
        }
    }

    public static int ParseInt(char coordenada) { // se crea una funcion que recibe la coordenada (char) y regresa un
                                                  // numero
        char[] aux = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'j' }; // arreglo de caracteres, el aux contiene el
                                                                           // arreglo
        int temp = 0; // variable para guardar la posicion en la que esta el caracter

        for (int i = 0; i < aux.length; i++) {
            if (coordenada == aux[i]) {// compara coordenada con aux en la posicion i
                temp = i + 1; // aumenta uno
                break;
            }
        }
        return temp; // regresa la posicion
    }

}
