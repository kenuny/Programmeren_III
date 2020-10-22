package domein;

public class GeneriekeKlasse<T>
{
	private T eersteAttribuut;

	public GeneriekeKlasse(T eersteAttribuut) {
		super();
		setEersteAttribuut(eersteAttribuut);
	}

	public T getEersteAttribuut() {
		return eersteAttribuut;
	}

	public final void setEersteAttribuut(T eersteAttribuut) {
		this.eersteAttribuut = eersteAttribuut;
	}

	@Override
	public String toString() {
		return String.format("%s", eersteAttribuut);
	}
	
	

}
