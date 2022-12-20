package io.github.jihch;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[] strArray = {"isy", "mi", "ka", "sa"};

        List<String> list = Arrays.asList(strArray);

        System.out.println("第一次输出：");

        list.forEach(System.out::println);

        list.add("ccc");

        System.out.println("第二次输出：");

        list.forEach(System.out::println);

    }

}
