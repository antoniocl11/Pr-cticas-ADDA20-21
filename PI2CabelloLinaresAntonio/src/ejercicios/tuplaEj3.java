package ejercicios;

public class tuplaEj3 {


	public static tuplaEj3 initial(long a, Integer n) {

		return new tuplaEj3(a, n, 1);
	}

	public static tuplaEj3 of(Long a, Integer n, long res) {
		return new tuplaEj3(a, n, res);
	}

	public final Long a;
	public final Integer n;
	public final Long res;


	public tuplaEj3(Long a, Integer n, long res) {
		super();
		this.a = a;
		this.n = n;
		this.res = res;

	}
	

	public tuplaEj3 next() {
		Long a = this.a;
		Integer n = this.n;
		Long res = this.res;

		if (n % 2 == 1) {
			res = res * a;
		}

		a = a * a;
		n = n / 2;

		return tuplaEj3.of(a, n, res);

	}

	public Boolean guard() {
		return n > 0;
	}

	@Override
	public String toString() {
		return "tuplaEj3 [a=" + a + ", n=" + n + ", res=" + res + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((n == null) ? 0 : n.hashCode());
		result = prime * result + (int) (res ^ (res >>> 32));
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
		tuplaEj3 other = (tuplaEj3) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (n == null) {
			if (other.n != null)
				return false;
		} else if (!n.equals(other.n))
			return false;
		if (res != other.res)
			return false;
		return true;
	}


	
	


}
