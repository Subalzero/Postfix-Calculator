
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.EmptyStackException;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
	//variable declaration
    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnDec;
    private JButton btnAdd;
    private JButton btnSubt;
    private JButton btnMult;
    private JButton btnDiv;
    private JButton btnEquals;
    private JButton btnClrScr;
    private JButton btnBckSpc;
    private JButton btnExponent;
    private JButton btnParenL;
    private JButton btnParenR;
    private JButton btnBrackL;
    private JButton btnBrackR;
    private JButton btnCurlL;
    private JButton btnCurlR;
    private JButton btnSpace;
    private JToggleButton btnMode;
    private JTextField textField;
    private JLabel lblStatus;
    private JLabel lblMode;
    
    private String input;
    //end of variable declaration
    public Calculator() {
        initComponents();
    }
    
    private void initComponents() {
        btn0 = new JButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btnDec = new JButton();
        btnAdd = new JButton();
        btnSubt = new JButton();
        btnMult = new JButton();
        btnDiv = new JButton();
        btnClrScr = new JButton();
        btnEquals = new JButton();
        btnExponent = new JButton();
        btnParenL = new JButton();
        btnParenR = new JButton();
        btnBrackL = new JButton();
        btnBrackR = new JButton();
        btnCurlL = new JButton();
        btnCurlR = new JButton();
        btnBckSpc = new JButton();
        btnSpace = new JButton();
        btnMode = new JToggleButton();
        textField = new JTextField();
        lblStatus = new JLabel();
        lblMode = new JLabel();
        
        input = "";
        
        setSize(600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Java Calculator");
        setResizable(false);
        getContentPane().setLayout(null);
        
        textField.setBounds(20, 20, 560, 58);
        textField.setFont(new Font("Arial", 0, 50));
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField);
        
        lblStatus.setBounds(20, 90, 560, 20);
        lblStatus.setText("Mode: Infix");
        lblStatus.setFont(new Font("Arial", 0, 18));
        lblStatus.setHorizontalAlignment(JLabel.CENTER);
        add(lblStatus);
        
        btn9.setBounds(240, 150, 90, 90);
        btn9.setText("9");
        btn9.setFont(new Font("Arial", 0, 48));
        add(btn9);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        
        btn8.setBounds(130, 150, 90, 90);
        btn8.setText("8");
        btn8.setFont(new Font("Arial", 0, 48));
        add(btn8);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        
        btn7.setBounds(20, 150, 90, 90);
        btn7.setText("7");
        btn7.setFont(new Font("Arial", 0, 48));
        add(btn7);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        
        btn6.setBounds(240, 260, 90, 90);
        btn6.setText("6");
        btn6.setFont(new Font("Arial", 0, 48));
        add(btn6);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        
        btn5.setBounds(130, 260, 90, 90);
        btn5.setText("5");
        btn5.setFont(new Font("Arial", 0, 48));
        add(btn5);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        
        btn4.setBounds(20, 260, 90, 90);
        btn4.setText("4");
        btn4.setFont(new Font("Arial", 0, 48));
        add(btn4);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        
        btn3.setBounds(240, 370, 90, 90);
        btn3.setText("3");
        btn3.setFont(new Font("Arial", 0, 48));
        add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        
        btn2.setBounds(130, 370, 90, 90);
        btn2.setText("2");
        btn2.setFont(new Font("Arial", 0, 48));
        add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        
        btn1.setBounds(20, 370, 90, 90);
        btn1.setText("1");
        btn1.setFont(new Font("Arial", 0, 48));
        add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        
        btn0.setBounds(20, 480, 90, 90);
        btn0.setText("0");
        btn0.setFont(new Font("Arial", 0, 48));
        add(btn0);
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        
        btnDec.setBounds(130, 480, 90, 90);
        btnDec.setText(".");
        btnDec.setFont(new Font("Arial", 0, 48));
        add(btnDec);
        btnDec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDecActionPerformed(evt);
            }
        });
        
        btnClrScr.setBounds(240, 480, 90, 90);
        btnClrScr.setText("CE");
        btnClrScr.setFont(new Font("Arial", 0, 40));
        add(btnClrScr);
        btnClrScr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnClrScrActionPerformed(evt);
            }
        });
        
        btnEquals.setBounds(20, 590, 90, 90);
        btnEquals.setText("=");
        btnEquals.setFont(new Font("Arial", 0, 48));
        add(btnEquals);
        btnEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        
        btnBckSpc.setBounds(240, 590, 90,90);
        btnBckSpc.setText("C");
        btnBckSpc.setFont(new Font("Arial", 0, 40));
        add(btnBckSpc);
        btnBckSpc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBckSpcActionPerformed(evt);
            }
        });
        
        btnDiv.setBounds(370, 150, 200, 90);
        btnDiv.setText("/");
        btnDiv.setFont(new Font("Arial", 0, 48));
        add(btnDiv);
        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        
        btnMult.setBounds(370, 260, 200, 90);
        btnMult.setText("*");
        btnMult.setFont(new Font("Arial", 0, 48));
        add(btnMult);
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMultActionPerformed(evt);
            }
        });
        
        btnSubt.setBounds(370, 370, 200, 90);
        btnSubt.setText("-");
        btnSubt.setFont(new Font("Arial", 0, 48));
        add(btnSubt);
        btnSubt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSubtActionPerformed(evt);
            }
        });
        
        btnAdd.setBounds(370, 480, 200, 90);
        btnAdd.setText("+");
        btnAdd.setFont(new Font("Arial", 0, 48));
        add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        
        btnExponent.setBounds(130, 590, 90, 90);
        btnExponent.setText("^");
        btnExponent.setFont(new Font("Arial", 0, 48));
        add(btnExponent);
        btnExponent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnExponentActionPerformed(evt);
            }
        });
        
        btnParenL.setBounds(370, 590, 90, 90);
        btnParenL.setText("(");
        btnParenL.setFont(new Font("Arial", 0, 48));
        add(btnParenL);
        btnParenL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnParenLActionPerformed(evt);
            }
        });
        
        btnParenR.setBounds(480, 590, 90, 90);
        btnParenR.setText(")");
        btnParenR.setFont(new Font("Arial", 0, 48));
        add(btnParenR);
        btnParenR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnParenRActionPerformed(evt);
            }
        });
        
        btnBrackL.setBounds(80, 700, 90, 90);
        btnBrackL.setText("[");
        btnBrackL.setFont(new Font("Arial", 0, 48));
        add(btnBrackL);
        btnBrackL.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnBrackLActionPerformed(evt);
        	}
        });
        
        btnBrackR.setBounds(200, 700, 90, 90);
        btnBrackR.setText("]");
        btnBrackR.setFont(new Font("Arial", 0, 48));
        add(btnBrackR);
        btnBrackR.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnBrackRActionPerformed(evt);
        	}
        });
        
        btnCurlL.setBounds(320, 700, 90, 90);
        btnCurlL.setText("{");
        btnCurlL.setFont(new Font("Arial", 0, 48));
        add(btnCurlL);
        btnCurlL.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnCurlLActionPerformed(evt);
        	}
        });
        
        btnCurlR.setBounds(440, 700, 90, 90);
        btnCurlR.setText("}");
        btnCurlR.setFont(new Font("Arial", 0, 48));
        add(btnCurlR);
        btnCurlR.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnCurlRActionPerformed(evt);
        	}
        });
        
        btnSpace.setBounds(370, 590, 200, 90);
        btnSpace.setText("Space");
        btnSpace.setFont(new Font("Arial", 0, 40));
        btnSpace.setVisible(false);
        add(btnSpace);
        btnSpace.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnSpaceActionPerformed(evt);
        	}
        });
        
        btnMode.setBounds(460, 115, 115, 25);
        btnMode.setText("Infix");
        btnMode.setFont(new Font("Arial", 0, 18));
        add(btnMode);
        btnMode.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnModeActionPerformed(evt);
        	}
        });
        
        lblMode.setBounds(370, 117, 50, 18);
        lblMode.setText("Mode:");
        lblMode.setFont(new Font("Arial", 0, 18));
        add(lblMode);
    }
    
    private void btn9ActionPerformed(ActionEvent evt) {
        textField.setText(input += "9");
    }
    
    private void btn8ActionPerformed(ActionEvent evt) {
        textField.setText(input += "8");
    }
    
    private void btn7ActionPerformed(ActionEvent evt) {
        textField.setText(input += "7");
    }
    
    private void btn6ActionPerformed(ActionEvent evt) {
        textField.setText(input += "6");
    }
    
    private void btn5ActionPerformed(ActionEvent evt) {
        textField.setText(input += "5");
    }
    
    private void btn4ActionPerformed(ActionEvent evt) {
        textField.setText(input += "4");
    }
    
    private void btn3ActionPerformed(ActionEvent evt) {
        textField.setText(input += "3");
    }
    
    private void btn2ActionPerformed(ActionEvent evt) {
        textField.setText(input += "2");
    }
    
    private void btn1ActionPerformed(ActionEvent evt) {
        textField.setText(input += "1");
    }
    
    private void btn0ActionPerformed(ActionEvent evt) {
        textField.setText(input += "0");
    }
    
    private void btnDecActionPerformed(ActionEvent evt) {
        textField.setText(input += ".");
    }
    
    private void btnExponentActionPerformed(ActionEvent evt) {
        textField.setText(input += "^");
    }
    
    private void btnBckSpcActionPerformed(ActionEvent evt) {
        String temp = input;
        input = "";
        for(int i = 0; i < temp.length() - 1; i++) {
            input += temp.charAt(i);
        }
        textField.setText(input);
    }
    
    private void btnClrScrActionPerformed(ActionEvent evt) {
        input = "";
        textField.setText(input);
        lblStatus.setText("");
    }
    
    private void btnEqualsActionPerformed(ActionEvent evt) {
        ParenCount a = new ParenCount();
        Postfix b = new Postfix();
        String postfix;
        try {
        	if(btnMode.isSelected()) {
            	textField.setText(Double.toString(b.solve(input)));
                input = "";
            }
            else {
            	if(a.checkStr(input)!= 0) {
                    textField.setText("Syntax Error");
                    input = "";
                    return;
                }
                postfix = b.translate(input);
                textField.setText(Double.toString(b.solve(postfix)));
                lblStatus.setText("Postfix: " + postfix);
                input = "";
            }     
        }
        catch(EmptyStackException e) {
        	textField.setText("Syntax Error");
        	lblStatus.setText("Error");
        }
        catch(NumberFormatException e) {
        	textField.setText("Syntax Error");
        	lblStatus.setText("Error");
        }
    }
    
    private void btnDivActionPerformed(ActionEvent evt) {
        textField.setText(input += "/");
    }
    
    private void btnMultActionPerformed(ActionEvent evt) {
        textField.setText(input += "*");
    }
    
    private void btnSubtActionPerformed(ActionEvent evt) {
        textField.setText(input += "-");
    }
    
    private void btnAddActionPerformed(ActionEvent evt) {
        textField.setText(input += "+");
    }
    
    private void btnParenLActionPerformed(ActionEvent evt) {
        textField.setText(input += "(");
    }
    
    private void btnParenRActionPerformed(ActionEvent evt) {
        textField.setText(input += ")");
    }
    
    private void btnModeActionPerformed(ActionEvent evt) {
    	if(btnMode.isSelected()) {
    		btnSpace.setVisible(true);
    		lblStatus.setText("Mode: Postfix");
    		btnMode.setText("Postfix");
    		btnParenL.setVisible(false);
    		btnParenR.setVisible(false);
    		btnBrackL.setVisible(false);
    		btnBrackR.setVisible(false);
    		btnCurlL.setVisible(false);
    		btnCurlR.setVisible(false);
    	}
    	else {
    		btnSpace.setVisible(false);
    		lblStatus.setText("Mode: Infix");
    		btnMode.setText("Infix");
    		btnParenL.setVisible(true);
    		btnParenR.setVisible(true);
    		btnBrackL.setVisible(true);
    		btnBrackR.setVisible(true);
    		btnCurlL.setVisible(true);
    		btnCurlR.setVisible(true);
    	}
    }
    
    private void btnSpaceActionPerformed(ActionEvent evt) {
    	textField.setText(input += " ");
    }
    
    private void btnBrackLActionPerformed(ActionEvent evt) {
    	textField.setText(input += "[");
    }
    
    private void btnBrackRActionPerformed(ActionEvent evt) {
    	textField.setText(input += "]");
    }
    
    private void btnCurlLActionPerformed(ActionEvent evt) {
    	textField.setText(input += "{");
    }
    
    private void btnCurlRActionPerformed(ActionEvent evt) {
    	textField.setText(input += "}");
    }
}
