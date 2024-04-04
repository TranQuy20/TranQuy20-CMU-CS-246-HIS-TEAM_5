package com.FrontEnd;

import com.BackEnd.Function;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GradientPaint;
import java.awt.Graphics;

public class UIApp extends javax.swing.JPanel {

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
    private Color color1;
    private Color color2;

    public double num1;
    public double num2;

    char[] arrnum1; //
    char[] arrnum2; //

    public UIApp() {
        initComponents();
        setOpaque(false);
        color1 = Color.decode("#414345");
        color2 = Color.decode("#232526");
    }

    public static boolean isNumeric(String str) {
        // Sử dụng biểu thức chính quy để kiểm tra xem chuỗi có chứa chỉ chữ số hay không
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public void GetValueOnlyOne() {
        String error = "";
        boolean num1IsNumeric = isNumeric(First_Label.getText());

        num1 = Double.parseDouble(First_Label.getText());

        // Hai o da nhap khong chua so;
        if (!num1IsNumeric) {
            error += "[Error]: All cells do not contain numbers!";
            First_Label.setText("");

            resultText.setText("Error!");
            Report.setText(error);
        }
        else if (error.equals("")) {
            num1 = Double.parseDouble(First_Label.getText());
           
        }
    }

    public void GetValue() {
        String error = "";
        boolean num1IsNumeric = isNumeric(First_Label.getText());
        boolean num2IsNumeric = isNumeric(Second_Label.getText());
        num1 = Double.parseDouble(First_Label.getText());
        num2 = Double.parseDouble(Second_Label.getText());

        // Hai o da nhap khong chua so;
        if (!num1IsNumeric && !num2IsNumeric) {
            error += "[Error]: All cells do not contain numbers!";
            First_Label.setText("");
            Second_Label.setText("");
            resultText.setText("Error!");
            Report.setText(error);
        } else if (num1IsNumeric && !num2IsNumeric) {
            error += "[Error]: Second cell does not contain numbers!";
            Second_Label.setText("");
            resultText.setText("Error!");
            Report.setText(error);
        } else if (!num1IsNumeric && num2IsNumeric) {
            error += "[Error]: First cell does not contain numbers!";
            First_Label.setText("");
            resultText.setText("Error!");
            Report.setText(error);
        }
        if (error.equals("")) {
            num1 = Double.parseDouble(First_Label.getText());
            num2 = Double.parseDouble(Second_Label.getText());
        }
    }

    public void splitNumberToStringArray() {

        arrnum1 = (First_Label.getText()).toCharArray();
        arrnum2 = (Second_Label.getText()).toCharArray();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Func = new javax.swing.JComboBox<>();
        Name_Apps = new javax.swing.JLabel();
        sm_Logo1 = new javax.swing.JLabel();
        sm_Logo2 = new javax.swing.JLabel();
        sm_Logo3 = new javax.swing.JLabel();
        coppyright = new javax.swing.JLabel();
        Title_Func = new javax.swing.JLabel();
        First_Num = new javax.swing.JLabel();
        Second_Num = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        resultText = new javax.swing.JLabel();
        Report = new javax.swing.JLabel();
        Icon_RP = new javax.swing.JLabel();
        Line_UnderLogo1 = new javax.swing.JSeparator();
        Line_UnderLogo2 = new javax.swing.JSeparator();
        Line_Bottom3 = new javax.swing.JSeparator();
        First_Label = new javax.swing.JTextField();
        Second_Label = new javax.swing.JTextField();
        Calculator_Button = new javax.swing.JToggleButton();
        Clear_Button = new javax.swing.JToggleButton();
        LeftDelete_Button = new javax.swing.JToggleButton();
        RightDelete_Button = new javax.swing.JToggleButton();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();

        Menu_Func.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Menu_Func.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Addition", "Subtraction", "Multiplication", "Division", "Modulus", "Square", "Square Root" }));
        Menu_Func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_FuncActionPerformed(evt);
            }
        });

        Name_Apps.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        Name_Apps.setForeground(new java.awt.Color(255, 255, 255));
        Name_Apps.setText("E - Calculator Application");

        sm_Logo1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        sm_Logo1.setForeground(new java.awt.Color(255, 255, 255));
        sm_Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iconJF/LogoE.png"))); // NOI18N

        sm_Logo2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        sm_Logo2.setForeground(new java.awt.Color(255, 255, 255));
        sm_Logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iconJF/LogoC.png"))); // NOI18N

        sm_Logo3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        sm_Logo3.setForeground(new java.awt.Color(255, 255, 255));
        sm_Logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iconJF/LogoA.png"))); // NOI18N

        coppyright.setFont(new java.awt.Font("Segoe UI Light", 2, 12)); // NOI18N
        coppyright.setForeground(new java.awt.Color(255, 255, 255));
        coppyright.setText("copyright© C1CS.5 Team DTU All rights reserved");

        Title_Func.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Title_Func.setForeground(new java.awt.Color(255, 255, 255));
        Title_Func.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_Func.setText("ADDITION");

        First_Num.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        First_Num.setForeground(new java.awt.Color(255, 255, 255));
        First_Num.setText("First number:");

        Second_Num.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Second_Num.setForeground(new java.awt.Color(255, 255, 255));
        Second_Num.setText("Second number:");

        Result.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Result.setForeground(new java.awt.Color(255, 255, 255));
        Result.setText("Result:");
        Result.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ResultPropertyChange(evt);
            }
        });

        resultText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultText.setForeground(new java.awt.Color(255, 255, 255));
        resultText.setText("0");

        Report.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        Report.setForeground(new java.awt.Color(255, 51, 51));

        Icon_RP.setForeground(new java.awt.Color(255, 255, 255));
        Icon_RP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/iconJF/iconRP.png"))); // NOI18N

        First_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_LabelActionPerformed(evt);
            }
        });

        Second_Label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second_LabelActionPerformed(evt);
            }
        });

        Calculator_Button.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Calculator_Button.setText("Calculate");
        Calculator_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculator_ButtonActionPerformed(evt);
            }
        });

        Clear_Button.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        Clear_Button.setText("CE");
        Clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_ButtonActionPerformed(evt);
            }
        });

        LeftDelete_Button.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        LeftDelete_Button.setText("<<<");
        LeftDelete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftDelete_ButtonActionPerformed(evt);
            }
        });

        RightDelete_Button.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        RightDelete_Button.setText(">>>");
        RightDelete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightDelete_ButtonActionPerformed(evt);
            }
        });

        checkbox1.setBackground(new java.awt.Color(65, 67, 69));
        checkbox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbox1MouseClicked(evt);
            }
        });

        checkbox2.setBackground(new java.awt.Color(65, 67, 69));
        checkbox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkbox2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Line_UnderLogo1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Name_Apps, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sm_Logo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sm_Logo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sm_Logo3))
                            .addComponent(Line_Bottom3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Menu_Func, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(First_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Line_UnderLogo2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(First_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkbox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(LeftDelete_Button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RightDelete_Button)
                                        .addGap(84, 84, 84))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(Second_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resultText, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Second_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkbox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Icon_RP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Calculator_Button)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(coppyright, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Title_Func, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sm_Logo3)
                            .addComponent(sm_Logo2)
                            .addComponent(sm_Logo1))
                        .addGap(18, 18, 18)
                        .addComponent(Line_UnderLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Name_Apps, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Line_UnderLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(Menu_Func, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Title_Func)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(First_Num)
                        .addComponent(First_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Second_Num)
                        .addComponent(Second_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Result))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(resultText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calculator_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LeftDelete_Button)
                    .addComponent(RightDelete_Button))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Icon_RP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(Line_Bottom3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coppyright, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_FuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_FuncActionPerformed
        // TODO add your handling code here:
        String comboBox = Menu_Func.getSelectedItem() + "";
        if (comboBox.equals("Addition")) {
            Title_Func.setText("ADDITION");
            First_Num.setText("First Number: ");
            Second_Num.setVisible(true);
            Second_Label.setVisible(true);
            checkbox2.setVisible(true);
        } else if (comboBox.equals("Subtraction")) {
            Title_Func.setText("SUBTRACTION");
            First_Num.setText("First Number: ");
            Second_Num.setVisible(true);
            Second_Label.setVisible(true);
            checkbox2.setVisible(true);
        } else if (comboBox.equals("Multiplication")) {
            Title_Func.setText("MULTIPLICATION");
            First_Num.setText("First Number: ");
            Second_Num.setVisible(true);
            Second_Label.setVisible(true);
            checkbox2.setVisible(true);
        } else if (comboBox.equals("Division")) {
            Title_Func.setText("DIVISION");
            First_Num.setText("First Number: ");
            Second_Num.setVisible(true);
            Second_Label.setVisible(true);
            checkbox2.setVisible(true);
        } else if (comboBox.equals("Modulus")) {
            Title_Func.setText("MODULUS");
            First_Num.setText("First Number: ");
            Second_Num.setVisible(true);
            Second_Label.setVisible(true);
            checkbox2.setVisible(true);
        } else if (comboBox.equals("Square")) {
            Title_Func.setText("SQUARE (X²)");
            First_Num.setText("X Number:");
            Second_Num.setVisible(false);
            Second_Label.setVisible(false);
            checkbox2.setVisible(false);
        } else if (comboBox.equals("Square Root")) {
            Title_Func.setText("SQUARE ROOT (√X)");
            First_Num.setText("X Number:");
            Second_Num.setVisible(false);
            Second_Label.setVisible(false);
            checkbox2.setVisible(false);
        }
    }//GEN-LAST:event_Menu_FuncActionPerformed

    private void First_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_LabelActionPerformed

    }//GEN-LAST:event_First_LabelActionPerformed

    private void Second_LabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second_LabelActionPerformed

    }//GEN-LAST:event_Second_LabelActionPerformed

    private void Calculator_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculator_ButtonActionPerformed
        Function cal = new Function();

        Report.setText("");
        String comboBox = Menu_Func.getSelectedItem() + "";

        if (!comboBox.equals("Square")&&!comboBox.equals("Square Root")) {
            GetValue();
            boolean num1is = isNumeric(First_Label.getText());
            boolean num2is = isNumeric(Second_Label.getText());

            if (comboBox.equals("Addition")) {
                double result = cal.AddictionNumber(num1, num2);
                resultText.setText(result + "");
            } else if (comboBox.equals("Subtraction")) {
                double result = cal.SubtractionNumber(num1, num2);
                resultText.setText(result + "");
            }

            if (comboBox.equals("Multiplication")) {
                double result = cal.MultiplicationNumber(num1, num2);
                resultText.setText(result + "");
            }

            if (comboBox.equals("Division")) {
                if (Second_Label.getText().equals("0")) {
                    Report.setText("[Error]: Cannot divide by 0 !");
                    Second_Label.setText("");
                    resultText.setText("Result is undefined!");
                } else if (!num1is && num2is) {
                    Report.setText("[Error]: First cell does not contain numbers!");
                    First_Label.setText("");
                    resultText.setText("Error!");
                } else if (num1is && !num2is) {
                    Report.setText("[Error]: Second cell does not contain numbers!");
                    Second_Label.setText("");
                    resultText.setText("Error!");
                } else if (!num1is && !num2is) {
                    Report.setText("[Error]: All cells do not contain numbers!");
                    First_Label.setText("");
                    Second_Label.setText("");
                    resultText.setText("Error!");
                } else {
                    double result = cal.DivisionNumber(num1, num2);
                    resultText.setText(result + "");
                }
            }

            if (comboBox.equals("Modulus")) {
                if (Second_Label.getText().equals("0")) {
                    Report.setText("[Error]: Cannot divide by 0 !");
                    Second_Label.setText("");
                    resultText.setText("Result is undefined!");
                } else if (!num1is && num2is) {
                    Report.setText("[Error]: First cell does not contain numbers!");
                    First_Label.setText("");
                    resultText.setText("Error!");
                } else if (num1is && !num2is) {
                    Report.setText("[Error]: Second cell does not contain numbers!");
                    Second_Label.setText("");
                    resultText.setText("Error!");
                } else if (!num1is && !num2is) {
                    Report.setText("[Error]: All cells do not contain numbers!");
                    First_Label.setText("");
                    Second_Label.setText("");
                    resultText.setText("Error!");
                } else {
                    double result = cal.ModulusNumber(num1, num2);
                    resultText.setText(result + "");
                }
            }
        } else if (comboBox.equals("Square")) {
            GetValueOnlyOne();
            double result = cal.Square(num1);
            resultText.setText(result + "");
        } else if (comboBox.equals("Square Root")) {
            GetValueOnlyOne();
            if(num1<0) {
                Report.setText("number must >=0");
            } else {
                double result = cal.SquareRoot(num1);
                resultText.setText(result + "");
            }
             
        }
    }//GEN-LAST:event_Calculator_ButtonActionPerformed

    private void Clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_ButtonActionPerformed
        resultText.setText("0");
        First_Label.setText("");
        Second_Label.setText("");
        Report.setText("");
        num1 = 0;
        num2 = 0;
    }//GEN-LAST:event_Clear_ButtonActionPerformed

    private void LeftDelete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftDelete_ButtonActionPerformed
        splitNumberToStringArray();
        if (checkbox1.getState() == true) {
            char[] temp = new char[arrnum1.length - 1];
            for (int i = 0; i < arrnum1.length - 1; i++) {
                temp[i] = arrnum1[i];
            }
            arrnum1 = temp;

            String number1 = "";
            for (int i = 0; i < arrnum1.length; i++) {
                number1 += arrnum1[i];
            }

            First_Label.setText(number1);
        } else if (checkbox2.getState() == true) {
            char[] temp = new char[arrnum2.length - 1];
            for (int i = 0; i < arrnum2.length - 1; i++) {
                temp[i] = arrnum2[i];
            }
            arrnum2 = temp;

            String number2 = "";
            for (int i = 0; i < arrnum2.length; i++) {
                number2 += arrnum2[i];
            }

            Second_Label.setText(number2);
        }

    }//GEN-LAST:event_LeftDelete_ButtonActionPerformed

    private void RightDelete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightDelete_ButtonActionPerformed
        splitNumberToStringArray();
        if (checkbox1.getState() == true) {
            char[] temp = new char[arrnum1.length - 1];
            int j = 1;
            for (int i = 0; i < arrnum1.length - 1; i++) {
                temp[i] = arrnum1[j];
                j++;
            }
            arrnum1 = temp;

            String number1 = "";
            for (int i = 0; i < arrnum1.length; i++) {
                number1 += arrnum1[i];
            }

            First_Label.setText(number1);
        } else if (checkbox2.getState() == true) {
            char[] temp = new char[arrnum2.length - 1];
            int j = 1;
            for (int i = 0; i < arrnum2.length - 1; i++) {
                temp[i] = arrnum2[j];
                j++;
            }
            arrnum2 = temp;

            String number2 = "";
            for (int i = 0; i < arrnum2.length; i++) {
                number2 += arrnum2[i];
            }

            Second_Label.setText(number2);
        }
    }//GEN-LAST:event_RightDelete_ButtonActionPerformed

    private void ResultPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ResultPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultPropertyChange

    private void checkbox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox1MouseClicked
        checkbox1.setState(true);
        checkbox2.setState(false);
    }//GEN-LAST:event_checkbox1MouseClicked

    private void checkbox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox2MouseClicked
        checkbox2.setState(true);
        checkbox1.setState(false);
    }//GEN-LAST:event_checkbox2MouseClicked

    @Override
    // Background color;
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        super.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Calculator_Button;
    private javax.swing.JToggleButton Clear_Button;
    private javax.swing.JTextField First_Label;
    private javax.swing.JLabel First_Num;
    private javax.swing.JLabel Icon_RP;
    private javax.swing.JToggleButton LeftDelete_Button;
    private javax.swing.JSeparator Line_Bottom3;
    private javax.swing.JSeparator Line_UnderLogo1;
    private javax.swing.JSeparator Line_UnderLogo2;
    private javax.swing.JComboBox<String> Menu_Func;
    private javax.swing.JLabel Name_Apps;
    private javax.swing.JLabel Report;
    private javax.swing.JLabel Result;
    private javax.swing.JToggleButton RightDelete_Button;
    private javax.swing.JTextField Second_Label;
    private javax.swing.JLabel Second_Num;
    private javax.swing.JLabel Title_Func;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private javax.swing.JLabel coppyright;
    private javax.swing.JLabel resultText;
    private javax.swing.JLabel sm_Logo1;
    private javax.swing.JLabel sm_Logo2;
    private javax.swing.JLabel sm_Logo3;
    // End of variables declaration//GEN-END:variables
}
