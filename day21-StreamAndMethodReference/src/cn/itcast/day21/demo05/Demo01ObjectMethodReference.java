package cn.itcast.day21.demo05;
/*
* 通过对象名引用成员方法
* 使用前提是：1、对象名是已经存在的；2、成员方法也是已经存在的
* 就可以使用对象名来引用成员方法
* */
public class Demo01ObjectMethodReference {
    //定义一个方法，方法的参数传递一个Printable接口
    public static void printString(Printable p){
        p.print("Hello");
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数Printable是一个函数式接口，所以可以传递Lambda表达式
        printString((s) -> {
            //创建MethodRefObject对象
            MethodRefObject obj = new MethodRefObject();

            //调用MethodRefObject对象中的成员方法printUpperCaseString，把字符串按照大写输出
            obj.printUpperCaseString(s);
        });

        /*
         * 使用方法引用，来优化Lambda
         *  1、对象是已经存在的：MethodRefObject
         *  2、成员方法也是已经存在的：printUpperCaseString
         * 所以我们可以使用对象名引用成员方法，达到优化Lambda的目的
         * */
        //首先创建MethodRefObject对象
        MethodRefObject obj = new MethodRefObject();
        printString(obj::printUpperCaseString);
    }

}
