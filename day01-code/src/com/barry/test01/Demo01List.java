package com.barry.test01;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
