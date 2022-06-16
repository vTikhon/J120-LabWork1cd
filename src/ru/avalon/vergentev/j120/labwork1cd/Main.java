package ru.avalon.vergentev.j120.labwork1cd;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //создаём первую коллекцию (наследника от Persons)
        Set<Students> students = new HashSet<>();
        students.add(new Students("Wilkinson", "Leo", Consts.MALE,"Computer science", Consts.BACHELOR, 3));
        students.add(new Students("Cunningham", "Anna", Consts.FEMALE,"World Economy", Consts.BACHELOR, 1));
        students.add(new Students("Lundqvist", "Jill", Consts.FEMALE,"Jurisprudence", Consts.BACHELOR, 1));

        //создаём вторую коллекцию (наследника от Persons)
        Set<Postgraduates> postgraduates = new HashSet<>();
        postgraduates.add(new Postgraduates("Correa", "Ronald", Consts.MALE,"Computer science", "Design of a functional programming language"));

        //создаём третью коллекцию (наследника от Persons)
        Set<Teachers> teachers = new HashSet<>();
        teachers.add(new Teachers("Turner", "Ronald", Consts.MALE,"Computer science", Consts.PHD, "Programming paradigms"));
        teachers.add(new Teachers("Hollings", "Ruth", Consts.FEMALE,"Jurisprudence", Consts.MSC, "Domestic arbitration"));


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>TASK 3 (правило HashSet<? extends Persons>) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //проверяем информацию о каждой коллекции в коллекции посредством printAll в классе родителе Person
        Persons.printAll(students);
        Persons.printAll(postgraduates);
        Persons.printAll(teachers);

        System.out.println("\n--------------------------------------------------------------------------------");
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>TASK 4  (правило HashSet<? super T>) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //добавляем в коллекцию personSet - студентов
        Students.addAll(students);
        //добавляем в коллекцию personSet - аспирантов
        Students.addAll(postgraduates);
        //добавляем в коллекцию personSet - учителей
        Students.addAll(teachers);

        //проверяем информацию о каждой коллекции в коллекции
        Persons.printAll(Persons.personSet);
    }
}
