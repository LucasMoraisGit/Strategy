
public class Aritmetica implements ICalcMedia {
	  @Override
	    public double calcularMedia(double P1, double P2) {
	        return (P1+P2)/2;
	    }

	    @Override
	    public String situacao(double media) {
	        if(media>5){
	            return "Aprovado";
	        }
	        else{
	            return "Não aprovado";
	        }
	    }
}
