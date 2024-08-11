import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class  picpuzzle2 extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, sample, starB;
    Icon star;
    Icon ic0 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\9.jpg");
    Icon ic10 = new ImageIcon("");
    Icon ic20 = new ImageIcon("");
    Icon samicon1 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\epsihazee207.jpg");
    Icon samicon2 = new ImageIcon("");
    Icon samicon3 = new ImageIcon("");
    
    Icon ic1 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\1.jpg");
    Icon ic2 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\2.jpg");
    Icon ic3 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\3.jpg");
    Icon ic4 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\4.jpg");
    Icon ic5 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\5.jpg");
    Icon ic6 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\6.jpg");
    Icon ic7 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\7.jpg");
    Icon ic8 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\8.jpg");
    Icon ic9 = new ImageIcon("C:\\Users\\epsi5\\OneDrive\\Desktop\\Java Games\\images\\9.jpg");
    
    Icon ic11 = new ImageIcon("");
    Icon ic12 = new ImageIcon("");
    Icon ic13 = new ImageIcon("");
    Icon ic14 = new ImageIcon("");
    Icon ic15 = new ImageIcon("");
    Icon ic16 = new ImageIcon("");
    Icon ic17 = new ImageIcon("");
    Icon ic19 = new ImageIcon("");
    
    Icon ic21 = new ImageIcon("");
    Icon ic22 = new ImageIcon("");
    Icon ic23 = new ImageIcon("");
    Icon ic24 = new ImageIcon("");
    Icon ic25 = new ImageIcon("");
    Icon ic26 = new ImageIcon("");
    Icon ic27 = new ImageIcon("");
    Icon ic28 = new ImageIcon("");
    Icon ic29 = new ImageIcon("");

    picpuzzle2() {
        super("pic puzzle");
        
        // Initialize buttons with icons
        b1 = new JButton(ic1);
        b2 = new JButton(ic2);
        b3 = new JButton(ic3);
        b4 = new JButton(ic4);
        b5 = new JButton(ic5);
        b6 = new JButton(ic6);
        b7 = new JButton(ic7);
        b8 = new JButton(ic8);
        b9 = new JButton(ic9);
        sample = new JButton(samicon1);
        
        starB = new JButton(ic0);
        star = b9.getIcon();

        // Set Layout
        setLayout(null);

        // Set button bounds
        b1.setBounds(10, 80, 100, 100);
        b2.setBounds(110, 80, 100, 100);
        b3.setBounds(210, 80, 100, 100);
        b4.setBounds(10, 180, 100, 100);
        b5.setBounds(110, 180, 100, 100);
        b6.setBounds(210, 180, 100, 100);
        b7.setBounds(10, 280, 100, 100);
        b8.setBounds(110, 280, 100, 100);
        b9.setBounds(210, 280, 100, 100);
        sample.setBounds(380, 100, 200, 200);

        // Add buttons to frame
        add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8); add(b9); add(sample);

        // Add labels
        JLabel l1 = new JLabel("Sample:");
        l1.setBounds(330, 200, 70, 20);
        JLabel l2 = new JLabel("NOTE: icon has power to swap with neighbour icon=");
        l2.setBounds(5, 15, 500, 20);
        JLabel l3 = new JLabel("Click sample picture to next puzzle");
        l3.setBounds(380, 320, 200, 20);
        l3.setForeground(Color.red);

        // Add labels and star button to frame
        add(l1); add(l2); add(starB); add(l3);

        // Add action listeners
        b1.addActionListener(this); b2.addActionListener(this);
        b3.addActionListener(this); b4.addActionListener(this);
        b5.addActionListener(this); b6.addActionListener(this);
        b7.addActionListener(this); b8.addActionListener(this);
        b9.addActionListener(this); sample.addActionListener(this);

        // Set frame properties
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button == sample) {
            switchSampleIcon();
        } else {
            swapIcons(button);
        }
    }

    private void swapIcons(JButton button) {
        Icon s1 = button.getIcon();
        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (JButton b : buttons) {
            if (b.getIcon() == star) {
                b.setIcon(s1);
                button.setIcon(star);
                break;
            }
        }
    }

    private void switchSampleIcon() {
        Icon s1 = sample.getIcon();
        if (s1 == samicon3) {
            sample.setIcon(samicon1);
            setIcons(new Icon[]{ic1, ic2, ic3, ic4, ic5, ic6, ic7, ic8, ic9}, ic0);
        } else if (s1 == samicon1) {
            sample.setIcon(samicon2);
            setIcons(new Icon[]{ic11, ic12, ic13, ic14, ic15, ic16, ic17, ic18, ic19}, ic10);
        } else {
            sample.setIcon(samicon3);
            setIcons(new Icon[]{ic21, ic22, ic23, ic24, ic25, ic26, ic27, ic28, ic29}, ic20);
        }
    }

    private void setIcons(Icon[] icons, Icon starIcon) {
        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setIcon(icons[i]);
        }
        star = icons[icons.length - 1];
        starB.setIcon(starIcon);
    }

    public static void main(String args[]) {
        new picpuzzle2();
    }
}