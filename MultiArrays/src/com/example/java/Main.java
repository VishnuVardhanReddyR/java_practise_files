package com.example.java;

public class Main {

    public static void main(String[] args) {
        String[][] states = new String[3][2];
        states[0][0] = "Telangana";
        states[0][1] = "Hyderabad";
        states[1][0] = "karnataka";
        states[1][1] = "Bangalore";
        states[2][0] = "Tamil nadu";
        states[2][1] = "Chennai";
        for (int i = 0; i < states.length; i++){
            StringBuilder sb = new StringBuilder("The capital of ")
                                    .append(states[i][0])
                                    .append(" is : ")
                                    .append(states[i][1]);
            System.out.println(sb);
        }
    }
}
