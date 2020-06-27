package cn.itcast.day21.demo01;

import java.util.ArrayList;
import java.util.List;

/*
* 使用Stream流的方式，遍历集合，对集合中的数据进行过滤
* Stream流是JDK 1.8+之后出现的
* 关注的是做什么，而不是怎么做
* */
public class Demo02Stream {
    public static void main(String[] args) {
        //创建一个List集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("源氏");
        list.add("半藏");
        list.add("张三");
        list.add("张国立");

        //对list集合中的元素进行过滤，只要以“张”开头的元素，存储到一个新的集合当中
        //对listA集合进行过滤，只要姓名长度为3的人，存储到一个新的集合中
        //遍历listB集合
        list.stream().filter(name -> name.startsWith("张"))
                     .filter(name -> name.length() == 3)
                     .forEach(name -> System.out.println(name));
    }
}
