package task4;

public class Student implements Comparable<Student> {
    private String firstname;
    private String lastname;
    private String group;
    private int year;

    public Student(String firstname, String lastname, String group, int year) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.group = group;
        this.year = year;
    }

    @Override
    public int compareTo(Student o) {
        if(this.year != o.year){
            return Integer.compare(this.year, o.year);
        }
        if(!this.group.equals(o.group)){
            return this.group.compareTo(o.group);
        }
        return this.lastname.compareTo(o.lastname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", group='" + group + '\'' +
                ", year=" + year +
                '}';
    }
}
