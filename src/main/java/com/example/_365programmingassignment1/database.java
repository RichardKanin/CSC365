package com.example._365programmingassignment1;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class database extends vaersvax {
    

    public database(int vaersID, String vaxType, String vaxManu, String vaxSite, String vaxName) throws IOException {

    }

    public static ArrayList<String> converter(List<String> list) {
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 1; i < list.size(); i++) {
            arr.add(list.get(i));
        }
//        System.out.println(arr.toString());

        return arr;
    }
    // arraylist type for vaersvax?

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Integer,ArrayList<String>> hashMap = new HashMap<>();


        String file = "\\C:\\Users\\richa\\Downloads\\2020VAERSVAX.csv\\";
        String file2 = "\\C:\\Users\\richa\\Downloads\\2021VAERSVAX.csv\\";
       // String theFile = null;
        String delimiter = ",";
        String line = null;

        List<List<String>> lines = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                String covidColumn = line.substring(8, 15);
                 //String line2 = line.substring(1, line.length() - 1);
                if (covidColumn.equals("COVID19")) {
                    List<String> values = Arrays.asList(line.split(delimiter));
                    lines.add(values);
                   //lines.remove(line2);
                    //System.out.println(line);
                    //System.out.println(covidColumn);
                }
            }
//            System.out.println(lines.get(0).get(0));
//            ArrayList<List> arr = lines.get(0);
            for (int i = 0; i < lines.size(); i++) {
                // System.out.println(lines.get(i));
            }
            writeToFile(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
            while ((line = br2.readLine()) != null) {
                String covidColumn = line.substring(8, 15);
//                System.out.println(line);
                //String line2 = line.substring(1, line.length() - 1);
                if (covidColumn.equals("COVID19")) {
                    List<String> values = Arrays.asList(line.split(delimiter));
                    lines.add(values);
                }
            }
            HashMap<Integer, ArrayList<String>> CovidObj = new HashMap<Integer, ArrayList<String>>();

            for (int i = 0; i < lines.size(); i++) {
                int key = Integer.parseInt(lines.get(i).get(0));
                ArrayList<String> strObj = converter(lines.get(i));
                CovidObj.put(key, strObj);
            }

            System.out.println(CovidObj.get(904895));



//            System.out.println(CovidObj.get(0905834));
            writeToFile(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public static void writeToFile(List l) throws FileNotFoundException {
       PrintWriter csvWriter = new PrintWriter("C:\\Users\\richa\\IdeaProjects\\365ProgrammingAssignment1\\src\\main\\COVID_Only_Data.csv");
       for (int i = 0; i < l.size(); i++) {
           csvWriter.write(l.get(i).toString().substring(1, l.get(i).toString().length()-1) + "\n");
           csvWriter.flush();
       }
       if(l.equals(null)){
           csvWriter.close();
       }
   }

   public static void hashFileContents(String f) throws IOException {
        String file = "C:\\Users\\richa\\IdeaProjects\\365ProgrammingAssignment1\\src\\main\\COVID_Only_Data.csv";
       try (BufferedReader br7 = new BufferedReader(new FileReader(file))){





       }
   }



}
