
public class Student implements Cloneable{
	private String nume;
	private String prenume;
	private Masina m;
	
	public Masina getM() {
		return m;
	}

	public void setM(Masina m) {
		this.m = m;
	}

	public Student(String nume, String prenume, Masina m) {
		this.nume = nume;
		this.prenume = prenume;
		this.m = m;
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		Student student = (Student) super.clone();
		student.m = (Masina) m.clone();
		return student;
		
	}

	
	

}
