package domein;

public class GeneriekeKlasseMetUpperBound<T extends Number>
{
	private T eersteAttribuut;

	public GeneriekeKlasseMetUpperBound(T eersteAttribuut) {
		super();
		this.eersteAttribuut = eersteAttribuut;
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
