package basic_objects;

public class Hexagon {

	static int no1, no2;

	static {
		no1 = 3;
		no2 = 5;
	}

	static {
		no1 = 5;
		no2 = 6;
	}

	int latura;
	int diagonala;

	/**
	 * Constructorul implicit
	 * @param latura
	 * @param diagonala
	 */
	public Hexagon(int latura, int diagonala) {
		this.latura = latura;
		this.diagonala = diagonala;
		no1 ++;
	}

	public int getLatura() {
		return latura;
	}

	public static void schimbaCeva(Hexagon[] h) {
		Hexagon h2 = new Hexagon(2,2);
		h[0] = h2;
	}

	public static void schimbaCeva2(String text) {
		text += "a";
	}

	public static void main(String[] args) {
		Hexagon[] vect = new Hexagon[1];
		Hexagon h1 = new Hexagon(10, 10);
		System.out.println(h1.getLatura());
		vect[0] = h1;

		Hexagon.schimbaCeva(vect);
		System.out.println(vect[0].getLatura());
		System.out.println(no1+ " " + no2);

		String text = "LA";
		schimbaCeva2(text);
		System.out.println(text);
	}
}
