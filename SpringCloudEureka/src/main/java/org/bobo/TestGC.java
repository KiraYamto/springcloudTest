package org.bobo;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

/**
 * @author tian.xubo
 * @created 2018 - 09 - 09 17:59
 */
public class TestGC {
    public static void main(String[] args) {
        String a = new String("111");
        a = "12";
        System.out.println(a);


    }
}
