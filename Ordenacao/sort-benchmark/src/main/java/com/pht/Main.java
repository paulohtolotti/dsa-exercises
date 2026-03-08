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

        try {
            //Atualize para o caminho do seu arquivo
            String path = "Ordenacao/sort-benchmark/src/main/resources/input.json";
            File json = new File(path);

            List<String> bubbleSortList = mapper.readValue(json, new TypeReference<List<String>>() {});
            List<String> insertionSortList = new ArrayList<>(bubbleSortList);
            List<String> quickSortList = new ArrayList<>(bubbleSortList);

            // Cálculo da duração foi feito no próprio escopo das funções
            bubbleSort(bubbleSortList);
            insertionSort(insertionSortList);

            // Como Quick Sort é recursivo, coloquei o cálculo de tempo fora da recursão.
            Instant start = Instant.now();
            quickSort(quickSortList, 0, quickSortList.size() - 1);
            Instant end = Instant.now();
            System.out.println("Quick sort: " + Duration.between(start, end).toMillis() + " ms");


        } catch(IOException e) {
             e.printStackTrace();
         }
    }

    public static void bubbleSort(List<String> arr) {
        Instant start = Instant.now();
        
        for(int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size() ; j++) {
                if(arr.get(i).compareTo(arr.get(j)) > 0) {
                    String temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }

        Instant end = Instant.now();
        System.out.println("Bubble sort: " + Duration.between(start, end).toMillis() + "ms");
    }

    public static void insertionSort(List<String> arr) {
        Instant start = Instant.now();

        for(int i = 1; i < arr.size(); i ++) {
            int k = i;
            while( k > 0 && arr.get(k - 1).compareTo(arr.get(k)) > 0) {
                // swap
                String temp = arr.get(k - 1);
                arr.set(k - 1, arr.get(k));
                arr.set(k, temp);
                k--;
            }
        }

        Instant end = Instant.now();
        System.out.println("Insertion sort: " + Duration.between(start, end).toMillis() + "ms");
    }

    public static void quickSort(List<String> arr, int left, int right) {

        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }

    }

    public static int partition(List<String> arr, int left, int right) {
        String pivot = arr.get(left);
        String temp;
        int i = left;

        for(int j = left + 1; j <= right; j++) {

            if(arr.get(j).compareTo(pivot) <= 0) {
                i++;
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }

        }

        temp = arr.get(left);
        arr.set(left, arr.get(i));
        arr.set(i, temp);

        return i;
    }

}