package ui;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OefFruit3_opgave {

    public static void main(String args[]) {
        String kist[][] = {{"appel", "peer", "citroen", "kiwi", "perzik"},
        {"banaan", "mango", "citroen", "kiwi", "zespri", "pruim"},
        {"peche", "lichi", "kriek", "kers", "papaya"}};

        List<String> list =  Arrays.stream(kist)
        						   .flatMap(Arrays::stream)
        						   .collect(Collectors.toList());
        
        Scanner in = new Scanner(System.in);

        //declaratie + creatie map
        //------------------------------
        Map <String, Double> fruit = new TreeMap<>();
        Scanner scan = new Scanner(System.in);
        
        list.forEach(eenFruit -> fruit.put(eenFruit, null));
        fruit.entrySet().forEach(eenEntry -> {
        	System.out.printf("Prijs van %s", eenEntry.getKey());
        	double prijs = scan.nextDouble();
        	eenEntry.setValue(prijs);
        	
        });
        
        fruit.forEach((sleutel, waarde) -> System.out.printf("%s%t%.2f%n", sleutel, waarde));
                         
        
        /*Berg de fruit list van vorige oefeningen in een boom
 op zodat dubbels geïlimineerd worden.
 Er moet ook de mogelijkheid zijn de bijhorende prijs
 (decimale waarde) bij te houden.*/
        //------------------------------------------------------------
        list.
        
        /*Doorloop de boom in lexicaal oplopende volgorde en vraag
 telkens de bijhorende prijs, die je mee in de boom opbergt.*/
        //------------------------------------------------------------
        fruit.
                
           System.out.printf("Prijs van %s : ", );
           double prijs = in.nextDouble();

        
        
        /*Druk vervolgens de volledige lijst in twee
 kolommen (naam : prijs) in lexicaal oplopende volgorde af
 op het scherm.*/
        //------------------------------------------------------------
        fruit.
                
             System.out.printf("%s\t%.2f%n",   
    }
}
