package be.pxl.collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class DifficultCalculations {

    public static void main(String[] args) {
        HashMap<Integer, Long> cache = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int aantal = 0;
        while (aantal < 5) {
            System.out.println("Geef een getal: ");
            int getal = scanner.nextInt();
            if (cache.containsKey(getal)) {
                System.out.println("Faculteit: " + cache.get(getal));
            } else {
                long result = faculteit(getal);
                cache.put(getal, result);
                System.out.println("Faculteit: " + cache.get(getal));
            }
            aantal++;
        }

        TreeMap<Integer, Long> sortedCache = new TreeMap<>(cache);
        sortedCache.forEach((key, value) -> System.out.println("Faculteit van " + key + " is " + value));
        scanner.close();
    }


    private static long faculteit (int waarde){
        long result = 1;
        for(int cnt = 1; cnt < waarde; cnt++){
            result *= cnt;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        return result;
    }

}
