package ru.avalon.vergentev.j120.labwork1cd;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>TASK 3 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //создаём первую коллекцию (наследника от Persons)
        Set<Teachers> teachers = new HashSet<>();
        teachers.add(new Teachers("Turner", "Ronald", Consts.MALE,"Computer science", Consts.PHD, "Programming paradigms"));
        teachers.add(new Teachers("Hollings", "Ruth", Consts.FEMALE,"Jurisprudence", Consts.MSC, "Domestic arbitration"));

        //создаём вторую коллекцию (наследника от Persons)
        Set<Students> students = new HashSet<>();
        students.add(new Students("Wilkinson", "Leo", Consts.MALE,"Computer science", Consts.BACHELOR, 3));
        students.add(new Students("Cunningham", "Anna", Consts.FEMALE,"World Economy", Consts.BACHELOR, 1));
        students.add(new Students("Lundqvist", "Jill", Consts.FEMALE,"Jurisprudence", Consts.BACHELOR, 1));

        //создаём третью коллекцию (наследника от Persons)
        Set<Postgraduates> postgraduates = new HashSet<>();
        postgraduates.add(new Postgraduates("Correa", "Ronald", Consts.MALE,"Computer science", "Design of a functional programming language"));

        //создаём коллекцию принимающую коллекции наследников
        Set<Persons> persons = new HashSet<>();
        persons.addAll(teachers);
        persons.addAll(students);
        persons.addAll(postgraduates);

        //выводим методом printAll сведения коллекции, которая приняла коллекции наследников
        Persons.printAll((HashSet<? extends Persons>) persons);


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>TASK 4 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    }
}
