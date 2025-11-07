package com;

public class LanzadorHilosnew {
    public static void main(String[] args) {
        Thread h = new Thread(new Hilo("nuevo"));

        System.out.println("🟡 Lanzando hilo: " + h.getName());


    }
    
}
