import java.util.Scanner;
// no llamo a ningun paquete porque todos los .java estan dentro de la misma carpeta src
public class MenuLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int option;
        
        // Menú de opciones
        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Agregar número al inicio");
            System.out.println("2. Agregar número al final");
            System.out.println("3. Agregar número en una posición específica");
            System.out.println("4. Eliminar número");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Verificar si un número existe");
            System.out.println("7. Revertir la lista");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Ingrese el número que quiere agregar al inicio: ");
                    int numFirst = scanner.nextInt();
                    list.addFirst(numFirst);
                    System.out.println("Número agregado al inicio.");
                    break;
                
                case 2:
                    System.out.print("Ingrese el número que quiere agregar al final: ");
                    int numLast = scanner.nextInt();
                    list.add(numLast);
                    System.out.println("Número agregado al final.");
                    break;
                
                case 3:
                    System.out.print("Ingrese el número que quiere agregar: ");
                    int numMiddle = scanner.nextInt();
                    System.out.print("Ingrese la posición donde quiere agregar el número: ");
                    int position = scanner.nextInt();
                    list.addMiddle(numMiddle, position);
                    System.out.println("Número agregado en la posición " + position);
                    break;
                
                case 4:
                    System.out.print("Ingrese el número que quiere eliminar: ");
                    int numRemove = scanner.nextInt();
                    list.remove(numRemove);
                    System.out.println("El número ha sido eliminado.");
                    break;
                
                case 5:
                    System.out.println("Lista actual: ");
                    list.printList();
                    break;
                
                case 6:
                    System.out.print("Ingrese el número que quiere verificar: ");
                    int numCheck = scanner.nextInt();
                    if (list.contains(numCheck)) {
                        System.out.println("El número " + numCheck + " está en la lista.");
                    } else {
                        System.out.println("El número " + numCheck + " no está en la lista.");
                    }
                    break;
                
                case 7:
                    list.reverse();
                    System.out.println("Lista revertida.");
                    break;
                
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
            }
            
        } while (option != 8);
        
        scanner.close();
    }
}
