import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Menu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Queue<Solicitud> cola = new LinkedList<>();
        Queue<Solicitud> entregados = new LinkedList<>();
        boolean continuar = true;

        System.out.println("Bienvenidos");
        while (continuar) {
            System.out.println("Ingrese una opción: ");
            System.out.println("1. Agregar solicitud");
            System.out.println("2. Mostrar pendientes");
            System.out.println("3. Entregar");
            System.out.println("4. Mostrar proxima entrega");
            System.out.println("5. Mostrar entregadas");
            System.out.println("6. Adios");
            
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    cola=m.llenarCola(cola, sc);
                    break;
                case 2:
                    m.mostrar(cola);
                    break;
                case 3:
                    cola=m.entregar(cola, sc);
                    break;
                case 4:
                    m.proxima(cola);
                    break;
                case 5:
                    m.mostrar(entregados);
                    break;
                case 6:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;            
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }
    
}
