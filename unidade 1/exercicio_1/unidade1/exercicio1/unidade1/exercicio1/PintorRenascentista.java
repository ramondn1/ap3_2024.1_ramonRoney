package unidade1.exercicio1;

public class PintorRenascentista {
    private String nome;
    private String estilo;

    public PintorRenascentista(String nome, String estilo) {
        this.nome = nome;
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome.toUpperCase() + ", Estilo: " + estilo;
    }

    public static void main(String[] args) {
        PintorRenascentista pintor1 = new PintorRenascentista("Leonardo da Vinci", "Renascimento Italiano");
        PintorRenascentista pintor2 = new PintorRenascentista("Sandro Botticelli", "Renascimento Florentino");
        PintorRenascentista pintor3 = new PintorRenascentista("Michelangelo Buonarroti", "Alta Renascença");

        System.out.println(pintor1);
        System.out.println(pintor2);
        System.out.println(pintor3);
    }
}
