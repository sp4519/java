package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class string_01 {
    public static void main(String[] args) {
        String name = "  Shashwat  ";
        int value = name.length();
        //System.out.println(value);
        //System.out.println(name.toLowerCase(Locale.ROOT));
        //System.out.println(name.toUpperCase(Locale.ROOT));
        //System.out.println(name.trim());
       // System.out.println(name.substring(5));
        String k = name.replace(" ","@");
        System.out.println(k);
       // System.out.println(name.endsWith("wat"));
        //System.out.println(name.charAt(3));
        //System.out.println(name.equalsIgnoreCase("hashwat"));

    }
}
