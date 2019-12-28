package calendarsystem;
import javax.swing.*;
import java.awt.*;
public class UI {
    public static void main(String[] args){
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for(int i = 0;i < fonts.length;i++){
            System.out.println(fonts[i]);
        }
        Font font = new Font("Quicksand", 0, 20);
        JFrame frame = new JFrame(){};
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.add(new JComponent(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setFont(font);
                g2.drawString("Hello, world!", 20, 20);
            }
        });
    }
}
