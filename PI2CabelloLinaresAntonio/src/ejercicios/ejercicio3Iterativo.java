package ejercicios;

import java.util.ArrayList;
import java.util.List;

import us.lsi.common.Files2;

public class ejercicio3Iterativo {

//	private static Long externo(Long a, Integer n) {
//
//		long res = 1;
//		Integer i = 1;
//
//		while (i <= n) {
//			res = res * a;
//			i++;
//
//		}
//
//		return res;
//
//	}
//
//	public static Long potenciaIterativo(Long a, Integer n) {
//		long res = 1;
//
//		while (n > 0) {
//
//			if (n % 2 == 1) {
//
//				res = externo(a, n / 2);
//
//			}
//			
//
//		}
//
//		return res;
//
//	}
	
	
	public static Long potenciaIterativo(Long a, Integer n) {
		
		long res = 1;
		
		while(n>0) {
			if(n%2==1) {
				res = res*a;
			}
			
			a=a*a;
			n = n/2;
		}
		
		return res;
	}


	public static void main(String[] args) {

		List<String> listaN = new ArrayList<>();
		listaN = Files2.linesFromFile("./ficheros/PI2Ej3DatosEntrada.txt");
		Integer i = 0;
		while (i < listaN.size()) {
			String[] sep = listaN.get(i).split(",");
			Long a = Long.valueOf(sep[0].trim());
			Integer n = Integer.valueOf(sep[1].trim());

			Long res = potenciaIterativo(a, n);
			System.out.println(res);
			i++;
		}

	

	}
}
