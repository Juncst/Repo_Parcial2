public class LinkedList {
    private Node head;  // primer dato en la lista enlazada

    public LinkedList() {
        head = null; // atributo head es la referencia al primer nodo de la lista
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // Si la lista está vacía, el nuevo nodo es el primero ya que por defecto el nodo apuntaría a null cuando no tenemos datos
        } else {
            Node current = head;
            while (current.next != null) {  // buscamos el ultimo nodo con un while si el nodo actual no es null recorremos al siguiente
                current = current.next;
            }
            current.next = newNode;  // el ultimo nodo apuntara al nuevo nodo 
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // El nuevo nodo apunta al actual primer nodo
        head = newNode;       // El nuevo nodo es ahora la cabeza de la lista
    }


    public void addMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            addFirst(data);  // Si la posición es 0, lo agregamos al principio porque no vamos a tener que recorrer nada
            return;
        }
    
        Node current = head;
        int i;
        // Recorremos hasta llegar a la posición ingresada
        for (i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
    
        if (current == null) {
            System.out.println("Posición inválida, fuera de rango.");
            return;  // No agregamos el nodo si la posición es inválida
        }
    
        newNode.next = current.next;
        current.next = newNode;  // Insertamos el nodo en la posición
    }

    public void remove(int data) {
        if (head == null) return;  // Si la lista está vacía

        if (head.data == data) {
            head = head.next;  // Si el nodo a eliminar es la cabeza
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) return;  // Si el nodo no se encuentra

        current.next = current.next.next;  // recorremos la lista hasta encontrarlo
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;  // Guardar el siguiente nodo
            current.next = prev;  // Invertir el enlace
            prev = current;       // Avanzar el prev
            current = next;       // Avanzar el current
        }
        head = prev;  // La cabeza ahora es el último nodo
    }

    public boolean contains(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;  // Si encontramos el valor, retornamos true
            }
            current = current.next;
        }
        return false;  // Si no encontramos el valor, retornamos false
    }
}
