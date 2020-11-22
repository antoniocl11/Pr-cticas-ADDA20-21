package ejercicios;

public class ejercicio3Iterativo {

	private static Long potenciaExterno(Long a, Integer n) {
		// metodo de apoyo que calcula la potencia de un numero
		long res = 1;
		Integer i = 1;

		while (i <= n) {
			res = res * a;
			i++;

		}

		return res;

	}

	public static Long potenciaIterativo(Long a, Integer n) {
		long res = 1;
		long res1 = 0;// ac para a^2

		while (n > 0) {

			if (n % 2 == 1) {

				res = potenciaExterno(a, n / 2);
				res1 = (int) (potenciaExterno(res, 2) * a);// (a^n/2)^2*a
				return res1;
			}

			else if (n % 2 == 0) {
				res = potenciaExterno(a, n / 2);
				res1 = potenciaExterno(res, 2);// (a^n/2)^2
				return res1;
			}
			// sino res = 1 (n==0)
		}

		return res;

	}

}
