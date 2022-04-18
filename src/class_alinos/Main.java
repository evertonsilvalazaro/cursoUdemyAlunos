package class_alinos;

import java.util.Locale;
import java.util.Scanner;

import alunos.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("digite o nome ");
		student.name = sc.nextLine();
		System.out.println("digite a primeira nota");
		student.nota1 = sc.nextDouble();
		System.out.println("digite a segunda nota");
		student.nota2 = sc.nextDouble();
		System.out.println("digite a terceira nota");
		student.nota3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.notafinal());
		if (student.notafinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.pontosAusentes());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}