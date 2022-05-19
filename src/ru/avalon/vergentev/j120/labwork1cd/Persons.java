package ru.avalon.vergentev.j120.labwork1cd;
import java.util.*;

public class Persons {
    static Set<Persons> personsSet = new HashSet<>();
    private String surname;
    private String name;
    private String faculty;
    Consts SEX;

    //CONSTRUCTORS
    public Persons(String surname, String name, Consts SEX, String faculty) {
        setSurname(surname);
        setName(name);
        this.SEX = SEX;
        setFaculty(faculty);
    }

    //METHODS
    public void print () {
        System.out.println('\n');
        System.out.print("This is " + getSurname() + " " + getName() + ". ");
        switch (SEX) {
            case MALE: System.out.print("He "); break;
            case FEMALE: System.out.print("She "); break;
        }
    }

    public static void printAll (HashSet <? extends Persons> hashSet) {
        hashSet.forEach(Persons::print);
    }

    public static void addAll (HashSet <? extends Persons> hashSet) {
        personsSet.addAll(hashSet);
    }

    //GETTERS AND SETTERS
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}

