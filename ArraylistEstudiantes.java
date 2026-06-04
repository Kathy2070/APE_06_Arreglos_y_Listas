import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistEstudiantes {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        String nombre;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre del estudiante: ");
            nombre = sc.nextLine();
            estudiantes.add(nombre);
        }

        System.out.println("\nLista de estudiantes:");

        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        sc.close();
    }

}
