package basic_objects;

public class ImmutableStudent {
    private int id;
    private BirthDate birthDate;

    public ImmutableStudent(int ssn, int year, int month, int day) {
        id = ssn;
        birthDate = new BirthDate(year, month, day);
    }

    public int getId() {
        return id;

    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public static void main(String[] args) {
        ImmutableStudent student = new ImmutableStudent(111223333, 1970, 5, 3);
        BirthDate date = student.getBirthDate();
        date.setYear(2010); // The student's birth year can be changed :(
    }
}

class BirthDate {
    private int year;
    private int month;
    private int day;

    public BirthDate(int newYear, int newMonth, int newDay) {
        year = newYear;
        month = newMonth;
        day = newDay;
    }

    public void setYear(int newYear) {
        year = newYear;
    }
}
