package com.hillel;


import java.util.*;

import static java.util.stream.Collectors.toCollection;


public class App{
    public static void main( String[] args ){
        Scanner question = new Scanner(System.in);
        System.out.println("Input values: ");
        String tnum = question.nextLine();

        String[] vals = tnum.split("");
        Collection<Integer> nums;

        nums = Arrays.stream(vals).map(App::apply).filter(v->v!=-0).collect(toCollection(ArrayList::new));

        nums.stream().map(n->arrayNum(n)).forEach(n->showArray(n));
    }

    static private String[][] arrayNum(int num){
        String[][] vNum = new String[7][4];
        switch (num){
            case 0:
                vNum = new String[][]{
                        {" ", "@", "@", " "},
                        {"@", " ", " ", "@"},
                        {"@", " ", " ", "@"},
                        {"@", " ", " ", "@"},
                        {"@", " ", " ", "@"},
                        {"@", " ", " ", "@"},
                        {" ", "@", "@", " "}
                };
                break;
            case 1:
                vNum = new String[][]{
                        {" ", " ", "@", " "},
                        {" ", "@", "@", " "},
                        {" ", " ", "@", " "},
                        {" ", " ", "@", " "},
                        {" ", " ", "@", " "},
                        {" ", " ", "@", " "},
                        {" ", "@", "@", "@"}
                };
                break;
            case 2:
                vNum = new String[][]{
                        {" ", "@", "@", " "},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", "@"},
                        {" ", " ", "@", " "},
                        {" ", "@", " ", " "},
                        {" ", "@", " ", " "},
                        {" ", "@", "@", "@"}
                };
                break;
            case 3:
                vNum = new String[][]{
                        {" ", "@", "@", " "},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", "@"},
                        {" ", "@", "@", " "},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", "@"},
                        {" ", "@", "@", " "}
                };
                break;
            case 4:
                vNum = new String[][]{
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", "@", "@", "@"},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", "@"}
                };
                break;
            case 5:
                vNum = new String[][]{
                        {" ", "@", "@", "@"},
                        {" ", "@", " ", " "},
                        {" ", "@", " ", " "},
                        {" ", "@", "@", "@"},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", "@"},
                        {" ", "@", "@", "@"}
                };
                break;
            case 6:
                vNum = new String[][]{
                        {" ", " ", "@", "@"},
                        {" ", "@", " ", " "},
                        {" ", "@", " ", " "},
                        {" ", "@", "@", " "},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", " ", "@", " "}
                };
                break;
            case 7:
                vNum = new String[][]{
                        {" ", "@", "@", "@"},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", " "},
                        {" ", " ", "@", " "},
                        {" ", " ", " ", " "},
                        {" ", "@", " ", " "},
                        {" ", " ", " ", " "}
                };
                break;
            case 8:
                vNum = new String[][]{
                        {" ", "@", "@", " "},
                        {"@", " ", " ", "@"},
                        {"@", " ", " ", "@"},
                        {" ", "@", "@", " "},
                        {"@", " ", " ", "@"},
                        {"@", " ", " ", "@"},
                        {" ", "@", "@", " "}
                };
                break;
            case 9:
                vNum = new String[][]{
                        {" ", "@", "@", " "},
                        {"@", " ", " ", "@"},
                        {"@", " ", " ", "@"},
                        {" ", "@", "@", "@"},
                        {" ", " ", " ", "@"},
                        {" ", " ", " ", "@"},
                        {" ", "@", "@", " "}
                };
                break;
            default:
                System.out.println("You entered the wrong number!");
        }
        return vNum;
    }
    static private void showArray(String[][] arr){
        for (int i = 0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }

    private static Integer apply(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {

        }
        return -0;
    }

    private static String[][] concatArray(String[][] arr, String[][] arrNums){
        for(int i=0;i<arr.length;i++){

        }
        return arrNums;
    }
}
