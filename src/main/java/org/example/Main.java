package org.example;

public class Main {
    public static void main(String[] args) {
        String[] city ={"melborne","sydney","queensland","adelaide"};
                for (int i =0; i < city.length;i++) {
                    System.out.println(city[i]);
                }
                //for - each loop
                int[] marks ={4,5,6,7,89,};
                for (int t: marks) {
                    System.out.println(t);
                }
                //multidirectional array.
        String[][] objects={{"shisha","coal","flavor"},{"port","bow","flask"}};
                String y= objects[1][2];
                System.out.println(y);
                int[][] gpa ={{21,23,56,78,98},{5,7,9,2,1}};
                for (int i =0; i < gpa.length;i++){
                    for (int k=0; k <gpa[i].length;k++){
                        System.out.println(gpa[i][k]);
                    }
                }
    }
}