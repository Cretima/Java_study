import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class HouseTest extends JFrame{
    private boolean isOn = false;
    
    int x1[] = {70, 70, 210, 350, 350};
    int y1[] = {340, 220, 100, 220, 340};
    
    int x2[] = {180, 240, 240, 180};
    int y2[] = {250, 250, 340, 340};
    
    public HouseTest() {
        setSize(400,430);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("House 예제");
        
        Container p = getContentPane();
        p.setLayout(new FlowLayout());
        JButton button = new JButton("열기");
        button.addActionListener(new BtnListener());
        p.add(button);
    }
    

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.gray);    
        g.fillPolygon(x1,y1,5);
                    
        if(isOn)
            g.setColor(Color.yellow);
        else
            g.setColor(Color.gray);                
        g.fillPolygon(x2,y2,4);
        
        g.setColor(Color.black);
        g.drawPolygon(x1,y1,5);
        g.drawPolygon(x2,y2,4);
    }

    
    private class BtnListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            isOn = !isOn;
            JButton btn = (JButton) e.getSource();
            btn.setText(isOn ? "닫기" : "열기");
            repaint();
        }
    }
    public static void main(String[] args) {
        (new HouseTest()).setVisible(true);
    }

}
