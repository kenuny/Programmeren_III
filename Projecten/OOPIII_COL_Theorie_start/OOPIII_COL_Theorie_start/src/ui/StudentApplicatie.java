package ui;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import domein.Student;

public class StudentApplicatie
{

    public static void main(String[] args)
    {
        List<Student> lijstStudenten = new ArrayList<>();

        
        lijstStudenten.add(new Student(20132566,"Janssens","Wendy","Eke"));
        lijstStudenten.add(new Student(20132567,"Janssens","Hans","Oudenaarde"));
        lijstStudenten.add(new Student(20132563,"Janssens","Jan","Gent"));
        lijstStudenten.add(new Student(20132564,"Karels","Matt","Gent"));
        lijstStudenten.add(new Student(20132565,"Fransen","Luc","Gent"));
         
        // werkt
        System.out.println(lijstStudenten);
        
        // werkt
        Collections.sort(lijstStudenten, new StudentSorterenVolgensNaamEnVoornaam());
        System.out.println("gesorteerd volgens naam: " + lijstStudenten);
        
        // werkt niet
         Collections.sort(lijstStudenten);
         System.out.println("gesorteerd: " + lijstStudenten);
        
        // natuurlijke sortering
        // afwijken kan door null te vervangen door new StudentSorterenVolgensNaamEnVoornaam
        lijstStudenten.sort(null);
    }
}