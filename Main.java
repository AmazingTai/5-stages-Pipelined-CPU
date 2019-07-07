package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Main {

    public static void main(String[] args) {
	// write your code here
    IF iftest = new IF();
    ID idtest = new ID();
    EXE exetest = new EXE();
    MEM memtest = new MEM();
    WB wbtest = new WB();

    InstructionMem im = new InstructionMem("Your Path");
    DataMem dm = new DataMem();
    Reg reg = new Reg();

    boolean down = true;
    boolean over = false;

    for(int i = 0;i < 40;i++,down = !down) {
        if(!over) {
            if(down) {
                System.out.println("****************");
                System.out.println("第+i/2+周期 下降沿");

             /* wbtest.down();
             
                wbtest.down();

                iftest.down();

                idtest.down(iftest,exetest, memtest);

                exetest.down(wbtest, memtest);

                memtest.down();

                iftest.print();
                idtest.print();
                exetest.print();
                memtest.print();
                wbtest.print();

                Reg.print();
                DataMem.print();

            }
            else{
                wbtest.up(memtest);
                memtest.up(exetest);
                exetest.up(idtest);
                idtest.up(iftest);
                iftest.up(idtest);

            }
            over=iftest.s==null&&idtest.s==null&&exetest.s==null&&memtest.s==null&&wbtest.s==null;*/
        }
        else{
            break;
        }

    }