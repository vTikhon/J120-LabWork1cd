package ru.avalon.vergentev.j120.labwork1cd;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>TASK 3 and 4<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        Set<Persons> persons = new HashSet<>();
        persons.add(new Teachers("Turner", "Ronald", Consts.MALE,"Computer science", Consts.PHD, "Programming paradigms"));
        persons.add(new Teachers("Hollings", "Ruth", Consts.FEMALE,"Jurisprudence", Consts.MSC, "Domestic arbitration"));
        persons.add(new Students("Wilkinson", "Leo", Consts.MALE,"Computer science", Consts.BACHELOR, 3));
        persons.add(new Students("Cunningham", "Anna", Consts.FEMALE,"World Economy", Consts.BACHELOR, 1));
        persons.add(new Students("Lundqvist", "Jill", Consts.FEMALE,"Jurisprudence", Consts.BACHELOR, 1));
        persons.add(new Postgraduates("Correa", "Ronald", Consts.MALE,"Computer science", "Design of a functional programming language"));
        System.out.println(persons);
    }
}
