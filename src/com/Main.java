package com;
public class Main{

    public static void main(String [] args) {

		Thread hilo = new Thread(() -> {
            System.out.println("Hola desde un hilo");
        });
        hilo.start();
        System.out.println("Hola desde main");
	}


}