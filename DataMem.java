package com.company;

public class DataMem {
    public static int [] dataMem = new int[100];
    public DataMem() {
        for(int i = 0;i < 100;i++) {
            dataMem[i] = 0;
        }
    }
    public static void print(){
        System.out.println("----------------------------------------");
        System.out.println("存储器情况");
        for(int i = 0;i < 100; i++) {
            System.out.printf("dataMem[%2d]=%3d ",i,dataMem[i]);
            if(i%6 == 0)
                System.out.println("");
        }
        System.out.println("");
    }
}
