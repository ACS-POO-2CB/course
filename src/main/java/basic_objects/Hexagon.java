package basic_objects;

public class Hexagon {
	static int no1, no2;

	static {
		no1 = 3;
		no2 = 5;
	}

	int latura;
	int diagonala;
	String text;

	/**
	 * Constructorul implicit
	 * @param latura
	 * @param diagonala
	 */
	public Hexagon(int latura, int diagonala) {
		super();
		this.latura = latura;
		this.diagonala = diagonala;
		no1 += this.latura;
	}

	public Hexagon() {
	}

	public static void schimbaCeva(Hexagon[] h) {
		Hexagon h2 = new Hexagon();
		h2.setLatura(h[0].getLatura() * 2);
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

		String text = "LA";
		schimbaCeva2(text);
		System.out.println(text);
	}

	int getPerimetru() {
		return 6 * latura;
	}

	public int getLatura() {
		return latura;
	}

	public void setLatura(int latura2) {
		latura = latura2;
	}
}
