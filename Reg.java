package com.company;

public class Reg {
    public static int [] Reg = new int[100];
    public Reg() {
        for(int i = 0;i < 31; i++) {
            Reg[i] = 0;
        }
    }
    public static void print() {
        System.out.println("----------------------------------------");
        System.out.println("寄存器：");
        for(int i = 0; i < 100;i++) {
            System.out.printf("Reg[%2d]=%3d ",i,Reg[i]);
            if(i%6 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
