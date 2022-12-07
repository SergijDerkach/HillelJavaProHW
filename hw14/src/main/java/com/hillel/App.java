package com.hillel;

import java.util.*;

import static java.util.stream.Collectors.toCollection;

public class App{
    public static void main( String[] args ){
        Count count = new Count();
        Scanner question = new Scanner(System.in);
        System.out.println("Input values: ");
        String tnum = question.nextLine();

        String[] vals = tnum.split("");
        Collection<Integer> nums;

        nums = Arrays.stream(vals).map(App::apply).filter(v->v!=-1).collect(toCollection(ArrayList::new));

        String[][] arrays = new String[7][nums.size()*4];

        nums.stream().map(n -> arrayNum(n)).map(a->{

            for (int i = 0; i < a.length; i++){
                for(int j = 0; j < a[i].length; j++) {
                    arrays[i][j+count.getCount()] = a[i][j];
                }
            }

            count.setCount(count.getCount());
            return arrays;
        }).collect(toCollection(ArrayList::new)).stream().limit(1).forEach(n->showArray(n));

    }



    static private String[][] arrayNum(int num){
        String[][] vNum = new String[7][4];
        switch (num){
            case 0:
                vNum = new String[][]{
                        {" ", " ", "@", " "},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", " ", "@", " "}
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
                        {" ", " ", "@", " "},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", " ", "@", " "},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", " ", "@", " "}
                };
                break;
            case 9:
                vNum = new String[][]{
                        {" ", " ", "@", " "},
                        {" ", "@", " ", "@"},
                        {" ", "@", " ", "@"},
                        {" ", " ", "@", "@"},
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
            System.out.println("");
        }
    }

    static private Integer apply(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {

        }
        return -1;
    }

}

