package com.example._365programmingassignment1;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class database {

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
        //HashMap<Integer,ArrayList<String>> hashMap = new HashMap<>();

        String file = "\\C:\\Users\\richa\\Downloads\\2020VAERSVAX.csv\\";
        String file2 = "\\C:\\Users\\richa\\Downloads\\2021VAERSVAX.csv\\";
        String file3 = "\\C:\\Users\\richa\\Downloads\\2020VAERSData.csv\\";
        String file4 = "\\C:\\Users\\richa\\Downloads\\2021VAERSData.csv\\";
        String delimiter = ",";
        String line = null;
        String demo = null;

        List<List<String>> lines = new ArrayList();
        List<List<String>> dataLines = new ArrayList();


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
//                System.out.println(line);

                String covidColumn = line.substring(8, 15);
                if (covidColumn.equals("COVID19")) {
                    List<String> values = Arrays.asList(line.split(delimiter));
                    lines.add(values);
                }
            }
//            System.out.println(lines.get(0));


            HashMap<Integer, ArrayList> v2020COVID = new HashMap<Integer, ArrayList>();

            for (int i = 0; i < lines.size(); i++) {
                int key = Integer.parseInt(lines.get(i).get(0));
                ArrayList<String> strObj = converter(lines.get(i));
                v2020COVID.put(key, strObj);
            }
            System.out.println(v2020COVID.get(902493));

            writeToFile(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (BufferedReader br1 = new BufferedReader(new FileReader(file3))) {
            demo = br1.readLine();
            ArrayList<Integer> keys = new ArrayList<>();
            String[] data;
            ArrayList<String> datas = new ArrayList<>();
//            List<ArrayList> dataList = new ArrayList<>();
            ArrayList<ArrayList> dataSet = new ArrayList<>();

            HashMap<Integer, ArrayList> v2020COVIDDB = new HashMap<Integer, ArrayList>();
            System.out.println("Here");
            while ((demo = br1.readLine()) != null) {

//                data = demo.split(",");
//                keys.add(Integer.parseInt(data[0]));
//                System.out.println(data[17]);

                List<String> values = Arrays.asList(demo.split(","));
                dataLines.add(values);

////                System.out.println(v2020COVIDDB.get(855017));
            }
            for (int i = 0; i < dataLines.size(); i++) {
                int key = Integer.parseInt(dataLines.get(i).get(0));
                ArrayList<String> strObj = converter(dataLines.get(i));
                v2020COVIDDB.put(key, strObj);
            }
            System.out.println("stop");
            System.out.println(v2020COVIDDB.get(902493));
//            System.out.println(dataLines.get(0));
//            HashMap<Integer, ArrayList> v2020COVIDDB = new HashMap<Integer, ArrayList>();


//            System.out.println(keys.size());
//            System.out.println(dataSet.size());

////            for (int i = 0; i < datas.size(); i++) {
//                System.out.println(datas.get(1));
////            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        // --------------------------------------------------------------

        try (BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
            while ((line = br2.readLine()) != null) {
                String covidColumn = line.substring(8, 15);
                if (covidColumn.equals("COVID19")) {
                    List<String> values = Arrays.asList(line.split(delimiter));
                    lines.add(values);
                }
            }
            HashMap<Integer, ArrayList<String>> v2021COVID = new HashMap<Integer, ArrayList<String>>();

            for (int i = 0; i < lines.size(); i++) {
                int key = Integer.parseInt(lines.get(i).get(0));
                ArrayList<String> strObj2 = converter(lines.get(i));
                v2021COVID.put(key, strObj2);
//                System.out.println(lines.get(i));
            }
            writeToFile(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br3 = new BufferedReader(new FileReader(file2))) {
            while ((line = br3.readLine()) != null) {
                String covidColumn = line.substring(8, 15);
                if (covidColumn.equals("COVID19")) {
                    List<String> values = Arrays.asList(line.split(delimiter));
                    lines.add(values);
                }
            }
            HashMap<Integer, ArrayList<String>> v2021COVID = new HashMap<Integer, ArrayList<String>>();

            for (int i = 0; i < lines.size(); i++) {
                int key = Integer.parseInt(lines.get(i).get(0));
                ArrayList<String> strObj2 = converter(lines.get(i));
                v2021COVID.put(key, strObj2);
//                System.out.println(lines.get(i));
            }
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
