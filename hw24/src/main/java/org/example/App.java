package org.example;

import service.imp.StudentServiceImp;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main( String[] args ) throws SQLException, ClassNotFoundException {

        StudentServiceImp stSer = new StudentServiceImp();

        stSer.addStudent("Derkach Ivan",1,"1993");
        stSer.addStudent("Drach Sergij",2,"1994");
        stSer.addStudent("Barak Ostap",3,"1993");
        stSer.addStudent("Petrov Petro",2,"1992");
        stSer.addStudent("Ivanov Sasha",3,"1994");
        stSer.addStudent("Dereza Grisha",1,"1993");
        System.out.println("==============================");
        stSer.getAll();

        System.out.println("==============================");
        List <Integer> lInt = new ArrayList<>();

        lInt.add(34);
        lInt.add(35);

        stSer.getByIds(lInt);
        System.out.println("==============================");

        stSer.getByName("Barak Ostap");
        System.out.println("==============================");
        stSer.addStudent("Ivanov Ivan",2,"1993");

        stSer.deleteSt("Barak Ostap",3);
    }
}