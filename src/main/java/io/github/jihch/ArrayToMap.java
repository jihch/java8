package io.github.jihch;

import io.github.jihch.bean.Customer;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 数组转映射
 */
public class ArrayToMap {

    /**
     * 写法1
     */
    @Test
    public void test1() {
        Map<String, Field> m = Arrays.asList(Customer.class.getDeclaredFields()).stream().collect(Collectors.toMap(Field::getName, Function.identity()));
        m.forEach((k, v) -> System.out.printf("k:%s, v:%s\n", k, v));
    }

    @Test
    public void test2(){
        Map<String, Field> m = Arrays.asList(Customer.class.getDeclaredFields()).stream().collect(Collectors.toMap(t->t.getName(), t->t));
        m.forEach((k, v) -> System.out.printf("k:%s, v:%s\n", k, v));
    }

    @Test
    public void test3(){
        Map<String, Field> m = Stream.of(Customer.class.getDeclaredFields()).collect(Collectors.toMap(t->t.getName(), t->t));
        m.forEach((k, v) -> System.out.printf("k:%s, v:%s\n", k, v));
    }



}
