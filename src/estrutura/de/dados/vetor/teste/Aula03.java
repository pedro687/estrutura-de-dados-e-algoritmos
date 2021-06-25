package estrutura.de.dados.vetor.teste;

import estrutura.de.dados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
        try {
            vetor.adiciona("Oi");
            vetor.adiciona("oioi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
