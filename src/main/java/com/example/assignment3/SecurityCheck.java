package com.example.assignment3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurityCheck {

    public static boolean checkEmail(String email){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public static boolean checkPassword(String password){
        int letter = 0;
        int special = 0;

        String validChars = "*^&@!";

        ArrayList<String> alphabet = new ArrayList<String>();


        char c;
        for(c = 'A'; c <= 'Z'; ++c){
            String s = Character.toString(c);
            alphabet.add(s);
        }
        for(c = 'a'; c <= 'z'; ++c){
            String s = Character.toString(c);
            alphabet.add(s);
        }

        for (int j = 0; j < password.length(); j++) {
            char x = password.charAt(j);
            String s = Character.toString(x);
            if (alphabet.contains(s)) {
                letter += 1;
            } else if (validChars.contains(s)){
                special += 1;
            }
        }


        if (password.length() >= 7){
            if(letter > 0) {
                if (special > 0){
                    return true;
                }
            }
        }
         return false;
    }

    public static void main(String[] args) {


    }
}
