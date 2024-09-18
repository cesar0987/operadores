import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("***Sistema de Prestamo de libros***");

        final var DISTANCIA_PERMITIDA_KM=3;
        var consola =new Scanner(System.in);

        System.out.print("Cuenta con credenciales de estudiante?(true/false) ");
        var tienesCredencial=Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos km vives de la biblioteca? ");
        var distanciaBibliotecaKm =Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo= tienesCredencial||distanciaBibliotecaKm<=DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elegible para prestamo de libros? " + esElegiblePrestamo);

    }
}
