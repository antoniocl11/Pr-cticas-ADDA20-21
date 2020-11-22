package ejercicios;

public class ejercicio3RecursivoFinal {

	public static Long potenciaRecursivoFinal(long a, Integer n) {
		return potenciaRecursivoFinal(a, n, 1);
	}

	private static Long potenciaRecursivoFinal(long a, Integer n, long res) {

		if (n > 0) {

			if (n % 2 == 1) {
				return potenciaRecursivoFinal(a * a, n / 2, res * a);// (a^n/2)^2*a
			}

			else if (n % 2 == 0) {
				return potenciaRecursivoFinal(a * a, n / 2, res);// (a^n/2)^2
			}
		}
		// sino res = 1 (n==0)

		return res;
	}

}
