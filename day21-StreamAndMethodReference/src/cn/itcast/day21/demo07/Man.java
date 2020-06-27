package cn.itcast.day21.demo07;
/*
* 定义子类
* 通过super引用成员方法
* 使用前提：1、存在继承关系，Lambda存在super调用时
*          2、父类的成员方法也是已经存在的
* */
public class Man extends Human {
    //子类重写父类sayHello方法
    @Override
    public void sayHello() {
        System.out.println("Hello,我是Man");
    }

    //定义一个方法，参数传递Greetable接口
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        //调用method方法，方法的参数Greetable是一个函数式接口，所以可以使用Lambda表达式
        method(() -> {
            //创建父类Human对象
            Human h = new Human();
            //调用父类的sayHello方法
            h.sayHello();
        });

        //因为有子父类关系，所以存在一个关键字super，代表父类，所以我们可以直接使用super调用父类的成员方法
        method(() -> {
            super.sayHello();
        });

        /*
        * 使用super引用父类的成员方法
        *   1、super是已经存在的
        *   2、父类的成员方法sayHello也是已经存在的
        * 所以我们可以直接使用super引用父类的成员方法
        * */
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
