package unidade1.gabarito_aula3;

public class TestaAluno ()

    public static void main(String[] args) {

        Aluno ramon = new Aluno();
        ramon.setNomeDoAluno("Ramon Roney")
        ramon.setNota1(10);
        ramon.setNota2(0);
        ramon.setNota3(5);
        System.out.println();
        System.out.println(ramon);
        System.out.println(ramon.getNomeEmMaisuculo);
        System.out.println(ramon.getNomeEmMinusculo);

        if (ramon.aprovadoMedia())
            System.out.println("passou ");
        else
        System.out.println("Se fudeu, tirou " + ramon.ge);
        