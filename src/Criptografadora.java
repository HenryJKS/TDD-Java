//Classe que faz criptografia
public class Criptografadora {
	
	//Método de criptografia
	public int criptografar(String letra) {

		if (letra == "A") {
			return 19;
		} else if (letra == "B") {
			return 11;
		} else  if (letra == "C"){
			return 71;
		} else {
			return 0;
		}

	}
	
	
	public int ProgX(boolean x, int y, int z, int w) {
		if (x == false) {
			y += 1;
		} else {
			return y -= 1;
		}
		
		if (w + z >= 72) {
			y += 2;
		} else {
			y -= 2;
		}
		return y;
		
	}
	
}

