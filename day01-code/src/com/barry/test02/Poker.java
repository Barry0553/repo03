package com.barry.test02;

import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Poker {
    public static void main(String[] args) {
        //先创建一个map集合，用来存储索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个list的集合用来存储索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个数组
        String[] colors = {"♣", "♥", "♦", "♠"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String color : colors) {
            for (String number : numbers) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        Collections.shuffle(pokerIndex);
//        System.out.println(pokerIndex);
//        System.out.println(poker);
        ArrayList<Integer> one=new ArrayList<>();
        ArrayList<Integer> two=new ArrayList<>();
        ArrayList<Integer> three=new ArrayList<>();
        ArrayList<Integer> four=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i>=51){
                four.add(i);
            }else if (i%3==0){
                one.add(i);
            }else if (i%3==1){
                two.add(i);
            }else if (i%3==2){
                three.add(i);
            }
        }
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(four);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);


    }
}
