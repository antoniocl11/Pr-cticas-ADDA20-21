package ejercicios;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class ejercicio2Funcional {

	public static Boolean multiploFuncional(Integer a, Integer b) {
		final Predicate<Integer> pred = p -> p > 0 && p < b;

		Boolean res = Stream.iterate(a, t -> t > 0, t -> t - b).noneMatch(pred);

		return res;
	}

}
