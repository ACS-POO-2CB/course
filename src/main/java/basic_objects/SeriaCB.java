package basic_objects;

public class SeriaCB {
	private Integer nrStudenti;


	public SeriaCB() {
		this(100);
	}

	/**
	 * @param nrStudenti
	 */

	private SeriaCB(int nrStudenti) {
		this.nrStudenti = nrStudenti;
	}

	public int getNrStudenti() {
		return nrStudenti;
	}

	public void setNrStudenti(int nrStudenti) {
		this.nrStudenti = nrStudenti;
	}

	public void modifica(SeriaCB x) {
		x.nrStudenti++;
	}

	public static void main(String[] args) {
		SeriaCB s1 = new SeriaCB(120);
		s1.modifica(s1);
		System.out.println(s1.getNrStudenti());
	}

}
