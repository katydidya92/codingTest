package com.example.codingtest.test;

import java.util.ArrayList;

public class ArrayTest {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        System.out.println(list1.get(0));
        System.out.println(list1.size());
        list1.remove(1);
        System.out.println(list1.size());

        Integer[][] data_list = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(data_list[0][0]);
        System.out.println(data_list[0][1]);
        System.out.println(data_list[0][2]);
        System.out.println(data_list[1][0]);
        System.out.println(data_list[1][1]);
        System.out.println(data_list[1][2]);


        // 3차원 배열에서 8, 10, 2 를 순서대로 각각의 라인에 출력하기
        Integer[][][] data_list3 = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        System.out.println("=========================");
        System.out.println(data_list3[1][0][1]); // 8
        System.out.println(data_list3[1][1][0]); // 10
        System.out.println(data_list3[0][0][1]); // 2

        String[] dataset = {
                "Braund, Mr. Owen Harris",
                "Cumings, Mrs. John Bradley (Florence Briggs Thayer)",
                "Heikkinen, Miss. Laina",
                "Futrelle, Mrs. Jacques Heath (Lily May Peel)",
                "Allen, Mr. William Henry",
                "Moran, Mr. James",
                "McCarthy, Mr. Timothy J",
                "Palsson, Master. Gosta Leonard",
                "Johnson, Mrs. Oscar W (Elisabeth Vilhelmina Berg)",
                "Nasser, Mrs. Nicholas (Adele Achem)",
                "Sandstrom, Miss. Marguerite Rut",
                "Bonnell, Miss. Elizabeth",
                "Saundercock, Mr. William Henry",
                "Andersson, Mr. Anders Johan",
                "Vestrom, Miss. Hulda Amanda Adolfina",
                "Hewlett, Mrs. (Mary D Kingcome) ",
                "Rice, Master. Eugene",
                "Williams, Mr. Charles Eugene",
                "Vander Planke, Mrs. Julius (Emelia Maria Vandemoortele)",
                "Masselmani, Mrs. Fatima",
                "Fynney, Mr. Joseph J",
                "Beesley, Mr. Lawrence",
                "McGowan, Miss. Anna",
                "Sloper, Mr. William Thompson",
                "Palsson, Miss. Torborg Danira",
                "Asplund, Mrs. Carl Oscar (Selma Augusta Emilia Johansson)",
                "Emir, Mr. Farred Chehab",
                "Fortune, Mr. Charles Alexander",
                "Dwyer, Miss. Ellen",
                "Todoroff, Mr. Lalio"
        };

        System.out.println("================================");
        // 위 1차원 배열에서, 문자 M 을 가지고 있는 아이템의 수를 출력해보기
        int count = 0;
        for (String s : dataset) {
            if (s.contains("M")) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

}
