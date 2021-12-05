

import java.io.*;
import java.util.*;
// Matriu simètrica:

/* Donada una taula quadrada numèrica d'enters de dimensió n, determina si és simètrica. Una taula quadrada és simètrica si el elements simètrics respecte de la diagonal principal són iguals. Imprimeix {TRUE | FALSE} segons si és o no simètrica.

Input Format

Tamany N de la matriu quadrada. NxN nombres corresponents a la matriu.

Constraints

No n'hi ha.

Output Format

{TRUE | FALSE}

Sample Input 0

3
1 2 3
2 4 100
3 100 5
Sample Output 0

TRUE
Explanation 0

Tots els elements que no formen part de la diagonal tenen el seu "mirall". Per exemple l'element de la matriu (0,1) és el mateix que l'element (1,0). Per qualsevol element (i,j), sempre que i!=j, serà igual a l'element (j,i) per a que la matriu sigui simètrica.

Sample Input 1

4
1 0 0 0
0 1 0 0
0 0 1 0
0 0 1 1
Sample Output 1

FALSE

 */


public class Solution
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Grosor = sc.nextInt();
        int [][] Cuadrado = new int [Grosor][Grosor];

        for (int x = 0; x < Grosor; x++)
        {
            for ( int y = 0; y < Grosor; y++)
            {
                Cuadrado[x][y] = sc.nextInt();
            }

        }
        boolean validator = true;
        for ( int x = 0; x < Grosor;x++)
        {
            for (int y = 0; y < Grosor;y++)
            {
                if (Cuadrado[x][y] != Cuadrado[y][x])
                {
                    validator = false;
                }
            }
        }
        if (validator)
        {
            System.out.println("TRUE");

        }
        else
        {
            System.out.println("FALSE");
        }


    }
}
