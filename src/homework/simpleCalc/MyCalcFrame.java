package homework.simpleCalc;

import javax.swing.*;
import java.awt.*;
public class MyCalcFrame extends JFrame {

    public MyCalcFrame(JPanel calcPanel) {
        frameMaking(calcPanel);
    }

    public void frameMaking(JPanel calcPanel){
        setTitle("Calculator");
        setSize(370, 370);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(calcPanel);
        setPreferredSize(new Dimension(500, 700));
        setLocationRelativeTo(null);
        setVisible(true);
    }

}