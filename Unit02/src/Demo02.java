import cn.tedu.util.App;
import java.awt.Graphics2D;
import java.awt.Color;

/*
* 1。启动一个GUI界面；
* 2。使用画笔进行图形绘制；
* 3。定义绘制图形颜色；
* */
public class Demo02 extends App {  // 继承App类
    public void painting(Graphics2D g) {
        // 自定义绘制
        //设置画笔颜色
        g.setColor(new Color(255, 0 ,0));

        // g 表示当前窗口的画笔,利用这个画笔可以绘制任何图像。
        // g 提供了绘制字符串功能
        g.drawString("xiaochao", 100, 20);
        g.drawString("国庆", 100, 40);
        // g 提供绘制椭圆形
        g.fillOval(100, 80, 70, 70);
        g.setColor(new Color(0, 255 ,0));
        g.fillOval(140, 80, 70, 70);
        g.setColor(new Color(0, 0 ,255));
        g.fillOval(180, 80, 70, 70);
    }

    public static void main(String[] args) {
        Demo02 demo = new Demo02();
        // 启动GUI界面程序
        demo.start();
    }
}
