import java.util.Scanner;

public class EjercicioDia3 {
    public static void main(String[] args) {
        System.out.println("Introduce el nombre y/o apellidos de la persona: ");
        String nombreCompleto;
        String contieneNombrePila = "";
        Scanner scanner = new Scanner(System.in);
        nombreCompleto = scanner.nextLine();
        String[] arrayNombre = nombreCompleto.split("\\s+");
        int longitudArray = arrayNombre.length;
        String nombre = arrayNombre[0];
        String nPila, apellido1, apellido2;


        if (longitudArray == 2) {
            System.out.println("¿Su nombre contiene nombre de pila? Indique con Si o No");
            contieneNombrePila = scanner.nextLine();
            String conver = contieneNombrePila.toLowerCase();
            switch (conver) {
                case "si" -> {
                    nPila = " " + arrayNombre[longitudArray - 1];
                    apellido1 = "";
                    apellido2 = "";
                    System.out.println("Nombre: " + nombre + nPila + ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2);
                }
                case "no" -> {
                    apellido1 = arrayNombre[longitudArray - 1];
                    apellido2 = "";
                    System.out.println("Nombre: " + nombre + ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2);
                }
            }

        } else if (longitudArray == 3) {
            System.out.println("¿Su nombre contiene nombre de pila? Indique con Si o No");
            contieneNombrePila = scanner.nextLine();
            String conver = contieneNombrePila.toLowerCase();
            switch (conver) {
                case "si" -> {
                    nPila = " " + arrayNombre[1];
                    apellido1 = arrayNombre[longitudArray - 1];
                    apellido2 = "";
                    System.out.println("Nombre: " + nombre + nPila + ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2);
                }
                case "no" -> {
                    apellido1 = arrayNombre[longitudArray - 2];
                    apellido2 = arrayNombre[longitudArray - 1];
                    System.out.println("Nombre: " + nombre + ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2);
                }
            }

        }else if (longitudArray==4){
            nPila = " " + arrayNombre[1];
            apellido1 = arrayNombre[longitudArray - 2];
            apellido2 = arrayNombre[longitudArray - 1];
            System.out.println("Nombre: " + nombre + nPila + ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2);
        }else{
            nPila = "";
            apellido1 = "";
            apellido2 = "";
            System.out.println("Nombre: " + nombre + nPila + ", Apellido1: " + apellido1 + ", Apellido2: " + apellido2);
        }

    }
}
