package com.graviton.utils;

public class ArrayPrac {

    public static void main(String[] args) {

        //2D Array
        String[][] name = new String[3][3];
        name[0][0] ="JD";
        name[0][1] ="DAS";
        name[0][2] ="Rafi";
        name[1][0] ="NYC";
        name[1][1] ="DC";
        name[1][2] ="DC";
        name[2][0] ="Lipi";
        name[2][1] ="Taniya";
        name[2][2] ="UT";

        System.out.println(name);

        for(int i=0; i<name.length; i++){
            for(int j=0; j<name.length; j++){
               // System.out.println(name[i][j]);
            }

        }

        String[][] twoDnName = {{"JD","DAS", "RAFI"}, {"NYC","DC", "UT"}};


        //Normal Array
        String[] names = new String[5];
        names[0] = "Rafi";
        names[1] = "Taniya";
        names[2] = "JD";
        names[3] = "Ashik";
        names[4] = "Nayeem";

        //System.out.println(names[0]);
    }
}
