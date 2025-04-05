# Proyecto Lista Enlazada

Este proyecto implementa una lista enlazada en Java, con varias operaciones como agregar nodos, eliminar nodos, verificar si un valor está en la lista, e invertir la lista. El proyecto está estructurado en tres clases principales:

1. **Node**: Representa un nodo en la lista enlazada.
2. **LinkedList**: Contiene los métodos para manipular la lista enlazada.
3. **MenuLinkedList**: Menu de interfaz de usuario en la consola para interactuar con la lista enlazada.

## Instrucciones para Ejecutar el Proyecto

**Clonar repositorio, Compilar y ejecutar**

   Clona el repositorio desde GitHub ejecutando:
   git clone https://github.com/Juncst/Repo_Parcial2.git

   Abre una terminal en la raíz del proyecto y ejecuta el siguiente comando para compilar el código:
   javac -d bin src/*.java
   Esto creara los .class correspondientes dentro de la carpeta \bin 
   
   Desde la misma raíz del proyecto ejecuta el siguiente comando para ejecutar el proyecto:
   java -cp bin MenuLinkedList

## Propósito de Cada Clase y Método

### 1. Clase Node
- **Propósito**: Representa un nodo en la lista enlazada.

#### Métodos:
- `Node(int data)`: Constructor que inicializa el nodo con un valor y establece su referencia al siguiente nodo como `null`.

### 2. Clase LinkedList
- **Propósito**: Implementa la lista enlazada y contiene métodos para manipular la lista.

#### Métodos:
- `add(int data)`: Agrega un nodo al final de la lista.
- `addFirst(int data)`: Agrega un nodo al principio de la lista.
- `addMiddle(int data, int position)`: Agrega un nodo en una posición específica.
- `remove(int data)`: Elimina un nodo con un valor específico de la lista.
- `printList()`: Imprime los valores de la lista.
- `reverse()`: Invierte el orden de los nodos en la lista.
- `contains(int value)`: Verifica si un valor existe en la lista.

### 3. Clase MenuLinkedList
- **Propósito**: Proporciona una interfaz de línea de comandos para interactuar con la lista enlazada.

#### Métodos:
- Muestra un menú con opciones para agregar, eliminar, imprimir, verificar y revertir la lista enlazada.

## Ejemplo de Entradas y Salidas

### Ejemplo 1: Agregar un número al inicio
**Entrada**:
Ingrese el número que quiere agregar al inicio: 5

**Salida**:
Número agregado al inicio.

**Lista actual**:
5 -> null

### Ejemplo 2: Agregar un número al final
**Entrada**:
Ingrese el número que quiere agregar al final: 10

**Salida**:
Número agregado al final.

**Lista actual**:
5 -> 10 -> null

### Ejemplo 3: Agregar un número en una posición específica
**Entrada**:
Ingrese el número que quiere agregar: 7 Ingrese la posición donde quiere agregar el número: 1

**Salida**:
Número agregado en la posición 1.

**Lista actual**:
5 -> 7 -> 10 -> null

### Ejemplo 4: Eliminar un número
**Entrada**:
Ingrese el número que quiere eliminar: 7

**Salida**:
El número ha sido eliminado.

**Lista actual**:
5 -> 10 -> null

### Ejemplo 5: Verificar si un número existe
**Entrada**:
Ingrese el número que quiere verificar: 5

**Salida**:
El número 5 está en la lista.

### Ejemplo 6: Revertir la lista
**Entrada**:
Lista revertida.

**Lista actual**:
10 -> 5 -> null
