import java.awt.Color;

public class Masina implements Cloneable{
	private String marca;
	private Color culoare;
	
	public Masina(Color culoare, String marca)
	{
		this.culoare = culoare;
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Color getCuloare() {
		return culoare;
	}

	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}

	@Override
	public String toString() {
		return "Masina [culoare=" + culoare.toString() + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	


}
