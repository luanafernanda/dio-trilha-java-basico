package edu.luana.primeirasemana;

public class UsuarioTv {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Tv ligada? " + smartTv.ligada);
    System.out.println("Volume atual: " + smartTv.volume);
    smartTv.aumentarVolume();
    System.out.println("Volume atual: " + smartTv.volume);

  }
}
