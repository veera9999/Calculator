
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

    private JFrame frame;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calci window = new calci();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public calci() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 470, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);


        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 18));
        textField.setBounds(10, 11, 440, 65);
        textField.setBackground(Color.DARK_GRAY);  // Set background color to dark grey
        textField.setForeground(Color.WHITE);  // Set text color to white
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnBackspace = new JButton("\uF0E7");
        btnBackspace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String backSpace=null;
                if(textField.getText().length()>0)
                {
                    StringBuilder str=new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length()-1);
                    backSpace=str.toString();
                    textField.setText(backSpace);
                }

            }
        });
        btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
        btnBackspace.setBounds(10, 87, 80, 54);
        btnBackspace.setBackground(Color.DARK_GRAY);
        btnBackspace.setForeground(Color.WHITE);
        frame.getContentPane().add(btnBackspace);

        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn7.getText();
                textField.setText(number);
            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn7.setBounds(10, 151, 80, 54);
        btn7.setBackground(Color.DARK_GRAY);
        btn7.setForeground(Color.WHITE);
        frame.getContentPane().add(btn7);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn4.getText();
                textField.setText(number);
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn4.setBounds(10, 215, 80, 54);
        btn4.setBackground(Color.DARK_GRAY);
        btn4.setForeground(Color.WHITE);
        frame.getContentPane().add(btn4);

        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn1.getText();
                textField.setText(number);

            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn1.setBounds(10, 279, 80, 54);
        btn1.setBackground(Color.DARK_GRAY);
        btn1.setForeground(Color.WHITE);
        frame.getContentPane().add(btn1);

        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn0.getText();
                textField.setText(number);
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn0.setBounds(10, 343, 80, 54);
        btn0.setBackground(Color.DARK_GRAY);
        btn0.setForeground(Color.WHITE);
        frame.getContentPane().add(btn0);

        JButton btnClear = new JButton("DEL");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textField.setText(null);
            }
        });
        btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnClear.setBounds(100, 87, 80, 54);
        btnClear.setBackground(Color.DARK_GRAY);
        btnClear.setForeground(Color.WHITE);
        frame.getContentPane().add(btnClear);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn8.getText();
                textField.setText(number);
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn8.setBounds(100, 151, 80, 54);
        btn8.setBackground(Color.DARK_GRAY);
        btn8.setForeground(Color.WHITE);
        frame.getContentPane().add(btn8);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn5.getText();
                textField.setText(number);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn5.setBounds(100, 215, 80, 54);
        btn5.setBackground(Color.DARK_GRAY);
        btn5.setForeground(Color.WHITE);
        frame.getContentPane().add(btn5);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn2.getText();
                textField.setText(number);
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn2.setBounds(100, 279, 80, 54);
        btn2.setBackground(Color.DARK_GRAY);
        btn2.setForeground(Color.WHITE);
        frame.getContentPane().add(btn2);

        JButton btnDot = new JButton(".");
        btnDot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btnDot.getText();
                textField.setText(number);
            }
        });
        btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnDot.setBounds(100, 343, 80, 54);
        btnDot.setBackground(Color.DARK_GRAY);
        btnDot.setForeground(Color.WHITE);
        frame.getContentPane().add(btnDot);

        JButton btnEqual = new JButton("=");
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String answer;
                second=Double.parseDouble(textField.getText());
                if(operation=="+")
                {
                    result=first+second;
                    answer=String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if(operation=="-")
                {
                    result=first-second;
                    answer=String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if(operation=="*")
                {
                    result=first*second;
                    answer=String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if(operation=="/")
                {
                    result=first/second;
                    answer=String.format("%.2f", result);
                    textField.setText(answer);
                }
                else if(operation=="%")
                {
                    result=first%second;
                    answer=String.format("%.2f", result);
                    textField.setText(answer);
                }
            }
        });
        btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnEqual.setBounds(190, 343, 80, 54);
        btnEqual.setBackground(Color.DARK_GRAY);
        btnEqual.setForeground(Color.WHITE);
        frame.getContentPane().add(btnEqual);

        JButton btnPercent = new JButton("%");
        btnPercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="%";
            }
        });
        btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnPercent.setBounds(280, 343, 80, 54);
        btnPercent.setBackground(Color.DARK_GRAY);
        btnPercent.setForeground(Color.WHITE);
        frame.getContentPane().add(btnPercent);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn3.getText();
                textField.setText(number);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn3.setBounds(190, 279, 80, 54);
        btn3.setBackground(Color.DARK_GRAY);
        btn3.setForeground(Color.WHITE);
        frame.getContentPane().add(btn3);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn6.getText();
                textField.setText(number);
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn6.setBounds(190, 215, 80, 54);
        btn6.setBackground(Color.DARK_GRAY);
        btn6.setForeground(Color.WHITE);
        frame.getContentPane().add(btn6);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn9.getText();
                textField.setText(number);
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn9.setBounds(190, 151, 80, 54);
        btn9.setBackground(Color.DARK_GRAY);
        btn9.setForeground(Color.WHITE);
        frame.getContentPane().add(btn9);

        JButton btn00 = new JButton("00");
        btn00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String number=textField.getText()+btn00.getText();
                textField.setText(number);
            }
        });
        btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
        btn00.setBounds(190, 87, 80, 54);
        btn00.setBackground(Color.DARK_GRAY);
        btn00.setForeground(Color.WHITE);
        frame.getContentPane().add(btn00);

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="+";
            }
        });
        btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnPlus.setBounds(280, 87, 80, 54);
        btnPlus.setBackground(Color.DARK_GRAY);
        btnPlus.setForeground(Color.WHITE);
        frame.getContentPane().add(btnPlus);

        JButton btnSub = new JButton("-");
        btnSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="-";
            }
        });
        btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnSub.setBounds(280, 151, 80, 54);
        btnSub.setBackground(Color.DARK_GRAY);
        btnSub.setForeground(Color.WHITE);
        frame.getContentPane().add(btnSub);

        JButton btnMul = new JButton("*");
        btnMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="*";
            }
        });
        btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnMul.setBounds(280, 215, 80, 54);
        btnMul.setBackground(Color.DARK_GRAY);
        btnMul.setForeground(Color.WHITE);
        frame.getContentPane().add(btnMul);

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textField.getText());
                textField.setText("");
                operation="/";
            }
        });
        btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnDivide.setBounds(280, 279, 80, 54);
        btnDivide.setBackground(Color.DARK_GRAY);
        btnDivide.setForeground(Color.WHITE);
        frame.getContentPane().add(btnDivide);

        JButton btnPower = new JButton("^");
        btnPower.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "^";
            }
        });
        btnPower.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnPower.setBounds(370, 87, 80, 54);
        //btnPower.setBackground(TURQUOISE_BLUE);
        btnPower.setBackground(Color.DARK_GRAY);
        btnPower.setForeground(Color.WHITE);
        frame.getContentPane().add(btnPower);

        JButton btnSqrt = new JButton("\u221A");
        btnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textField.getText());
                result = Math.sqrt(first);
                textField.setText(String.format("%.2f", result));
            }
        });
        btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnSqrt.setBounds(370, 151, 80, 54);
        //btnSqrt.setBackground(TURQUOISE_BLUE);
        btnSqrt.setBackground(Color.DARK_GRAY);
        btnSqrt.setForeground(Color.WHITE);
        frame.getContentPane().add(btnSqrt);

        JButton btnReciprocal = new JButton("1/x");
        btnReciprocal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textField.getText());
                if (first != 0) {
                    result = 1 / first;
                    textField.setText(String.format("%.2f", result));
                } else {
                    textField.setText("Error");
                }
            }
        });
        btnReciprocal.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnReciprocal.setBounds(370, 215, 80, 54);
        //btnReciprocal.setBackground(TURQUOISE_BLUE);
        btnReciprocal.setBackground(Color.DARK_GRAY);
        btnReciprocal.setForeground(Color.WHITE);
        frame.getContentPane().add(btnReciprocal);

        JButton btnLog = new JButton("log");
        btnLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textField.getText());
                if (first > 0) {
                    result = Math.log10(first);
                    textField.setText(String.format("%.2f", result));
                } else {
                    textField.setText("Error");
                }
            }
        });
        btnLog.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnLog.setBounds(370, 279, 80, 54);
        //btnLog.setBackground(TURQUOISE_BLUE);
        btnLog.setBackground(Color.DARK_GRAY);
        btnLog.setForeground(Color.WHITE);
        frame.getContentPane().add(btnLog);

        JButton btnFactorial = new JButton("!");
        btnFactorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first = Double.parseDouble(textField.getText());
                if (first >= 0 && first == (int) first) {
                    result = factorial((int) first);
                    textField.setText(String.format("%.0f", result));
                } else {
                    textField.setText("Error");
                }
            }

            private double factorial(int n) {
                if (n <= 1) {
                    return 1;
                } else {
                    return n * factorial(n - 1);
                }
            }
        });
        btnFactorial.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnFactorial.setBounds(370, 343, 80, 54);
        //btnFactorial.setBackground(TURQUOISE_BLUE);
        btnFactorial.setBackground(Color.DARK_GRAY);
        btnFactorial.setForeground(Color.WHITE);
        frame.getContentPane().add(btnFactorial);

    }
}

