import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Metodos {
    public Queue<Solicitud> llenarCola(Queue<Solicitud> cola,Scanner sc){
        boolean continuar=true;
        while (continuar) {
            System.out.println("¿Desea agregar registros? \n Presione 1 para si o 2 para no");
            int opt = sc.nextInt();
            sc.nextLine();
            if (opt == 1) {
                Solicitud s = new Solicitud ();
                System.out.println("Ingrese el cliente: ");
                s.setCliente(sc.nextLine());
                System.out.println("Ingrese el Origen: ");
                s.setOrigen(sc.nextLine());
                System.out.println("Ingrese el Destino: ");
                s.setDestino(sc.nextLine());
                System.out.println("Ingrese el tipo: ");
                s.setTipo(sc.nextLine());
                System.out.println("Ingrese el peso: ");
                s.setPeso(sc.nextDouble());
                System.out.println("Ingrese prioridad: ");
                s.setPrioridad(sc.nextInt());
                cola.offer(s);
            }else {
                continuar = false;
            }
            
        }
        return cola;
    }
    public void mostrar (Queue<Solicitud> cola){
        for (Solicitud s : cola) {
            System.out.println("Cliente: " + s.getCliente());
            System.out.println("Origen: " + s.getOrigen());
            System.out.println("Destino: " + s.getDestino());
            System.out.println("Tipo: " + s.getTipo());
            System.out.println("Peso: " + s.getPeso());
            System.out.println("Prioridad" + s.getPrioridad());
            System.out.println("--------------------------------------------------");
        }
    }
    public Queue<Solicitud> entregar(Queue<Solicitud> cola,Scanner sc){
        if(!cola.isEmpty()){
            Solicitud aux = cola.poll();
            Queue<Solicitud> entregados = new LinkedList();
            entregados.offer(aux);
            System.out.println("Se entregó el pedido exitosamente.");
        }
        return cola;
    }

    public void proxima (Queue <Solicitud> cola){
        Solicitud proxima = cola.peek();
        System.out.println("Datos de la proxima entrega: ");
        System.out.println("Cliente: " + proxima.getCliente());
            System.out.println("Origen: " + proxima.getOrigen());
            System.out.println("Destino: " + proxima.getDestino());
            System.out.println("Tipo: " + proxima.getTipo());
            System.out.println("Peso: " + proxima.getPeso());
            System.out.println("Prioridad" + proxima.getPrioridad());
    }

}
