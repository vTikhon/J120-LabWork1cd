package ru.avalon.vergentev.j120.labwork1cd;
import java.util.*;

public class Students extends Persons {
    static Set<Students> studentsSet = new HashSet<>();
    Consts LEVEL;
    private int courseNumber;

    //CONSTRUCTORS
    public Students(String surname, String name, Consts SEX, String faculty, Consts LEVEL, int courseNumber) {
        super(surname, name, SEX, faculty);
        this.LEVEL = LEVEL;
        setCourseNumber(courseNumber);
    }


    //METHODS
    @Override
    public void print() {
        super.print();
        System.out.print("studies at ");
        System.out.print(getFaculty() + " faculty. ");
        switch (SEX) {
            case MALE: System.out.print("He is "); break;
            case FEMALE: System.out.print("She is "); break;
        }
        System.out.print(courseNumber + " year ");
        switch (LEVEL) {
            case BACHELOR: System.out.print(Consts.BACHELOR + "'s student. "); break;
            case MASTER: System.out.print(Consts.MASTER + "student. "); break;
        }
    }

    public static void addAll (Set <? super Students> set) {
        for (Object object : set) {
            if (object instanceof Students) studentsSet.add((Students) object);
        }
    }

    //GETTERS AND SETTERS
    public int getCourseNumber() {return courseNumber;}
    public void setCourseNumber(int courseNumber) {
        if (courseNumber < 1){
            throw new IllegalArgumentException("Number of course can't less than one");
        }
        this.courseNumber = courseNumber;
    }
}

