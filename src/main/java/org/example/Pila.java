package org.example;

public class Pila {

    Nodo top;
    int tamaño;

    public Pila() {
        top = null;
        tamaño = 0;
    }


    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = top;
        top = nuevo;
        tamaño++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }

        int dato = top.dato;
        top = top.siguiente;
        tamaño--;
        return dato;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }

        return top.dato;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return tamaño;
    }

    public void mostrar() {
        Nodo actual = top;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }

    }
}