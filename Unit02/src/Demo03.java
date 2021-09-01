import cn.tedu.util.App;
import java.awt.Graphics2D;
import java.awt.Color;

/*程序说明：
 * 1。启动一个GUI界面；
 * 2。使用画笔进行图形绘制；
 * 3。定义绘制图形颜色；
 * 4.使用变量定义绘制图形位置；
 * */
public class Demo03 extends App {
    int x = 0;
    int y = 0;
    int x2 = 0;
    int y2 = 0;
    int x3 = 0;
    int y3 = 0;
    public void painting(Graphics2D g) {
        //设置画笔颜色
        x = x + 1;
        y = y + 3;
        g.setColor(new Color(255, 0 ,0));
        g.fillOval(x, y, 50, 50);
        x2 = x2 + 2;
        g.setColor(new Color(0, 255 ,0));
        g.fillOval(x2, y2, 100, 100);
        y3 = y3 + 3;
        g.setColor(new Color(0, 0 ,255));
        g.fillOval(x3, y3, 80, 80);
    }

    // 启动GUI界面程序
    public static void main(String[] args) {
        Demo03 demo = new Demo03();
        demo.start();
    }
}
