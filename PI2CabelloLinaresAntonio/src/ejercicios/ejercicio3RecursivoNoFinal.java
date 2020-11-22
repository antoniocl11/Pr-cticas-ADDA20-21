package ejercicios;

public class ejercicio3RecursivoNoFinal {

	public static Long potenciaRecursivoNoFinal1(Long a, Integer n) {
		return potenciaRecursivoNoFinal(a, n);
	}

	private static Long potenciaRecursivoNoFinal(Long a, Integer n) {

		long res = 1;

		if (n > 0) {

			if (n % 2 == 1) {

				res = potenciaRecursivoNoFinal(a * a, n / 2) * a;// (a^n/2)^2*a
			}

			else if (n % 2 == 0) {
				res = potenciaRecursivoNoFinal(a * a, n / 2);// (a^n/2)^2
			}
		}
		// sino res = 1 (n==0)

		return res;
	}

}
