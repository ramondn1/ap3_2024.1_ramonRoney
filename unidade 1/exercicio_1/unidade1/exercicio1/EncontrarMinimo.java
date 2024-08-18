import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EncontrarMinimo {

    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();

        Random geradorAleatorio = new Random();

        for (int i = 0; i < 10000; i++) {
            listaDeNumeros.add(geradorAleatorio.nextInt(10000) + 1);
        }

        int menorValor = Integer.MAX_VALUE;

        for (int valor : listaDeNumeros) {
            if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("O menor valor encontrado na lista é: " + menorValor);
    }
}
