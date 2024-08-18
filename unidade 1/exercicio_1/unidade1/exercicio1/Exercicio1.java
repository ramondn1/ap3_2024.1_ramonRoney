package unidade1.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
  
  public static double calcularDistancia() {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe as coordenadas x e y dos dois pontos, na seguinte ordem:");
    
    double pontoX1 = entrada.nextDouble();
    double pontoY1 = entrada.nextDouble();
    double pontoX2 = entrada.nextDouble();
    double pontoY2 = entrada.nextDouble();

    double distanciaEntrePontos = Math.sqrt(Math.pow(pontoX2 - pontoX1, 2) + Math.pow(pontoY2 - pontoY1, 2));
    return distanciaEntrePontos;
  }

  public static double calcularDiferenca(){
    double numero1 = 0.0, numero2 = 1.1, numero3 = -3.3;
    return numero1 - numero2 - numero3;
  }

  public static void main(String[] args) {
    System.out.println("A distância calculada entre os pontos é: " + Exercicio1.calcularDistancia());
    System.out.println("A diferença calculada é: " + Exercicio1.calcularDiferenca());
  }
}
