
public class Disciplina {
	 private double media;
	    private String nome;
	    private double P1;
	    private double P2;
	    private String situacao;

	    private ICalcMedia calcula;

	    public double getMedia() {
	        return media;
	    }

	    public void setMedia(double media) {
	        this.media = media;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getP1() {
	        return P1;
	    }

	    public void setP1(double p1) {
	        P1 = p1;
	    }

	    public double getP2() {
	        return P2;
	    }

	    public void setP2(double p2) {
	        P2 = p2;
	    }

	    public String getSituacao() {
	        return situacao;
	    }

	    public void setSituacao(String situacao) {
	        this.situacao = situacao;
	    }

	    public ICalcMedia getCalcula() {
	        return calcula;
	    }

	    public void setCalcula(ICalcMedia calcula) {
	        this.calcula = calcula;
	    }

	    public Disciplina(ICalcMedia calcula){
	        this.calcula = calcula;
	    }

	    public void calcularMedia(){
	        setMedia(calcula.calcularMedia(this.P1,this.P2));
	        setSituacao(calcula.situacao(getMedia()));
}
}
