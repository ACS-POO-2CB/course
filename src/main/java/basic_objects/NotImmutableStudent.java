package basic_objects;

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

    @Override
    public String toString() {
        return "BirthDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

public class NotImmutableStudent {
    private final long id;
    private final BirthDate birthDate;

    public NotImmutableStudent(long cnp, int year, int month, int day) {
        id = cnp;
        birthDate = new BirthDate(year, month, day);
    }

    public long getId() {
        return id;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public static void main(String[] args) {
        NotImmutableStudent student = new NotImmutableStudent(111223333, 1970, 5, 3);

        student.getBirthDate().setYear(2010); // The student's birth year can be changed :(

        System.out.println(student.getBirthDate());
    }
}


