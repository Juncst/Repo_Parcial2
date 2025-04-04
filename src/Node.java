public class Node {
    int data;     // valor donde vamos a guardar el nodo 
    Node next;    // nos ayudara a referenciar el siguiente nodo 

    public Node(int data) {
        this.data = data; //donde almacenaremos el valor que queremos agregar al nodo
        this.next = null;  // el siguiente nodo es null si este no tiene otro dato, referenciando el ultimo valor dentro de la lista
    }
}