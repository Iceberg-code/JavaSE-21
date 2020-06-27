package cn.itcast.day21.demo09;
/*
* 类的构造器(构造方法)引用
* 使用前提：
*       1、要引用的构造方法是已知的
*       2、创建对象已知，new
* */
public class Demo {
    //定义一个方法，参数传递姓名和PersonBuilder接口，方法中通过姓名创建Person对象
    public static void printName(String name, PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        //调用printName方法，方法的参数PersonBuilder接口是一个函数式接口，所以可以使用Lambda表达式
        printName("源氏", (String name) -> {
            return new Person(name);
        });

        /*
        * 使用方法引用优化Lambda表达式
        *   1、构造方法new Person(String name)是已知的
        *   2、创建对象已知 new
        * 就可以使用Person引用new创建对象
        * */
        printName("半藏", Person::new);//使用Person类的带参构造方法，通过传递姓名创建对象
    }
}
