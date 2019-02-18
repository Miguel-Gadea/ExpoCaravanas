package ejercicioexpocaravanas;

import java.util.Scanner;

/**
 *
 * @author Miguel Gadea Fernández-Giro
 */
public class EjercicioExpoCaravanas {

    public static void main(String[] args) {
        int eleccion = 0;
        int eleccion2;
        int entradasventa;
        Scanner sc = new Scanner(System.in);
        Zona zonap = new Zona();
        Zona zonacv = new Zona();
        Zona zonavip = new Zona();
        zonap.setEntradasalaventa(1000);
        zonacv.setEntradasalaventa(200);
        zonavip.setEntradasalaventa(25);

        while (eleccion != 3) {
            System.out.println("Menu");
            System.out.println("1.Mostrar número de entradas libres");
            System.out.println("2.Vender entradas");
            System.out.println("3.Salir");
            eleccion = sc.nextInt();
            if (eleccion == 1) {
                System.out.println("Entradas Zona Principal: " + zonap.getEntradasalaventa());
                System.out.println("Entradas Zona Compra-Venta:" + zonacv.getEntradasalaventa());
                System.out.println("Entradas Zona Vip:" + zonavip.getEntradasalaventa());
            } else if (eleccion == 2) {
                System.out.println("¿Que Zona Quiere Usted?");
                System.out.println("1.Zona Principal");
                System.out.println("2.Zona compra-venta");
                System.out.println("3.Zona VIP");
                eleccion2 = sc.nextInt();
                if (eleccion2 == 1) {
                    System.out.println("¿Cuantas Entradas Zona Principal?");
                    entradasventa = sc.nextInt();
                    zonap.ventaEntradas(entradasventa);
                    System.out.println("Ahora quedan: " + zonap.getEntradasalaventa());
                } else if (eleccion2 == 2) {
                    System.out.println("¿Cuantas Entradas Zona Compra-Venta?");
                    entradasventa = sc.nextInt();
                    zonacv.ventaEntradas(entradasventa);
                    System.out.println("Ahora quedan:" + zonacv.getEntradasalaventa());
                } else if (eleccion2 == 3) {
                    System.out.println("¿Cuantas Entradas Zona VIP?");
                    entradasventa = sc.nextInt();
                    zonavip.ventaEntradas(entradasventa);
                    System.out.println("Ahora quedan:" + zonavip.getEntradasalaventa());
                    }
                else{
                    System.out.println("ERROR");
                }
            }
            else{
                System.out.println("ERROR");
            }

        }
    }
}


