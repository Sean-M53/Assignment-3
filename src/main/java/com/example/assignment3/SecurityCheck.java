package com.example.assignment3;

public class SecurityCheck {

    public static boolean checkEmail(String email){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public static boolean checkPassword(String password){
        int letterCount = 0;
        int numCount = 0;
        int specialCount = 0;

        if (password.length() >= 7){
            if (password.matches(".*[a-z].*") == true || password.matches(".*[A-Z].*") == true){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {


    }
}
