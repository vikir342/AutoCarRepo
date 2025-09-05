
public class ClasseCarros extends ClasseAutomotores {
    int quantidadePortas;

    public ClasseCarros(String cor, String marca, String modelo, String tipo, int quantidadePortas) {
        super(cor, marca, modelo, tipo);
        this.quantidadePortas = quantidadePortas;
    }

    // Getters
    public int pegarQuantidadePortas() {
        return quantidadePortas;
    }

    // Setters
    public void alterarQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    

}
