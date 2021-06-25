package estrutura.de.dados.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int quantidade) {
        this.elementos = new String[quantidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
            }
        }
    }*/

    public void adiciona(String elemento) throws Exception{
        if (this.tamanho < this.elementos.length){
            this.elementos[tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new  Exception("Este vetor ja está cheio, não foi possível adicionar");
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho-1 ; i++) {
            s.append(elementos[i]);
            s.append(",");
        }

        if (tamanho > 0) {
            s.append(elementos[tamanho-1]);
        }
        s.append("]");

        return s.toString();
    }
}
