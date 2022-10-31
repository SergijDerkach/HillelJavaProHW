package hw5;

public class StudentServise {
    public static boolean showStudFaculty(String searchNameFaculty, String stNameFacult) {
        if (searchNameFaculty == stNameFacult) {
            return true;
        } else
            return false;
    }

    public static boolean showStudFacultyCourse(String sNameFaculty, String sNumCourse, String stNameFacult, String stNameFacultCourse) {

        if (sNameFaculty == stNameFacult && sNumCourse == stNameFacultCourse) {
            return true;
        } else
            return false;
    }

    public static boolean showStudAfterYearOfBirth(int searchYearOfBirth,int studYearOfBirth){

        if(searchYearOfBirth < studYearOfBirth ){
            return true;
        }else
            return false;
    }

    public static boolean showListGroup(String sNameGroup, String searchListGroup) {
        if (searchListGroup == sNameGroup) {
            return true;
        } else
            return false;
    }
}
