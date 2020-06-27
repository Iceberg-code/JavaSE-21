package cn.itcast.day21.demo02;

import java.util.stream.Stream;

/*
* Stream流中的常用方法：filter，用于对Stream流中的数据进行过滤
* Stream<T> filter(Predicate <? super T> predicate);
* filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤
* Predicate方法中的抽象方法
*       boolean test(T t)
*       该方法将会产生一个boolean值结果，代表指定的条件是否满足。
*           如果结果为true，那么Stream流的filter方法将会留用元素；如果结果为false，那么filter方法将会舍弃元素。
 * */
public class Demo03Stream_filter {
    public static void main(String[] args) {
        //创建一个Stream流
        Stream<String> stream = Stream.of("张三丰", "张无忌", "狂鼠", "路霸", "张国立");

        //对Stream流中的元素进行过滤，只要姓“张”的人名。
        //filter方法返回一个新的流，再用一个新的Stream流来接收过滤后的流(和原来的流不是同一个)
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });

        //遍历stream1流
        stream1.forEach(name -> System.out.println(name));

        /*
        * Stream流属于管道流，只能被消费(使用)一次
        * 第一个Stream流调用完毕方法，数据就会流转到下一个Stream流上
        * 而这时第一个Stream流已经使用完毕，就会关闭了
        * 所以第一个Stream流就不能再调用方法了
        * */
        //遍历stream流 - IllegalStateException: stream has already been operated upon or closed
        //stream.forEach(name -> System.out.println(name));
    }
}
