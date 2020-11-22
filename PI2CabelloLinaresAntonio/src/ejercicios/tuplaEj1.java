package ejercicios;

public class tuplaEj1 {
	
	
	public static tuplaEj1 initial(String cadena1, String cadena2){
		return new tuplaEj1(cadena1, cadena2, 0, cadena1.length(), 0);
	}
	
	public static tuplaEj1 of(String cadena1, String cadena2, Integer izquierda, Integer derecha, Integer posicion) {
		return new tuplaEj1(cadena1, cadena2, izquierda, derecha, posicion);
	}
	
	public final String cadena1;
	public final String cadena2;
	public final Integer izquierda;
	public final Integer derecha;
	public final Integer posicion;
	public final Integer it;
	
	public tuplaEj1(String cadena1, String cadena2, Integer izquierda, Integer derecha, Integer posicion) {
		super();
		this.cadena1 = cadena1;
		this.cadena2 = cadena2;
		this.izquierda = izquierda;
		this.derecha = derecha;
		this.posicion = posicion;
		this.it = (izquierda+derecha)/2;//es una propiedad derivada
	}
	
	//la funcion next es lo que contiene dentro el while
	//del metodo iterativo, calcula la siguiente tupla
	
	public tuplaEj1 next() {
		Integer izquierda = this.izquierda;
		Integer derecha = this.derecha;
		Integer it = this.it;
		Integer posicion = this.posicion;
		
		
		if (cadena1.charAt(it) == cadena2.charAt(it)) {
			
			if (cadena1.charAt(it) != cadena2.charAt(it)) { 
				posicion=it+1;
			}

			else {
				izquierda = it;
				it=(derecha+izquierda)/2;
			}
		}

		else if (cadena1.charAt(it) != cadena2.charAt(it)) {
			

			if (cadena1.charAt(it - 1) == cadena2.charAt(it - 1)) {
				posicion=it;
				it=(derecha+izquierda)/2;
			}

			else {
				derecha = it;
				it=(izquierda+derecha)/2;
			}
		}

		

		return tuplaEj1.of(this.cadena1, this.cadena2, izquierda, derecha, posicion);
		
		
	}
	
	//funcion guarda, lo que contiene el while
	public Boolean guard() {
		return izquierda <= derecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadena1 == null) ? 0 : cadena1.hashCode());
		result = prime * result + ((cadena2 == null) ? 0 : cadena2.hashCode());
		result = prime * result + ((derecha == null) ? 0 : derecha.hashCode());
		result = prime * result + ((it == null) ? 0 : it.hashCode());
		result = prime * result + ((izquierda == null) ? 0 : izquierda.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tuplaEj1 other = (tuplaEj1) obj;
		if (cadena1 == null) {
			if (other.cadena1 != null)
				return false;
		} else if (!cadena1.equals(other.cadena1))
			return false;
		if (cadena2 == null) {
			if (other.cadena2 != null)
				return false;
		} else if (!cadena2.equals(other.cadena2))
			return false;
		if (derecha == null) {
			if (other.derecha != null)
				return false;
		} else if (!derecha.equals(other.derecha))
			return false;
		if (it == null) {
			if (other.it != null)
				return false;
		} else if (!it.equals(other.it))
			return false;
		if (izquierda == null) {
			if (other.izquierda != null)
				return false;
		} else if (!izquierda.equals(other.izquierda))
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	
	

	
	
	
	
	
}
