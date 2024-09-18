import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {
        System.out.println("***Sistema de Descuentos VIP***");
        final var NO_PRODUCTOS_DESCUENTOS=10;
        var consola= new Scanner(System.in);

        System.out.print("Cuantos Productos Compraste Hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tiene la membresia de la tienda?(true/false) ");
        var tieneMembresia= Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento=cantidadProductos>=NO_PRODUCTOS_DESCUENTOS&&tieneMembresia;
        System.out.println("esElegibleDescuento = " + esElegibleDescuento);
    }
}
