package org.example;

public class Main {

    public static void main(String[] args) {


        Pila pila = new Pila();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Top: " + pila.peek());
        System.out.println("Tamaño: " + pila.size());

        System.out.println("Elementos de la pila:");
        pila.mostrar();

        System.out.println("Se eliminó: " + pila.pop());

        System.out.println("Pila después del pop:");
        pila.mostrar();
    }
}





