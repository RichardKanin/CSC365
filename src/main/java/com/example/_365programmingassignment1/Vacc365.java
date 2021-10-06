//package com.example._365programmingassignment1;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//public class main {
//    // function for converting a list of strings into an equivalent length arraylist of strings
//    public static ArrayList<String> converter(List<String> list) {
//        ArrayList<String> arr = new ArrayList<String>();
//        for (int i = 1; i < list.size(); i++) {arr.add(list.get(i));}
//        return arr;
//    }
//    public static void writeToFile(List l,String name) throws FileNotFoundException{
//        PrintWriter csvWriter = new PrintWriter("C:\\Users\\Louis\\IdeaProjects\\Assignment1_365\\src\\Data\\"+name+".csv");
//        for (int i = 0; i < l.size(); i++) {
//            csvWriter.write(l.get(i).toString().substring(1, l.get(i).toString().length()-1) + "\n");
//            csvWriter.flush();
//        }
//        if(l.equals(null)){
//            csvWriter.close();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        // File paths and variable declaration.
//        String VAERSVax2020File = "\\C:\\Users\\richa\\Downloads\\2020VAERSVAX.csv\\";
//        String VAERSVax2021File = "C:\\Users\\Louis\\IdeaProjects\\Assignment1_365\\src\\Data\\2021VAERSVAX.csv";
//        String VAERSData2020File = "C:\\Users\\Louis\\IdeaProjects\\Assignment1_365\\src\\Data\\2020VAERSData.csv";
//        String VAERSData2021File = "C:\\Users\\Louis\\IdeaProjects\\Assignment1_365\\src\\Data\\2021VAERSData.csv";
//        String file = "\\C:\\Users\\richa\\Downloads\\2020VAERSVAX.csv\\";
//        String file2 = "\\C:\\Users\\richa\\Downloads\\2021VAERSVAX.csv\\";
//        String file3 = "\\C:\\Users\\richa\\Downloads\\2020VAERSData.csv\\";
//        String file4 = "\\C:\\Users\\richa\\Downloads\\2021VAERSData.csv\\";
//        String delimiter = ",";
//        String line = null;
//        String line1 = null;
//        String line2 = null;
//        int maximumID = 1590982;
//        List<List<String>> lines = new ArrayList();
//        HashMap<Integer, ArrayList<String>> IDHashTable = new HashMap<Integer, ArrayList<String>>();
//
//        //create an arraylist of arraylists, where each line of the CSV file is one arraylist and only
//        //covid19 vaccinations are kept
//        try (BufferedReader bufferedReadervax2020 = new BufferedReader(new FileReader(VAERSVax2020File))) {
//            while ((line = bufferedReadervax2020.readLine()) != null) {
//                String secondColumn = line.substring(8, 15);
//                if (secondColumn.equals("COVID19")) {
//                    List<String> values = Arrays.asList(line.split(delimiter));
//                    lines.add(values);;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        try (BufferedReader bufferedReadervax2021 = new BufferedReader(new FileReader(VAERSVax2021File))) {
//            while ((line = bufferedReadervax2021.readLine()) != null) {
//                String covidColumn = line.substring(8, 15);
//                if (covidColumn.equals("COVID19")) {
//                    List<String> values = Arrays.asList(line.split(delimiter));
//                    lines.add(values);
//                }
//            }
//
//            for (int i = 0; i < lines.size(); i++) {
//                int key = Integer.parseInt(lines.get(i).get(0));
//                ArrayList<String> strObj = converter(lines.get(i));
//                IDHashTable.put(key, strObj);
//            }
//            writeToFile(lines, "COVID_ONLY_DATA");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
////        lines.clear();
//        //for reading the data files, because of commas within user reporting, we can't just
//        //split at a delimiter. Because of this, we will take all of the data from one line
//        //and split into two sections, first is the ID and the second is everything else.
//
//        try (BufferedReader bufferedReadervax2020 = new BufferedReader(new FileReader(VAERSVax2020File))) {
//            while ((line1 = lines(1)) != null) {
//                String firstColumnData = line1.substring(0, 6);
//                line2 = bufferedReadervax2020.readLine();
//                String firstColumnVax = line2.substring(0,6);
//                while (Integer.valueOf(firstColumnData) != null || Integer.valueOf(firstColumnData) < maximumID) {
//                    if (firstColumnData.equals(firstColumnVax)) {
//
//
//                    }
//                }
//            }
////                lines.clear();
//            writeToFile(lines, "VAX_and_DATA");
//        } catch (IOException e) {e.printStackTrace();}
//
//
//    }
//}