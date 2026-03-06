package com.pht;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        
        List<Integer> numList = new ArrayList<>(Arrays.asList(20, 9, 11, 10));
        insertionSort(numList);
        System.out.println(numList.toString());

        // try {
        //     // File json = new File("C:/Users/PauloTolotti/Documents/estudos/dsa-exercises/Ordenacao/sort-benchmark/src/main/resources/input.json");
        //     // List<String> bubbleSortList = mapper.readValue(json, new TypeReference<List<String>>() {});
        //     // List<String> quickSortList = List.copyOf(bubbleSortList);
        //     // List<String> insertionSortList = List.copyOf(bubbleSortList);

        //     // List<String> testeList = new ArrayList<>(Arrays.asList("Apple", "Lemon", "Banana"));
        //     // //System.out.println(testeList.get(1).compareTo(testeList.get(2)));
        //     // bubbleSort(testeList);
        //     // System.out.println(testeList.toString());


        // } catch(IOException e) {
        //     e.printStackTrace();
        // }
    }

    public static void bubbleSort(List<String> arr) {
        Instant start = Instant.now();
        
        for(int i = 0; i < arr.size(); i++) {
            // xyz abc
            for (int j = i + 1; j < arr.size() ; j++) {
                if(arr.get(i).compareTo(arr.get(j)) > 0) {
                    System.out.println("Swapping: " + arr.get(i) + " <---> " + arr.get(j));
                    String temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                 
                }
            }
        }

        Instant end = Instant.now();
        System.out.println("Bubble sort: " + Duration.between(start, end).toMillis());
    }

    /**
    *   [20, 9, 11, 10] => [9, 10, 11, 20];
    *   
    *   1ª 9 < 20 V TROCO i = 1
    *       [9, 20, 11, 10]   i = 0 (nada a esquerda)
    * 
    *   2ª  [9, 20, 11, 10] i = 2 11 < 20 V
    *       [9, 11, 20, 10] i = 1 11 < 9 F break
    * 
    *   3ª  [9, 11, 20, 10]  i = 3 10 < 20 V
    *       [9, 11, 10, 20]  i = 2  10 < 11 V
    *       [9, 10, 11, 20]  i = 1  10 < 9 F break
    *       
    *   4ª                   i > lenght (4) FALSO    
     */ 
    public static void insertionSort(List<Integer> arr) {
        Instant start = Instant.now();

        
        for(int i = 1; i < arr.size(); i ++) {
            // int j = i - 1; // atual - anterior, começando do 1
            // int k = i;
            int k = i;
            while( k > 0 && arr.get(k - 1) > arr.get(k)) {
                // swap
                int temp = arr.get(k - 1);
                arr.set(k - 1, arr.get(k));
                arr.set(k, temp);
                k--;
            }
        }

        Instant end = Instant.now();
        System.out.println("Insertion sort: " + Duration.between(start, end).toMillis());
    }

    public static void swap(String[] arr, int left, int right) {
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}