package com.pht;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        // try {
        //     File json = new File("C:/Users/PauloTolotti/Documents/estudos/dsa-exercises/Ordenacao/sort-benchmark/src/main/resources/input.json");
        //     List<String> list = mapper.readValue(json, new TypeReference<List<String>>() {});
        //     String[] letters = {}
        //     // list.forEach(System.out::println);
        //     String a = "Arnaldo";
        //     String b = "Cassia";

        //     System.out.println(a.compareTo(b)); // Valor negativo
        //     System.out.println(b.compareTo(a)); // valor positivo
        // } catch(IOException e) {
        //     e.printStackTrace();
        // }
        System.out.println("xyz".compareTo("abc"));
        String[] letters = {"xyz", "abc", "abb"}; 
        bubbleSort(letters);
        System.out.println(Arrays.toString(letters));
    }

    public static void bubbleSort(String[] arr) {
        Instant start = Instant.now();
        boolean swapFlag;
        
        for(int i = 0; i < arr.length; i++) {
            swapFlag = false;

            // xyz abc
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    swapFlag = true;
                }
            }

            if(!swapFlag) break;
        }

        Instant end = Instant.now();
        System.out.println("Bubble sort: " + Duration.between(start, end).toMillis());
    }

    public static void swap(String[] arr, int left, int right) {
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}