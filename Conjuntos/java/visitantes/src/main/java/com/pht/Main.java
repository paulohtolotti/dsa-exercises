package com.pht;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.time.Instant;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        
        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File("Conjuntos\\java\\visitantes\\input.json");

        List<String> visitors = mapper.readValue(jsonFile, new TypeReference<List<String>>() {});
        List<String> uniqueVisitors = new ArrayList<>();

        Set<String> visitorsSet = new HashSet<>();

        Instant start = Instant.now();

        for(String v : visitors) {
            String[] data = v.split(",");
            visitorsSet.add(data[0]);
        }

        Instant end = Instant.now();
        Long duration = Duration.between(start, end).toMillis(); // em segundos

        System.out.println("Size: " + visitorsSet.size());
        System.out.println("Duration com set: " + duration + "ms");

        // Bloco de teste com lista: O(N)
        Instant startList = Instant.now();
        for(String s : visitors) {
            String[] data = s.split(",");
            if(!contains(uniqueVisitors, data[0])) {
                uniqueVisitors.add(data[0]);
            }
        }
        Instant endList = Instant.now();
        long durationList = Duration.between(startList, endList).toMillis();
        System.out.println("Size com lista: " + uniqueVisitors.size());
        System.out.println("Duration com list: " + durationList + "ms");
    }

    public static boolean contains(List<String> users, String userName) {
        for(String s : users){
            if(s.equals(userName)) return true;
        }
        return false;
    }

}