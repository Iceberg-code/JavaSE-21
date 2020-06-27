package cn.itcast.day21.demo06;
/*
* 定义一个计算的函数式接口：Calculable
* */
@FunctionalInterface
public interface Calculable {
    //定义一个抽象方法，传递一个整数，对整数进行绝对值计算并返回
    int calAbs(int number);
}
