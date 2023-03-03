package edu.luana.primeirasemana;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres
 * e diga quantas consoantes foramlidas.
 * Imprima as consoantes.
 */
public class Consoantes {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    String[] consoantes = new String[6];
    int quantidadeConsonantes = 0;
    int contador = 0;

    do {
      System.out.println("Escreva uma letra:");
      String letra = leitor.next();

      if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
          | letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
        consoantes[contador] = letra;
        quantidadeConsonantes++;
      }
      contador++;
    } while (contador < consoantes.length);

    System.out.println("Consoantes: ");
    for (String consoante : consoantes) {
      if (consoante != null)
        System.out.print(consoante + " ");
    }
    System.out.println("\neQuantidae de consoantes: " + quantidadeConsonantes);
  }
}
