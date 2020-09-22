package ui;

import java.util.*;

public class KleineOefeningenList_Opgave {

    private static final String COLORS[] = {"red", "white", "blue"};

    //declareer list en list2 van type List. De collections zullen Strings bijhouden.
    //------------------------------------------------------------------------------
    public KleineOefeningenList_Opgave() {

        // cre�er arrayList list en vul op met { "red", "white", "blue" }  (= 1 instructie)
        //----------------------------------------------------
        weergevenLijst("oplossing: red white blue ", list);

		// Cre�er een tweede lege arrayList (list2)
		// -------------------------------------------
		

		// alle elementen van list kopi�ren naar een tweede arrayList list2 (= 1
		// instructie)
		// ---------------------------------------------------------------------------------
		
		
        naarHoofdletterOmzetten(list);
        weergevenLijst("oplossing: alle elementen van list in hoofdletters", list);

        list = naarKleineLettersOmzetten(list);
        weergevenLijst("oplossing: alle elementen van list in kleine letters", list);

   } // end constructor

   public <E> void weergevenLijst(String oplossing, List<E> list) {
        //Geef alle elementen van de List weer (laat een spatie tussen elk element).
        //Gebruik printf*/
	    //List<String> veranderen door E typeparametersectie voor de teruggeefwaarde plaatsen
        //--------------------------------------------------------------------------
        
	   System.out.printf("%s%n%s", oplossing, "           ");

	   for (E e : list)
		System.out.printf("%s", e);
	   System.out.println("\n");
	   
	   // Initieel
	   // public * void weerg...(String oplossing, List<*String> ..)
	   // for(*String ..
	   
	   // of met lambda
	   list.forEach(e -> System.out.printf("%s", e));

    }

    public void naarHoofdletterOmzetten(List<String> list) {
        //Alle strings van list worden omgezet naar hoofdletters
        //-------------------------------------------------------------
        //JAVA 7:

        //JAVA 8:

    }

    public List<String> naarKleineLettersOmzetten(List<String> list)
    {
       ////De strings van list worden omgezet naar kleine letters en worden
        //als nieuwe List<String> teruggegeven.
       //-------------------------------------------------------------
       //JAVA 8:
        return null;
    }

    public static void main(String args[]) {
        new KleineOefeningenList_Opgave();
    }

} // end class KleineOefeningenList_Opgave
