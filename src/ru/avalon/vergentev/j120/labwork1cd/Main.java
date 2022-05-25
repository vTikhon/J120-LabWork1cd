package ru.avalon.vergentev.j120.labwork1cd;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>TASK 3 (правило HashSet<? extends Persons>) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //создаём вторую коллекцию (наследника от Persons)
        Set<Students> students = new HashSet<>();
        students.add(new Students("Wilkinson", "Leo", Consts.MALE,"Computer science", Consts.BACHELOR, 3));
        students.add(new Students("Cunningham", "Anna", Consts.FEMALE,"World Economy", Consts.BACHELOR, 1));
        students.add(new Students("Lundqvist", "Jill", Consts.FEMALE,"Jurisprudence", Consts.BACHELOR, 1));

        //создаём третью коллекцию (наследника от Persons)
        Set<Postgraduates> postgraduates = new HashSet<>();
        postgraduates.add(new Postgraduates("Correa", "Ronald", Consts.MALE,"Computer science", "Design of a functional programming language"));

        //создаём первую коллекцию (наследника от Persons)
        Set<Teachers> teachers = new HashSet<>();
        teachers.add(new Teachers("Turner", "Ronald", Consts.MALE,"Computer science", Consts.PHD, "Programming paradigms"));
        teachers.add(new Teachers("Hollings", "Ruth", Consts.FEMALE,"Jurisprudence", Consts.MSC, "Domestic arbitration"));

        //создаём коллекцию принимающую коллекции наследников
        Set<Persons> persons = new HashSet<>();
        persons.addAll(teachers);
        persons.addAll(students);
        persons.addAll(postgraduates);

        //выводим методом printAll сведения коллекции, которая приняла коллекции наследников
        Persons.printAll(persons);


        System.out.println("\n--------------------------------------------------------------------------------");
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>TASK 4  (правило HashSet<? super Students>) <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //создаём коллекцию Persons в которую помещаем все объекты наследников
        Set<Persons> personsSet = new HashSet<>();
        personsSet.add(new Teachers("Turner", "Ronald", Consts.MALE,"Computer science", Consts.PHD, "Programming paradigms"));
        personsSet.add(new Teachers("Hollings", "Ruth", Consts.FEMALE,"Jurisprudence", Consts.MSC, "Domestic arbitration"));
        personsSet.add(new Students("Wilkinson", "Leo", Consts.MALE,"Computer science", Consts.BACHELOR, 3));
        personsSet.add(new Students("Cunningham", "Anna", Consts.FEMALE,"World Economy", Consts.BACHELOR, 1));
        personsSet.add(new Students("Lundqvist", "Jill", Consts.FEMALE,"Jurisprudence", Consts.BACHELOR, 1));
        personsSet.add(new Postgraduates("Correa", "Ronald", Consts.MALE,"Computer science", "Design of a functional programming language"));

        //добавляем в коллекцию studentsSet - студентов из Persons
        Students.addAll(personsSet);
        //добавляем в коллекцию postgraduatesSet - аспирантов из Persons
        Postgraduates.addAll(personsSet);
        //добавляем в коллекцию teachersSet - учителей из Persons
        Teachers.addAll(personsSet);

        //проверяем информацию о каждой коллекции в коллекции
        Persons.printAll(Students.studentsSet);
        Persons.printAll(Postgraduates.postgraduatesSet);
        Persons.printAll(Teachers.teachersSet);
    }
}
