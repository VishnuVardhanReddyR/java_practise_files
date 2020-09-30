package com.example.java;

public class Main {

    public static void main(String[] args) {
        String welcome = "welcome!";
        char[] chars = welcome.toCharArray();

        try{
            char lastChar = chars[chars.length - 1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
            System.out.println(sub);
        }catch(ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("array index error");
            try{
                String sub1 = welcome.substring(10);
                System.out.println(sub1);
            } catch (StringIndexOutOfBoundsException e1){
                System.out.println("string index error");
            }
        } catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
