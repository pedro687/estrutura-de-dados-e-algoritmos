package estrutura.de.dados.vetor;

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

}
