package ru.avalon.vergentev.j120.labwork1cd;

public class Students<T1, T2, T3, T6> extends Persons<T1, T2, T3> {
    Consts LEVEL;
    private T6 courseNumber;

    //CONSTRUCTORS
    public Students(T1 surname, T2 name, Consts SEX, T3 faculty, Consts LEVEL, T6 courseNumber) {
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
        System.out.print(getCourseNumber() + " year ");
        switch (LEVEL) {
            case BACHELOR: System.out.print(Consts.BACHELOR + "'s student. "); break;
            case MASTER: System.out.print(Consts.MASTER + "student. "); break;
        }
    }

    //GETTERS AND SETTERS
    public T6 getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(T6 courseNumber) {
        if ((int)courseNumber < 1){
            throw new IllegalArgumentException("Number of course can't less than one");
        }
        this.courseNumber = courseNumber;
    }

}

