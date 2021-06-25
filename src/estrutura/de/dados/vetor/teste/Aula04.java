package estrutura.de.dados.vetor.teste;

import estrutura.de.dados.vetor.Vetor;

public class Aula04 {

    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        try {
            vetor.adiciona("Oi");
            vetor.adiciona("Teste");
            vetor.adiciona("Pedro");
            vetor.adiciona("Cachorro");
            vetor.adiciona("Cenoura");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
    }
}
