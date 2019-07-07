package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class InstructionMem{
    public static String [] instructionMem;

    public InstructionMem(String filepath){
        instructionMem=new String[100];
        for(int i = 0;i < 100;i++){
            instructionMem[i]=null;
        }
        FileReader fileReader=null;
        BufferedReader bufferedReaderreader=null;
        try{

            fileReader=new FileReader(filepath);
            bufferedReaderreader =new BufferedReader(fileReader);
            int i=0;
            System.out.println("指令序列是：");
            while((InstructionMem.instructionMem[i]=bufferedReaderreader.readLine()) != null){
                if(InstructionMem.instructionMem[i].trim().equals("")){
                    InstructionMem.instructionMem[i]=null;
                }
                if(InstructionMem.instructionMem[i]!=null)
                    System.out.println(InstructionMem.instructionMem[i]);
                else
                    System.out.println("空指令");
                i++;
                if(i == 100){
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }


}




