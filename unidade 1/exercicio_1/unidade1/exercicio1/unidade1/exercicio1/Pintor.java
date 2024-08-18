package unidade1.exercicio1;

public class Pintor {
    private String nomeArtista;
    private String epoca;

    // Construtor
    public Pintor(String nomeArtista, String epoca) {
        this.nomeArtista = nomeArtista;
        this.epoca = epoca;
    }

    // Método para exibir os atributos
    @Override
    public String toString() {
        return "Pintor: " + nomeArtista.toUpperCase() + ", Época: " + epoca;
    }

    public static void main(String[] args) {
        // Criando três instâncias de pintores famosos
        Pintor pintor1 = new Pintor("Vincent van Gogh", "Pós-Impressionismo");
        Pintor pintor2 = new Pintor("Claude Monet", "Impressionismo");
        Pintor pintor3 = new Pintor("Pablo Picasso", "Cubismo");

        System.out.println(pintor1);
        System.out.println(pintor2);
        System.out.println(pintor3);
    }
}
