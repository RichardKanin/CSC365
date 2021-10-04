package com.example._365programmingassignment1;

import java.io.*;
import java.util.Scanner;

public class CSC365Project1 {

    public static void main(String[] args ) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("\"C:\\Users\\richa\\Downloads\\2020VAERSVAX.csv\""));
         sc.useDelimiter(",");
         while(sc.hasNext()){
             System.out.println(sc.next());
         }
         sc.close();
    }

}
