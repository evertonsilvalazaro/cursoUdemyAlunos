package alunos;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double notafinal() {
		return nota1 + nota2 + nota3;
	}

	public double pontosAusentes() {
		if (notafinal() < 60.0) {
			return 60.0 - notafinal();
		} else {
			return 0.0;
		}
	}
}