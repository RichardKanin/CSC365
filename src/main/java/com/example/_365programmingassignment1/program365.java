package com.example._365programmingassignment1;


import javafx.application.Application;
import javafx.stage.Stage;
import java.io. * ;
import java.util.Scanner;



public class program365 extends Application {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("\\C:\\Users\\richa\\Downloads\\2021VAERSVAX.csv"));
        sc.useDelimiter(" ,");
        while (sc.hasNext()) {
            System.out.print(sc.next());


        }
        sc.close();
    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
