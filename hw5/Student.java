package hw5;

public class Student {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private int yearOfBirth;
    private String course;
    private String adress;
    private String phonenumber;
    private String faculty;
    private String group;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String id, String name, String surname, String phonenumber, int yearOfBirth, String course, String faculty, String group){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phonenumber = phonenumber;
        this.faculty = faculty;
        this.group = group;
        this.course = course;
    }

    public Student(String id, String name, String surname,String phonenumber,  int yearOfBirth, String course, String faculty, String group,String patronymic, String adress){
          this.id = id;
          this.name = name;
          this.surname = surname;
          this.patronymic = patronymic;
          this.yearOfBirth = yearOfBirth;
          this.adress = adress;
          this.phonenumber = phonenumber;
          this.course = course;
          this.faculty = faculty;
          this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", course=" + course +
                ", adress='" + adress + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
