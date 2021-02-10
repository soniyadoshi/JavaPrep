package devideandconquer;

import java.util.Objects;

public class Student implements Comparable<Student> {

    int id;
    String name;
    String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        boolean f = name == student.name;
        return id == student.id &&
                name.equalsIgnoreCase(student.name) &&
                grade.equalsIgnoreCase( student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade);
    }
}
