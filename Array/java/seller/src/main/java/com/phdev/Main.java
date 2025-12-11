package com.phdev;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.phdev.entities.Seller;

public class Main {
    public static void main(String[] args) {

        File json = new File("C:\\Users\\PauloTolotti\\Documents\\dsa-exercises\\Array\\java\\seller\\src\\main\\resources\\seller.json");
        try {
            ObjectMapper om = new ObjectMapper();

            List<Seller> sellerList = new ArrayList<>();
            
            sellerList = om.readValue(json, new TypeReference<List<Seller>>() {});

            System.out.println("Best seller is: " + getBestSeller(sellerList));

        } catch(Exception err) {
            err.printStackTrace();
        }
    } 

    public static Seller getBestSeller(List<Seller> sellers) {

        Seller bestSeller = sellers.get(0);

        for(Seller s : sellers) {
            if(s.getAmount() > bestSeller.getAmount()) {
                bestSeller = s;
            }
        }

        return bestSeller;
    }
}