package hw5;

public class StudentRun extends Student {
    public StudentRun(String id, String name, String surname, String phonenumber, int yearOfBirth, String course, String faculty, String group) {
        super(id, name, surname, phonenumber, yearOfBirth, course, faculty, group);
    }

    public StudentRun(String id, String name, String surname, String phonenumber, int yearOfBirth, String course, String faculty, String group, String patronymic, String adress) {
        super(id, name, surname, phonenumber, yearOfBirth, course, faculty, group, patronymic, adress);
    }

    public static void main(String[] args) {
        StudentRun[] studentList = new StudentRun[10];

        studentList[0] = new StudentRun("1", "Ivan", "Ivanov", "380958652541", 1992, "2", "FET", "E-101", "Ivanovach", "Dnepr, str Gladkova 106");
        studentList[1] = new StudentRun("2", "Petro", "Petrov", "380958652542", 1992, "3", "FEB", "F-102", "Petrovuich", "Dnepr, str Gladkova 102");
        studentList[2] = new StudentRun("3", "Sidor", "Sidorov", "380958652543", 1993, "2", "FET", "E-101", "Sergiyovuch", "Dnepr, str Gladkova 10");
        studentList[3] = new StudentRun("4", "Sergij", "Melnuk", "380958652544", 1993, "3", "FEB", "E-101");
        studentList[4] = new StudentRun("5", "Oleksandr", "Boyko", "380958652545", 1993, "2", "FET", "F-102");
        studentList[5] = new StudentRun("6", "Igor", "Koval", "380958652546", 1993, "2", "FET", "F-102");
        studentList[6] = new StudentRun("7", "Irina", "Bondar", "380958652547", 1991, "1", "FEB", "F-102");
        studentList[7] = new StudentRun("8", "Sveta", "Moroz", "380958652548", 1993, "2", "FET", "E-101", "Ivanovich", "Dnepr, str Gladkova 10");
        studentList[8] = new StudentRun("9", "Olga", "Kravchuk", "380958652549", 1991, "1", "FEB", "F-102", "Ivanovich", "Dnepr, str Gladkova 6");
        studentList[9] = new StudentRun("10", "Ivan", "Mazur", "380958652511", 1993, "1", "FET", "E-101");

        String searchNameFaculty = "FET";
        StudentServise studentServise = new StudentServise();

        for (int i = 0; i < studentList.length; i++) {
            String studNameFaculty = studentList[i].getFaculty();
            boolean found = false;
            found = studentServise.showStudFaculty(searchNameFaculty, studNameFaculty);

            if (found) {
                System.out.println(studentList[i].toString());
            }
        }
        System.out.println("----------------------------------");

        searchNameFaculty = "FEB";
        String searchNumCourse = "1";

        for (int i = 0; i < studentList.length; i++) {
            String studNameFaculty = studentList[i].getFaculty();
            String studNumCourse = studentList[i].getCourse();
            boolean found = false;

            found = studentServise.showStudFacultyCourse(searchNameFaculty, searchNumCourse, studNameFaculty, studNumCourse);
            if (found) {
                System.out.println(studentList[i].toString());
            }
        }
        System.out.println("----------------------------------");

        int searchYearOfBirth = 1992;
        for (int i = 0; i < studentList.length; i++) {
            int studYearOfBirth =studentList[i].getYearOfBirth();
            boolean found = false;

            found = studentServise.showStudAfterYearOfBirth(searchYearOfBirth,studYearOfBirth);
            if (found) {
                System.out.println(studentList[i].toString());
            }
        }

        System.out.println("----------------------------------");
        String searchListGroup = "E-101";
        for (int i = 0; i < studentList.length; i++) {
            String studListGroup =studentList[i].getGroup();
            boolean found = false;

            found = studentServise.showListGroup(studListGroup,searchListGroup);
            if (found) {
                System.out.println(studentList[i].toString());
            }
        }

    }

//    static boolean showStudFaculty(String searchNameFaculty, String stNameFacult) {
//        if (searchNameFaculty == stNameFacult) {
//            return true;
//        } else
//            return false;
//    }
//
//    static boolean showStudFacultyCourse(String sNameFaculty, String sNumCourse, String stNameFacult, String stNameFacultCourse) {
//
//        if (sNameFaculty == stNameFacult && sNumCourse == stNameFacultCourse) {
//            return true;
//        } else
//            return false;
//    }
//
//    static boolean showStudAfterYearOfBirth(int searchYearOfBirth,int studYearOfBirth){
//
//            if(searchYearOfBirth < studYearOfBirth ){
//                return true;
//            }else
//                return false;
//        }
//
//    static boolean showListGroup(String sNameGroup, String searchListGroup) {
//        if (searchListGroup == sNameGroup) {
//            return true;
//        } else
//            return false;
//    }
}



