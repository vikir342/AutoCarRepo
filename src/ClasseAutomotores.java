
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
	  //setters
	  public void alterarCor(String corPar) {
		  this.corAt = corPar;
	  }
}
