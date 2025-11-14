package com;
public class Main{

    public static void main(String [] args) {

		Runnable tareaPausada = () -> {
            String nombre = Thread.currentThread().getName();
            System.out.println(nombre + ": ¡Empezando la cuenta!");

            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(nombre + ": " + i);
                    
                    Thread.sleep(1000); 
                }
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
            
            System.out.println(nombre + ": Terminado");
        };

        Thread hilo = new Thread(tareaPausada, "Hilo-Contador");
        hilo.start();

        System.out.println(Thread.currentThread().getName() + ": He iniciado el hilo contador y sigo con mis tareas.");
        System.out.println(Thread.currentThread().getName() + ": Terminando.");

	}


}