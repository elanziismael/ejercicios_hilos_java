package com;
public class Main{

    public static void main(String [] args) {

        Runnable tarea = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread hilo = new Thread(tarea);

        System.out.println("1. Antes de start():");
        System.out.println("   Estado: " + hilo.getState());
        System.out.println("   ¿Está vivo? " + hilo.isAlive());

        hilo.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) { e.printStackTrace(); }

        System.out.println("Durante la ejecución (mientras duerme):");
        System.out.println("Estado: " + hilo.getState());
        System.out.println("¿Está vivo? " + hilo.isAlive());

        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("3. Después de que join() termina:");
        System.out.println("Estado: " + hilo.getState());
        System.out.println("¿Está vivo? " + hilo.isAlive());

	}


}