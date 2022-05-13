package ru.avalon.vergentev.j120.labwork1cd;

public class Teachers extends Persons {
    Consts DEGREE;
    private String specialization;

    //CONSTRUCTORS
    public Teachers(String surname, String name, Consts SEX, String faculty, Consts DEGREE, String specialization) {
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
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

