public class variable {
    public static void main(String[] args ) {
        int a;     //声明变量
        a = 100; // 初始化变量的值(赋值)
        int b = 50;  //声明变量并初始化变量的值(赋值)
        b = 60;  //对b变量对值进行修改
        int c = a + b; // 定义变量 c  结果为a+b的值
        System.out.println("变量a的值为:"+a);  //打印出变量a的值
        System.out.println("变量b的值为:"+b);  //打印出变量b的值
        System.out.println("变量c的值为:"+c);  //打印出变量c的值
        // 增加变量的值：
        int i = 5;
        i = i + 1; // 6
        System.out.println("i的值为:"+i);
        i = i++; //6 因为i++是先赋值后运算; 相当于i=6就结束了；
        System.out.println("i++后的值为:"+i);
        i = ++i; //7 因为++i是先运算后赋值；相当于i=i+1然后i=7;
        System.out.println("++i后的值为:"+i);
    }
}