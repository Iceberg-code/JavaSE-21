package cn.itcast.day21.demo06;

/*
* 通过类名引用静态成员方法
* 使用前提：1、类已经存在；2、静态成员方法也已经存在。就可以通过类名直接引用静态成员方法
* */
public class Demo01StaticMethodReference {
    //定义一个方法，方法的参数传递要计算绝对值的整数和Calculable接口
    public static int method(int number, Calculable c){
        return c.calAbs(number);
    }

    public static void main(String[] args) {
        //调用method方法，传递计算绝对值的整数，和Lambda表达式
        int num1 = method(-10, (n) -> {
            return Math.abs(n);     //abs()方法是Math的一个静态方法，所以可以通过类名来直接使用
        });
        System.out.println(num1);

        /*
        * 使用方法引用优化Lambda表达式
        *   1、Math类是存在的
        *   2、abs计算绝对值的静态方法也是已经存在的
        * 所以我们可以直接通过类名引用静态方法
        * */
        int num2 = method(-11, Math::abs);
        System.out.println(num2);
    }
}
