package ru.avalon.vergentev.j120.labwork1cd;

public class Teachers<T1, T2, T3, T4> extends Persons<T1, T2, T3> {
    Consts DEGREE;
    private T4 specialization;

    //CONSTRUCTORS
    public Teachers(T1 surname, T2 name, Consts SEX, T3 faculty, Consts DEGREE, T4 specialization) {
        super(surname, name, SEX, faculty);
        this.DEGREE = DEGREE;
        setSpecialization(specialization);
    }

    //METHODS
    @Override
    public void print() {
        super.print();
        System.out.print("teaches at ");
        System.out.print(getFaculty() + " faculty. ");
        switch (SEX) {
            case MALE: System.out.print("He has "); break;
            case FEMALE: System.out.print("She has "); break;
        }
        switch (DEGREE) {
            case MSC: System.out.print("Master of science degree in " + getSpecialization() + ". "); break;
            case PHD: System.out.print("PhD degree in " + getSpecialization() + ". "); break;
            case DSC: System.out.print("Doctor of science degree  in " + getSpecialization() + ". "); break;
        }
    }


    //GETTERS AND SETTERS
    public T4 getSpecialization() {
        return specialization;
    }

    public void setSpecialization(T4 specialization) {
        this.specialization = specialization;
    }
}

