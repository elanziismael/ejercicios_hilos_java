package com;

public class LanzadorHilosnew {
    public static void main(String[] args) {
        Thread h = new Thread(new Hilo("nuevo"));

        System.out.println(h.getName() + " -> " + h.getState());


    }
    
}
