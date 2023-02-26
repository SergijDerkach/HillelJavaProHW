package org.example;


import lombok.ToString;

@ToString
public class Student {
    public int id;
    public String fullName;
    public String group;
    public String yearOfAdmission;

    public Student(int id, String name, String group,String yearOfAdmission){
        this.id = id;
        this.fullName = name;
        this.group = group;
        this.yearOfAdmission = yearOfAdmission;
    }
}

