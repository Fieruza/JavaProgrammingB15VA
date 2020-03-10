package day62_collections4;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.nio.*;
import java.io.*;

public class CSVDataToMap {
        public static void main(String[] args) throws IOException {
            // String fileName = "/Users/cybertekb15/Downloads/countryCodes.csv";//filename with path
            String fileName = "countryCodes.csv";//filename with path
            File dataFile = new File(fileName);
            System.out.println(dataFile.exists());
            Scanner scan = new Scanner(dataFile);
            //System.out.println(scan.nextLine());
            //System.out.println(scan.nextLine());
            int counter = 1;
            List<String> fileDataList = new ArrayList<>();
            while (scan.hasNextLine()){
                String row =  scan.nextLine();
                System.out.println(counter +". "+ row);
                fileDataList.add(row);
                counter++;
            }
            scan.close();
            System.out.println(fileName + " contains " + fileDataList.size() + " rows");

            System.out.println("--READ FROM CSV FILE USING NEW WAY--");

            List<String> countryCodeList = Files.readAllLines(Paths.get(fileName));
            System.out.println(countryCodeList.size());
            System.out.println(countryCodeList.get(0));

            System.out.println(countryCodeList.toString());

            Set<String> countryCodeSet  = new HashSet<>(countryCodeList);
            System.out.println("Unique country codes count: "+countryCodeSet.size());
            System.out.println(countryCodeSet.toString());

            //store each country code and country name into HashMap
            //Key --> Country code, Value --> Country name

            Map<String, String > countriesMap = new HashMap<>();
            //if you want to sort it out just change HashMap to TreeMap
            //loop through the countryCodeSet

            for ( String eachLine: countryCodeSet) {
                System.out.println(eachLine);

                // split each value with comma
                String [] arr = eachLine.split(",");
                //store index 0 as a Key, and index 1 is a value to the Map
                countriesMap.put(arr[0], arr[1]);

            }
            System.out.println(countriesMap.size());
            System.out.println(countriesMap.toString());

          if(countriesMap.containsValue("Mongolia")){
              System.out.println("Mongolia is in the map");
          }else {
              System.out.println("Keep coding java!");


              //PE
              System.out.println(countriesMap.get("PE")); //will give the entire name of the country

              countriesMap.forEach((k, v) -> System.out.println(k + "|" + v));

              for (String eachKey:countriesMap.keySet()) {
                  System.out.println(eachKey +" | "+ countriesMap.get(eachKey));
              }
              System.out.println("---PRINT ALL VALUES USING ITERATOR AND ENTRYSET");

              for (Map.Entry<String, String> entry: countriesMap.entrySet()) {
                  System.out.println(entry.getKey());
                  System.out.println(entry.getValue());

              }







        }}}