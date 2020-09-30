package com.example.java;

public class Main {

    public static void main(String[] args) {
        String welcome = "welcome!";
        char[] chars = welcome.toCharArray();

        try{
            if(chars.length < 10){
                throw (new Exception("My custom exception"));
            }
            char lastChar = chars[chars.length-1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
            System.out.println("subString : " + sub);
        } catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("array index error");
        } catch(StringIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
