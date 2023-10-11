import static java.lang.Math.sqrt;

public class Geometrica implements ICalcMedia {
	 @Override
	    public double calcularMedia(double P1, double P2) {
	        return sqrt(P1*P2);
	    }

	    @Override
	    public String situacao(double media) {
	        if(media>7){
	            return "Aprovado";
	        }
	        else{
	            return "Não aprovado";
	        }
	    }
}
