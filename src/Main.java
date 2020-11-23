import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		Color culoare1 = Color.LIGHT_GRAY;
		Masina masina1 = new Masina(culoare1, "audi");
		Student ionel = new Student("Ionel", "Popovici", masina1);
		Student ionel2 = null;
		try
		{
			ionel2 = (Student) ionel.clone();
		}
		catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
		System.out.println(ionel.getM().toString());
		Color culoare2 = Color.BLACK;
		ionel2.getM().setCuloare(culoare2);
		System.out.println(ionel.getM().toString());
		ionel2.getM().setCuloare(culoare1);
		System.out.println(ionel.getM().toString());
		ionel2.getM().setCuloare(culoare2);
		System.out.println(ionel2.getM().toString());

	}

}
