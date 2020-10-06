package ui;

import java.util.*;

public class OefFruit1_opgave {

    public static void main(String args[]) {
        String arX[] = {"appel", "peer", "citroen", "kiwi"},
                arY[] = {"banaan", "mango", "citroen", "kiwi", "zespri"};

    /*
     * Behandel arX en arY als Collections en maak gebruik van de bulk
     * operaties om volgende output te leveren:
     * In y zit extra [banaan, mango, zespri]
     * In x zit extra [appel, peer]
     * x en y hebben gemeenschappelijk [citroen, kiwi]
    */
        
        Collection<String> x = Arrays.asList(arX); // Wordt een statische lijst gemaakt van arX genaamd x.
        Collection<String> y = Arrays.asList(arY); // Wordt een statische lisjt gemaakt van arY genaamd y.
        
        List<String> res1 = new ArrayList<>(y); // De statische lijst wordt een dynamische lijst d.m.v. ArrayList genaamd res1
        res1.removeAll(x); 
        System.out.printf("In arY zonder arX zit: %s%n", res1);

        
        List<String> res2 = new ArrayList<>(x);
        res2.removeAll(y);
        System.out.printf("In arX zonder arY zit: %s%n", res2);
      
        
        List<String> res3 = new ArrayList<>(x);
        res3.retainAll(y);
        System.out.printf("arX en arY hebben gemeenschappelijk: %s%n", res3);
        
        
        

        
    }
}
