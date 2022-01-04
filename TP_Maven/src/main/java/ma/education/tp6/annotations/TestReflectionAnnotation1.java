package ma.education.tp6.annotations;

public class TestReflectionAnnotation1 {

	public static void main(String[] args) {
		Class c = CalculatriceMath.class;
		Programmer programmer = (Programmer)
		c.getAnnotation(Programmer.class);
		System.out.println(programmer.id()+":"+programmer.name());
	}
}
