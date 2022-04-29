package ru.avalon.vergentev.j120.labwork1cd;

public class Postgraduates<T1, T2, T3, T5> extends Persons<T1, T2, T3> {
    private T5 dissertationTitle;

    //CONSTRUCTORS
    public Postgraduates(T1 surname, T2 name, Consts SEX, T3 faculty, T5 dissertationTitle) {
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
    public T5 getDissertationTitle() {
        return dissertationTitle;
    }

    public void setDissertationTitle(T5 dissertationTitle) {
        this.dissertationTitle = dissertationTitle;
    }
}

