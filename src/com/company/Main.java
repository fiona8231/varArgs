package com.company;

public class Main {

    public static void main(String[] args) {

        methodVarArgs(2,3);
        methodVarArgs(2,3,4,5,1);

        appendString("HELLO","DUDE","HOW");

        calAverage(4.4,6.6);


    }

    public static void appendString(String...s){

        StringBuffer stbr = new StringBuffer();

        for( String x: s){

            stbr.append(x);
            stbr.append(" ");

        }

        System.out.println(stbr);
    }

    public static int methodNormal(int a, int b){
        return a + b;
    }

    public static int methodVarArgs(int...a){
        int total = 0;
        for(int i =0; i< a.length; i++ ){
            total+= a[i];
        }
        System.out.println("Total =" + total);
        return total;

    }

    public static double calAverage(double... numberOfUsersPerHour){
        double totalUsers = 0;

        for(double x: numberOfUsersPerHour){

            totalUsers += x;

        }
        double result = totalUsers / numberOfUsersPerHour.length;
        System.out.println("Average users =" +  result);
        return  result;
    }

}

