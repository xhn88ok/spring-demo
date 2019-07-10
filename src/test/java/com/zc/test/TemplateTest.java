package com.zc.test;


import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TemplateTest {

    public static void main(String[] args) {
        String[] arry=new String[]{"tom","josh","bob"};
        if (arry == null) {
            System.out.println("arry not null");
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.println("arry = " + arry[i]);
        }

        for (int i = 0; i < arry.length; i++) {
            String s = arry[i];
            System.out.println(s);
        }

        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0,"Tom");
        map.put(1,"Json");
        map.put(2,"LiLei");
        map.put(3,"HanMeiMei");



        System.out.println(map.size());

    }
    @Test
    public void testTemp(){
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0,"Tom");
        map.put(1,"Json");
        map.put(2,"LiLei");
        map.put(3,"HanMeiMei");


        System.out.println(map.size());
    }
}
