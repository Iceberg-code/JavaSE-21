package cn.itcast.day21.demo02;

import java.util.stream.Stream;

/*
* Stream流中的常用方法：forEach (注意与增强for不同)
* void forEach(Consumer<? super T> action);
* 该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理
* Consumer接口是一个消费型的函数式接口，可以传递Lambda表达式，消费数据
*
* 简单记：
*       forEach方法，用来遍历流中的数据
*       是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法
* */
public class Demo02Stream_forEach {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("源氏", "半藏", "麦克雷", "奥丽莎", "路霸");

/*
        //使用Stream流中的方法forEach方法对Stream流中的数据进行遍历，Lambda表达式
        stream.forEach((String name) -> {
            System.out.println(name);
        });
*/

        //使用Stream流中的方法forEach方法对Stream流中的数据进行遍历    (上面的forEach与这个优化Lambda的forEach只能存在一个，否则会报错)
        //优化Lambda表达式
        stream.forEach(name -> System.out.println(name));
    }
}
