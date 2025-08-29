
public class ClasseAutomotores {
	  String corAt;
	  String marcaAt;
	  String modeloAt;
	  String tipoAt;
	  
	  public ClasseAutomotores() {
		  
	  }
	  public ClasseAutomotores(String corPar, String marcaPar, String modeloPar, String tipoPar) {
		  this.corAt = corPar;
		  this.marcaAt = marcaPar;
		  this.modeloAt = modeloPar;
		  this.tipoAt = tipoPar;
	  }
	  //getters
	  public String pegarCor() {
	        return corAt;
	    }

	    public String pegarMarca() {
	        return marcaAt;
	    }

	    public String pegarModelo() {
	        return modeloAt;
	    }

	    public String pegarTipo() {
	        return tipoAt;
	    }
	      
	    // Setters 
	    public void alterarCor(String corPar) {
	        this.corAt = corPar;
	    }

	    public void alterarMarca(String marcaPar) {
	        this.marcaAt = marcaPar;
	    }

	    public void alterarModelo(String modeloPar) {
	        this.modeloAt = modeloPar;
	    }

	    public void alterarTipo(String tipoPar) {
	        this.tipoAt = tipoPar;
	    }
}
