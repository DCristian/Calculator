
/**
 *
 * @author Dumitru Cristian
 */

import java.awt.Color;
import java.rmi.*;
import javax.swing.JButton;

public class Calculator extends javax.swing.JFrame {

    private Client client;
    private int operator, port;
    private String adresa, ecran;
    private boolean eroare, eroareServer;
    private double valoareCurenta;

    public Calculator() {
        super("Calculator");
        initComponents();
        this.getContentPane().setBackground(Color.decode("#36454f"));
        Factorial.setBackground(Color.decode("#007fff"));
        Putere.setBackground(Color.decode("#007fff"));
        Radical.setBackground(Color.decode("#007fff"));
        Inversare.setBackground(Color.decode("#007fff"));
        Impartire.setBackground(Color.decode("#007fff"));
        Inmultire.setBackground(Color.decode("#007fff"));
        Minus.setBackground(Color.decode("#007fff"));
        Plus.setBackground(Color.decode("#007fff"));
        memoryClear.setBackground(Color.decode("#007fff"));
        memoryMinus.setBackground(Color.decode("#007fff"));
        memoryPlus.setBackground(Color.decode("#007fff"));
        memoryReturn.setBackground(Color.decode("#007fff"));
        memoryStocate.setBackground(Color.decode("#007fff"));
        textAdresa.setText("localhost");
        textPort.setText("44");
        text1.setEditable(false);
        text2.setEditable(false);
        disablePanel();
        eroare = false;
        eroareServer = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JTextField();
        text2 = new javax.swing.JTextField();
        Patru = new javax.swing.JButton();
        Cinci = new javax.swing.JButton();
        Sase = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Egal = new javax.swing.JButton();
        Punct = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Unu = new javax.swing.JButton();
        Doi = new javax.swing.JButton();
        Trei = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Inmultire = new javax.swing.JButton();
        Noua = new javax.swing.JButton();
        Radical = new javax.swing.JButton();
        Impartire = new javax.swing.JButton();
        Putere = new javax.swing.JButton();
        Opt = new javax.swing.JButton();
        Sapte = new javax.swing.JButton();
        Factorial = new javax.swing.JButton();
        Inversare = new javax.swing.JButton();
        Conectare = new javax.swing.JButton();
        textPort = new javax.swing.JTextField();
        labelPort = new javax.swing.JLabel();
        textAdresa = new javax.swing.JTextField();
        labelAdresa = new javax.swing.JLabel();
        Stergere = new javax.swing.JButton();
        memoryStocate = new javax.swing.JButton();
        memoryReturn = new javax.swing.JButton();
        memoryClear = new javax.swing.JButton();
        memoryMinus = new javax.swing.JButton();
        memoryPlus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 380, 50));

        text2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        text2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 380, 50));

        Patru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Patru.setText("4");
        Patru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Patru, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 60, 50));

        Cinci.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cinci.setText("5");
        Cinci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Cinci, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 60, 50));

        Sase.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sase.setText("6");
        Sase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Sase, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 60, 50));

        Clear.setBackground(java.awt.Color.red);
        Clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 60, 50));

        Egal.setBackground(new java.awt.Color(255, 0, 0));
        Egal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Egal.setForeground(new java.awt.Color(255, 255, 255));
        Egal.setText("=");
        Egal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EgalActionPerformed(evt);
            }
        });
        getContentPane().add(Egal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 300, 53));

        Punct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Punct.setText(".");
        Punct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PunctActionPerformed(evt);
            }
        });
        getContentPane().add(Punct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 60, 50));

        Zero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 60, 50));

        Unu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Unu.setText("1");
        Unu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Unu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 60, 50));

        Doi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Doi.setText("2");
        Doi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Doi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 60, 50));

        Trei.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Trei.setText("3");
        Trei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Trei, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 60, 50));

        Plus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Plus.setForeground(new java.awt.Color(255, 255, 255));
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 60, 50));

        Minus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Minus.setForeground(new java.awt.Color(255, 255, 255));
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 60, 50));

        Inmultire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Inmultire.setForeground(new java.awt.Color(255, 255, 255));
        Inmultire.setText("*");
        Inmultire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Inmultire, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 60, 50));

        Noua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Noua.setText("9");
        Noua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Noua, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 60, 50));

        Radical.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Radical.setForeground(new java.awt.Color(255, 255, 255));
        Radical.setText("Sqrt");
        Radical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Radical, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 60, 50));

        Impartire.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Impartire.setForeground(new java.awt.Color(255, 255, 255));
        Impartire.setText("/");
        Impartire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Impartire, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 60, 50));

        Putere.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Putere.setForeground(new java.awt.Color(255, 255, 255));
        Putere.setText("Pow");
        Putere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Putere, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 60, 50));

        Opt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Opt.setText("8");
        Opt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 60, 50));

        Sapte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sapte.setText("7");
        Sapte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Sapte, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 60, 50));

        Factorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Factorial.setForeground(new java.awt.Color(255, 255, 255));
        Factorial.setText("Fact");
        Factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Factorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 50));

        Inversare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Inversare.setForeground(new java.awt.Color(255, 255, 255));
        Inversare.setText("1/N");
        Inversare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(Inversare, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 60, 50));

        Conectare.setBackground(java.awt.Color.red);
        Conectare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Conectare.setForeground(new java.awt.Color(255, 255, 255));
        Conectare.setText("Conectare");
        Conectare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectareActionPerformed(evt);
            }
        });
        getContentPane().add(Conectare, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 110, 40));

        textPort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textPort.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(textPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 60, 40));

        labelPort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPort.setForeground(new java.awt.Color(255, 255, 255));
        labelPort.setText("Port :");
        getContentPane().add(labelPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 40));

        textAdresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textAdresa.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(textAdresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 140, 40));

        labelAdresa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelAdresa.setForeground(new java.awt.Color(255, 255, 255));
        labelAdresa.setText("Adresa :");
        getContentPane().add(labelAdresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 40));

        Stergere.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Stergere.setText("<--");
        Stergere.setMaximumSize(new java.awt.Dimension(37, 31));
        Stergere.setMinimumSize(new java.awt.Dimension(37, 31));
        Stergere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StergereActionPerformed(evt);
            }
        });
        getContentPane().add(Stergere, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 60, 50));

        memoryStocate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memoryStocate.setForeground(new java.awt.Color(255, 255, 255));
        memoryStocate.setText("MS");
        memoryStocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(memoryStocate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 50));

        memoryReturn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memoryReturn.setForeground(new java.awt.Color(255, 255, 255));
        memoryReturn.setText("MR");
        memoryReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryReturnActionPerformed(evt);
            }
        });
        getContentPane().add(memoryReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 60, 50));

        memoryClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memoryClear.setForeground(new java.awt.Color(255, 255, 255));
        memoryClear.setText("MC");
        memoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(memoryClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 60, 50));

        memoryMinus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memoryMinus.setForeground(new java.awt.Color(255, 255, 255));
        memoryMinus.setText("M-");
        memoryMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(memoryMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 60, 50));

        memoryPlus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memoryPlus.setForeground(new java.awt.Color(255, 255, 255));
        memoryPlus.setText("M+");
        memoryPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformer(evt);
            }
        });
        getContentPane().add(memoryPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 60, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConectareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectareActionPerformed

        if (Conectare.getText().equals("Deconectare")) {
            client.deconectare();
            Conectare.setText("Conectare");
            disablePanel();
            text1.setText("");
            text2.setText("");
            textAdresa.setEditable(true);
            textPort.setEditable(true);
            eroareServer = false;
        } else {

            adresa = textAdresa.getText();
            port = Integer.parseInt(textPort.getText());
            eroareServer = false;
            client = new Client(adresa, port, this);
            if (!eroareServer) {
                enablePanel();
                text1.setText("0");
                ecran = "0";
                operator = -1;
                valoareCurenta = 0;
                Conectare.setText("Deconectare");
                textAdresa.setEditable(false);
                textPort.setEditable(false);
            }
            eroareServer = false;
            eroare = false;
        }
    }//GEN-LAST:event_ConectareActionPerformed

    private void PunctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PunctActionPerformed

        if (!text1.getText().contains(".") && !text1.getText().equals("") && !text1.getText().toLowerCase().contains("infinity")) {
            ecran += ".";
            text1.setText(ecran);
        }
    }//GEN-LAST:event_PunctActionPerformed

    private void EgalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EgalActionPerformed

        if (text1.getText().equals("")) {
            ecran = "" + valoareCurenta;
            text2.setText("");
            text1.setText(ecran);
            operator = -1;
        } else if (operator != -1) {
            double numar = Double.parseDouble(text1.getText());
            operatie(operator, numar);
        }
    }//GEN-LAST:event_EgalActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        if (eroare) {
            enablePanel();
            eroare = false;
        }
        text1.setText("0");
        text2.setText("");
        ecran = "0";
        valoareCurenta = 0;
        operator = -1;
        client.operatie(9, 0);
    }//GEN-LAST:event_ClearActionPerformed

    private void actionPerformer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformer

        int operatorSecund = -1;
        char semn = ' ';
        switch (((JButton) evt.getSource()).getText()) {

            case "0":
                semn = '0';
                break;
            case "1":
                semn = '1';
                break;
            case "2":
                semn = '2';
                break;
            case "3":
                semn = '3';
                break;
            case "4":
                semn = '4';
                break;
            case "5":
                semn = '5';
                break;
            case "6":
                semn = '6';
                break;
            case "7":
                semn = '7';
                break;
            case "8":
                semn = '8';
                break;
            case "9":
                semn = '9';
                break;
            case "+":
                semn = '+';
                operatorSecund = 1;
                break;
            case "-":
                semn = '-';
                operatorSecund = 2;
                break;
            case "*":
                semn = '*';
                operatorSecund = 3;
                break;
            case "/":
                semn = '/';
                operatorSecund = 4;
                break;
            case "1/N":
                operatorSecund = 5;
                break;
            case "Pow":
                semn = '^';
                operatorSecund = 6;
                break;
            case "Fact":
                operatorSecund = 7;
                break;
            case "Sqrt":
                operatorSecund = 8;
                break;
            case "MS":
                operatorSecund = 10;
                break;
            case "MC":
                operatorSecund = 11;
                break;
            case "M-":
                operatorSecund = 12;
                break;
            case "M+":
                operatorSecund = 13;
                break;
        }

        if (operatorSecund < 0) {
            eveniment_butoane_numere(semn);
        } else if (semn != ' ') {
            eveniment_butoane_cu_semn(semn, operatorSecund);
        } else {
            eveniment_butoane_speciale(operatorSecund);
        }
    }//GEN-LAST:event_actionPerformer

    public void eveniment_butoane_numere(char semn) {

        if ((operator != -1 || valoareCurenta == 0) && !text1.getText().equals("0") && !text1.getText().equals("0.0")) {
            ecran += semn;
            text1.setText(ecran);
        } else {
            ecran = "" + semn;
            text1.setText(ecran);
            client.operatie(9, 0);
            valoareCurenta = 0;
        }
    }

    public void eveniment_butoane_cu_semn(char semn, int operatorSecund) {

        if (operator == -1) {
            valoareCurenta = Double.parseDouble(ecran);
            text2.setText(ecran + semn);
            text1.setText("");
            ecran = "";
            operator = operatorSecund;
            client.operatie(9, valoareCurenta);
        } else if (text1.getText().equals("")) {
            operator = operatorSecund;
            text2.setText("" + valoareCurenta + semn);
        } else {
            double numar = Double.parseDouble(text1.getText());
            operatie(operator, numar);
            if (!eroare) {
                text1.setText("");
                text2.setText("" + valoareCurenta + semn);
                ecran = "";
                operator = operatorSecund;
            }
        }
    }

    public void eveniment_butoane_speciale(int operatorSecund) {

        if (operator == -1) {
            double numar = Double.parseDouble(text1.getText());
            operatie(operatorSecund, numar);
        } else if (text1.getText().equals("")) {
            operatie(operatorSecund, valoareCurenta);
        } else {
            double numar = Double.parseDouble(text1.getText());
            operatie(operator, numar);
            if (!eroare) {
                operatie(operatorSecund, valoareCurenta);
            }
        }
    }

    private void StergereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StergereActionPerformed

        if (text1.getText().length() == 1) {
            ecran = "0";
            text1.setText(ecran);
        } else if (!text1.getText().equals("") && !text1.getText().toLowerCase().contains("infinity")) {
            ecran = ecran.substring(0, ecran.length() - 1);
            text1.setText(ecran);
        }
    }//GEN-LAST:event_StergereActionPerformed

    private void memoryReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryReturnActionPerformed

        try {
            valoareCurenta = client.getMemoryvalue();
            ecran = "" + valoareCurenta;
            text1.setText(ecran);
            text2.setText("");
            operator = -1;
        } catch (RemoteException ex) {
            eroareServer("Serverul este offline");
        }

    }//GEN-LAST:event_memoryReturnActionPerformed

    public void operatie(int operat, double numar) {

        try {
            client.operatie(operat, numar);
            if (!eroare) {
                valoareCurenta = client.getCurentValue();
                ecran = "" + valoareCurenta;
                text1.setText(ecran);
                text2.setText("");
                operator = -1;
            }
        } catch (RemoteException ex) {
            eroareServer("Serverul este offline");
        }
    }

    public void disablePanel() {

        Unu.setEnabled(false);
        Doi.setEnabled(false);
        Trei.setEnabled(false);
        Patru.setEnabled(false);
        Cinci.setEnabled(false);
        Sase.setEnabled(false);
        Sapte.setEnabled(false);
        Opt.setEnabled(false);
        Noua.setEnabled(false);
        Zero.setEnabled(false);
        Punct.setEnabled(false);
        Egal.setEnabled(false);
        Clear.setEnabled(false);
        Plus.setEnabled(false);
        Minus.setEnabled(false);
        Inmultire.setEnabled(false);
        Impartire.setEnabled(false);
        Inversare.setEnabled(false);
        Factorial.setEnabled(false);
        Putere.setEnabled(false);
        Radical.setEnabled(false);
        Stergere.setEnabled(false);
        memoryClear.setEnabled(false);
        memoryMinus.setEnabled(false);
        memoryPlus.setEnabled(false);
        memoryReturn.setEnabled(false);
        memoryStocate.setEnabled(false);
    }

    public void enablePanel() {

        Unu.setEnabled(true);
        Doi.setEnabled(true);
        Trei.setEnabled(true);
        Patru.setEnabled(true);
        Cinci.setEnabled(true);
        Sase.setEnabled(true);
        Sapte.setEnabled(true);
        Opt.setEnabled(true);
        Noua.setEnabled(true);
        Zero.setEnabled(true);
        Punct.setEnabled(true);
        Egal.setEnabled(true);
        Clear.setEnabled(true);
        Plus.setEnabled(true);
        Minus.setEnabled(true);
        Inmultire.setEnabled(true);
        Impartire.setEnabled(true);
        Inversare.setEnabled(true);
        Factorial.setEnabled(true);
        Putere.setEnabled(true);
        Radical.setEnabled(true);
        Stergere.setEnabled(true);
        memoryClear.setEnabled(true);
        memoryMinus.setEnabled(true);
        memoryPlus.setEnabled(true);
        memoryReturn.setEnabled(true);
        memoryStocate.setEnabled(true);
    }

    public void eroare(String mesaj) {

        text2.setText("");
        text1.setText(mesaj);
        disablePanel();
        Clear.setEnabled(true);
        eroare = true;
    }

    public void eroareServer(String mesaj) {

        text2.setText("");
        text1.setText(mesaj);
        disablePanel();
        eroareServer = true;
        if (client != null) {
            client.deconectare();
        }
        Conectare.setText("Conectare");
        textAdresa.setEditable(true);
        textPort.setEditable(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cinci;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Conectare;
    private javax.swing.JButton Doi;
    private javax.swing.JButton Egal;
    private javax.swing.JButton Factorial;
    private javax.swing.JButton Impartire;
    private javax.swing.JButton Inmultire;
    private javax.swing.JButton Inversare;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Noua;
    private javax.swing.JButton Opt;
    private javax.swing.JButton Patru;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Punct;
    private javax.swing.JButton Putere;
    private javax.swing.JButton Radical;
    private javax.swing.JButton Sapte;
    private javax.swing.JButton Sase;
    private javax.swing.JButton Stergere;
    private javax.swing.JButton Trei;
    private javax.swing.JButton Unu;
    private javax.swing.JButton Zero;
    private javax.swing.JLabel labelAdresa;
    private javax.swing.JLabel labelPort;
    private javax.swing.JButton memoryClear;
    private javax.swing.JButton memoryMinus;
    private javax.swing.JButton memoryPlus;
    private javax.swing.JButton memoryReturn;
    private javax.swing.JButton memoryStocate;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField textAdresa;
    private javax.swing.JTextField textPort;
    // End of variables declaration//GEN-END:variables
}
