import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("***Generacion Ticket de Venta***");
        var consola = new Scanner(System.in);

        System.out.println("Precio leche:");
        var precioLeche=Double.parseDouble(consola.nextLine());

        System.out.println("Precio pan:");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.println("Precio lechuga:");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.println("Precio platanos");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        //Calculo del subtotal(sin impuestos)
        var subtotal = precioLeche+precioPan+precioLechuga+precioPlatanos;

        //Calculo con impuestos(16%)
        var impuestos = subtotal*0.16;

        //Calculo total de la compra (con impuestos)
        var costoTotalCompra = subtotal + impuestos;

        //Imprimir el ticket de venta
        System.out.printf("""
               Subtotal: $%.2f
               Impuesto(16%%):$%.2f
               Costo total de la compra: $%.2f 
               """,subtotal,impuestos,costoTotalCompra);

    }
}
