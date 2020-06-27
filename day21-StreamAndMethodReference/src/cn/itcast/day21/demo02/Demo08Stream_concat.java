package cn.itcast.day21.demo02;

import java.util.stream.Stream;

/*
* Stream流中的常用方法：concat，用于把流组合到一起
* 如果有2个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
* static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
* */
public class Demo08Stream_concat {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream1 = Stream.of("张三丰", "张无忌", "赵四", "王五", "张国立");
        //创建另一个Stream流
        String[] arr = {"源氏", "半藏", "麦克雷", "狂鼠", "路霸"};
        Stream<String> stream2 = Stream.of(arr);

        //把以上2个流组合为一个流
        Stream<String> stream3 = Stream.concat(stream1, stream2);

        //遍历stream3流
        stream3.forEach(name -> System.out.println(name));
    }
}
