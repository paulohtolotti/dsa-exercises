package com.pht;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.time.Instant;
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        
        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File("Conjuntos\\java\\visitantes\\input.json");

        List<String> visitors = mapper.readValue(jsonFile, new TypeReference<List<String>>() {});

        Set<String> visitorsSet = new HashSet<>();

        Instant start = Instant.now();

        for(String v : visitors) {
            String[] data = v.split(",");
            visitorsSet.add(data[0]);
        }

        Instant end = Instant.now();
        Long duration = Duration.between(start, end).toMillis(); // em segundos

        System.out.println("Size: " + visitorsSet.size());
        System.out.println("Duration: " + duration);

    }



}