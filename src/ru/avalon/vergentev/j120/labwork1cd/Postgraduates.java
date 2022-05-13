package ru.avalon.vergentev.j120.labwork1cd;

public class Postgraduates extends Persons {
    private String dissertationTitle;

    //CONSTRUCTORS
    public Postgraduates(String surname, String name, Consts SEX, String faculty, String dissertationTitle) {
        super(surname, name, SEX, faculty);
        setDissertationTitle(dissertationTitle);
    }

    //METHODS
    @Override
    public void print() {
        super.print();
        System.out.print("studies at ");
        System.out.print(getFaculty() + " faculty. ");
        switch (SEX) {
            case MALE: System.out.print("His "); break;
            case FEMALE: System.out.print("Her "); break;
        }
        System.out.print("thesis title is " + getDissertationTitle() + ". ");
    }

    //GETTERS AND SETTERS
    public String getDissertationTitle() {
        return dissertationTitle;
    }

    public void setDissertationTitle(String dissertationTitle) {
        this.dissertationTitle = dissertationTitle;
    }
}

