package ejercicios;


public class ejercicio2Iterativo {

	public static Boolean multiploIterativo(Integer a, Integer b) {
		
		Boolean res = true;
		
		/*if(a<b) {
			res = false;
		}*/
		while(a>0) {
			a=a-b;
			
			if(a>0 && a<b) {
				res = false;
			}
			
		}	
		return res;
	}
	

	


}
