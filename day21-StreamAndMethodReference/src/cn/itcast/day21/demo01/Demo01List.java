package cn.itcast.day21.demo01;

import java.util.ArrayList;
import java.util.List;

/*
* 使用传统的方式，遍历集合，对集合中的数据进行过滤
* */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合，存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("源氏");
        list.add("半藏");
        list.add("张三");
        list.add("张国立");

        //对list集合中的元素进行过滤，只要以“张”开头的元素，存储到一个新的集合当中
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                listA.add(s);
            }
        }

        //对listA集合进行过滤，只要姓名长度为3的人，存储到一个新的集合中
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length() == 3){
                listB.add(s);
            }
        }

        //遍历listB集合
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
