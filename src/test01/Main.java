package test01;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main extends JFrame{

    private Image background=new ImageIcon(Main.class.getResource("../image/background.png")).getImage();
    /*생성자*/
    public Main() {

    }
    public void homeframe() {
        setTitle("WitchCraft");//타이틀
        setBounds(400,200, 800,550);
        setResizable(false);//창 크기 변경 금지
        setLocationRelativeTo(null);//창 가운데에 나오도록
        setLayout(null);//레이아웃을 내맘대로 설정
        setVisible(true);//창이 보이도록
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
    }
    public void paint(Graphics g) {//그리는 함수
        g.drawImage(background, 0, 0, null);//background를 그려줌
    }
    public void button() {
    	
    }
    public static void main(String[] args){
        new Main();
    }
}