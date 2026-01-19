package com.Q1;

import java.io.*;
import java.util.*;

public class MerchandiseTest {

    public static void main(String[] args) {

        ArrayList<Merchandise> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.dat"))) {

            String line;
            
            br.readLine();

            // Read file line by line
            while ((line = br.readLine()) != null) {

                line = line.trim();
                if (line.isEmpty()) continue;

                String[] data = line.split("\\s+");

                String code = data[0];
                int qty = Integer.parseInt(data[1]);
                float price = Float.parseFloat(data[2]);

                list.add(new Merchandise(code, qty, price));
            }

        } catch (IOException e) {
            System.out.println("File reading error");
        }

        // Sort by itemCode (Ascending) - Comparable
        Collections.sort(list);
        System.out.println("Sorted by Item Code (Ascending):");
        for (Merchandise m : list) {
            System.out.println(m);
        }

        // Sort by unitPrice (Descending) - Comparator
        Collections.sort(list, new Comparator<Merchandise>() {
            @Override
            public int compare(Merchandise m1, Merchandise m2) {
                return Float.compare(m2.unitPrice, m1.unitPrice);
            }
        });

        System.out.println("\nSorted by Price (Descending):");
        for (Merchandise m : list) {
            System.out.println(m);
        }
    }
}