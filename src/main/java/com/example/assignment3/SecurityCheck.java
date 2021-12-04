package com.example.assignment3;

public class SecurityCheck {

    public static boolean checkEmail(String email){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public static boolean checkPassword(String password){
        return false;
    }

    public static void main(String[] args) {


    }
}
