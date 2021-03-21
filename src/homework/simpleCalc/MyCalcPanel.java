package homework.simpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalcPanel extends JPanel implements ActionListener {
    private JTextField textFieldNum1, textFieldNum2, textFieldMathOperation, textAreaResult;
    private JLabel labelNumber1, labelNumber2, labelMathOperation, labelResult;
    private MyCalculator calc;

    public MyCalcPanel(MyCalculator calc){
        constructAll();
        this.calc = calc;
    }
    public void constructAll() {
        setLayout(null);
        constructLabels();
        constructTextFields();
        constructButton();
        constructFieldResult();


    }
    private void constructLabels() {
        labelNumber1 = new JLabel("First number");
        labelNumber1.setBounds(30, 20, 100, 40);
        add(labelNumber1);
        labelNumber2 = new JLabel("Second number");
        labelNumber2.setBounds(30, 80, 100, 40);
        add(labelNumber2);
        labelMathOperation = new JLabel("Math operation");
        labelMathOperation.setBounds(30, 140, 100, 40);
        add(labelMathOperation);
        labelResult = new JLabel("Result");
        labelResult.setBounds(85, 265, 100, 40);
        add(labelResult);
    }
    private void constructTextFields() {
        textFieldNum1 = new JTextField();
        textFieldNum1.setBounds(130, 20, 190, 40);
        add(textFieldNum1);
        textFieldNum2 = new JTextField();
        textFieldNum2.setBounds(130, 80, 190, 40);
        add(textFieldNum2);
        textFieldMathOperation = new JTextField();
        textFieldMathOperation.setBounds(130, 140, 190, 40);
        add(textFieldMathOperation);
    }
    public void constructButton(){
        JButton button = new JButton("=");
        button.setBounds(25, 200, 300, 50);
        button.addActionListener(new MyActionListener());
        add(button);

    }
    public void constructFieldResult(){
        textAreaResult = new JTextField();
        textAreaResult.setBounds(130, 260, 190, 50);
        textAreaResult.setEditable(false);
        add(textAreaResult);
    }
    public String getNumber1() {
        return textFieldNum1.getText();
    }


    public String getNumber2() {
        return textFieldNum2.getText();
    }

    public String getMathOperation() {
        return textFieldMathOperation.getText();
    }

    public JTextField getTextFieldResult() {
        return textAreaResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            calc.getResult();
        }
    }
}