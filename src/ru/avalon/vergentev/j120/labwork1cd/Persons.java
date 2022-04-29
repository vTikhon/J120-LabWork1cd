package ru.avalon.vergentev.j120.labwork1cd;

import java.util.HashSet;
import java.util.Iterator;

public class Persons<T1, T2, T3> {
    private T1 surname;
    private T2 name;
    private T3 faculty;
    Consts SEX;

    //CONSTRUCTORS
    public Persons(T1 surname, T2 name, Consts SEX, T3 faculty) {
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




    //GETTERS AND SETTERS
    public T1 getSurname() {
        return surname;
    }

    public void setSurname(T1 surname) {
        this.surname = surname;
    }

    public T2 getName() {
        return name;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public T3 getFaculty() {
        return faculty;
    }

    public void setFaculty(T3 faculty) {
        this.faculty = faculty;
    }

}

