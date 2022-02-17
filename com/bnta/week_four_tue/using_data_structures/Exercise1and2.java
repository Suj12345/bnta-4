package com.bnta.week_four_tue.using_data_structures;

import java.util.HashMap;

public class Exercise1and2 {
    public static void main(String[] args) {
        String strings = "1,1,1,3,4,5,6,1,7,7,7,7,7,8,8,8,8,8,1";
        Exercise1and2 exercise1and2 = new Exercise1and2();
        HashMap result = exercise1and2.countOccurences(strings);
        String resultKeys = "";
        for (Object o : result.keySet()) {
            resultKeys += o + ", ";
        }
        System.out.println("The string(s) with the most occurrences: " + resultKeys.substring(0,resultKeys.length()-2) + ".");
        System.out.println("The number of occurrences: " + result.get(result.keySet().toArray()[0]) + ".");
    }

    public HashMap<String, Integer> countOccurences(String input) {
        String[] inputarray = input.split(",");
        HashMap<String, Integer> countMap = new HashMap<>();
        HashMap<String, Integer> highestCountMap = new HashMap<>();
        int maxCount = 0;
        for (String string : inputarray) {
            Integer count = countMap.get(string);
            if (count==null){
                count=1;
            }else{
                count++;
            }
            countMap.put(string, count);
            if (count > maxCount) {
                maxCount = count;
                highestCountMap.clear();
                highestCountMap.put(string, count);
            } else if (count == maxCount) {
                highestCountMap.put(string, count);
            }
        }
        System.out.println(countMap);
        return highestCountMap;
    }
}

////ALTERNATIVE WAY
//    public static void main(String[] args) {
//        String strings = "1,1,1,3,4,5,6,1,7,7,7,7,7,8,8,8,8,8,1";
//        Exercise1and2 exercise1and2 = new Exercise1and2();
//        HashMap result = exercise1and2.countOccurences(strings);
//        String resultKeys = "";
//        for (Object o : result.keySet()) {
//            resultKeys += o + ", ";
//        }
//        System.out.println("The string(s) with the most occurrences: " + resultKeys.substring(0,resultKeys.length()-2) + ".");
//        System.out.println("The number of occurrences: " + result.get(result.keySet().toArray()[0]) + ".");
//    }
//    public HashMap<String, Integer> countOccurences(String input) {
//        HashMap<String, Integer> countMap = new HashMap<>();
//        String[] inputarray = input.split(",");
//        int maxCount = 0;
//        int count = 0;
//        HashMap result = new HashMap<>();
//        for (String string : inputarray) {
//            if (!countMap.containsKey(string)) {
//                countMap.put(string, 1);
//                count = 1;
//            } else {
//                count = countMap.get(string) + 1;
//                countMap.put(string, count);
//                if (count>maxCount){
//                    maxCount=count;
//                    result.clear();
//                    result.put(string, count);
//                } else if (count==maxCount){
//                    result.put(string, count);
//                }
//            }
//        }
//        System.out.println(countMap);
//        return result;
//    }

////ALTERNATIVE WAY OF DOING IT WITHOUT MAPS
//        String[] stringsarray = strings.split(",");
//        int maxCount = 0;
//        String maxString = "";
//        int count = 1;
//        for (int i = 0; i < stringsarray.length; i++) {
//            count = 1;
//            if (stringsarray[i]!=maxString){
//                for (int i1 = i+1; i1 < stringsarray.length; i1++) {
//                    if (stringsarray[i].equals(stringsarray[i1])){
//                        count++;
//                        if (count>maxCount){
//                            maxCount=count;
//                            maxString = stringsarray[i];
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("String with most number of occurrences is: "+ maxString);
//        System.out.println("It has " + maxCount + " occurrences");
//
//        System.out.println("-----------");