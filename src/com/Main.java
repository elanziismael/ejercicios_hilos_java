package com;
public class Main{

    public static void main(String [] args) {

		Thread hilo1 = new Thread(() -> {
            String nombre = Thread.currentThread().getName();
            System.out.println("Ejecutando: " + nombre);
        });

        hilo1.setName("Hilo-Usuario");

        Thread hilo2 = new Thread(() -> {
            String nombre = Thread.currentThread().getName();
            System.out.println("Ejecutando: " + nombre);
        });
        hilo2.setName("Proceso-Background");

        Thread hilo3 = new Thread(() -> {
            String nombre = Thread.currentThread().getName();
            System.out.println("Ejecutando: " + nombre);
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();

        System.out.println("Ejecutando: " + Thread.currentThread().getName());
	}


}