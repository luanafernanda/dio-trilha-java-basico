package edu.luana.primeirasemana;

import java.util.Random;

/*
 * Gere e eimpima uma matriz M 4x4 com valores entre (0-9)
 */
public class ArrayMultidimensional {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] M = new int[4][4];// primeira [] refere-se a linha e a segunda [] refere-se a coluna

    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M.length; j++) {
        M[i][j] = random.nextInt(9); // numero limite é 9
      }
    }

    System.out.println("Matriz: ");
    for (int[] linha : M) {
      for (int coluna : linha) {
        System.out.print(coluna + " ");
      }
      System.out.println();
    }
  }
}
