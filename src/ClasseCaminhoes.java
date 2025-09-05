
public class ClasseCaminhoes extends ClasseAutomotores {
    float cargaSuportadaAt;

    public ClasseCaminhoes(String corAt, String marcaAt, String modeloAt, String tipoAt, float cargaSuportadaAt) {
        super(corAt, marcaAt, modeloAt, tipoAt);
        this.cargaSuportadaAt = cargaSuportadaAt;
    }

    // Getter
    public float pegarCargaSuportadaAt() {
        return cargaSuportadaAt;
    }

    // Setter
    public void alterarCargaSuportadaAt(float cargaSuportadaAt) {
        this.cargaSuportadaAt = cargaSuportadaAt;
    }
}