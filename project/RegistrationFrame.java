
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationFrame extends JFrame {
    public FromTo v2;
    public String train_type,class_type,duration,name,dob,line1,line2,age;


    public RegistrationFrame(FromTo v2) {
        this.v2=v2;
        initComponents();
    }

    public RegistrationFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
       
    private void initComponents() {

        jScrollPane2 = new JScrollPane();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jComboBox2 = new JComboBox<>();
        jComboBox3 = new JComboBox<>();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jLabel6 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel7 = new JLabel();
        jTextField2 = new JTextField();
        jLabel8 = new JLabel();
        jTextField3 = new JTextField();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jTextField4 = new JTextField();
        jLabel11 = new JLabel();
        jTextField5 = new JTextField();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jTextField6 = new JTextField();
        jTextField7 = new JTextField();
        jButton1 = new JButton();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jTextField8 = new JTextField();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("IR UNRESERVED TICKETING---Mumbai Local Train");
        setMaximumSize(new Dimension(0, 0));
        setResizable(false);

        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setPreferredSize(new Dimension(550, 760));

        jLabel1.setFont(new Font("Tempus Sans ITC", 1, 21)); 
        jLabel1.setText("   TICKET ISSUE");
        jLabel1.setMaximumSize(new Dimension(112, 20));
        jLabel1.setMinimumSize(new Dimension(169, 20));
        jLabel1.setPreferredSize(new Dimension(169, 20));

        jLabel2.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel2.setText("* Train Type");

        jLabel3.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel3.setText("* Class Type");

        jLabel4.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel4.setText("* Duration");

        jComboBox1.setFont(new Font("Century", 1, 12)); 
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Ordinary(O)" }));
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new Font("Century", 1, 12)); 
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Monthly(M)", "Quarterly(Q)" }));
        jComboBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new Font("Century", 1, 12)); 
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "Second(II)", "First(I)" }));
        jComboBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel5.setText("* Name:");

        jTextField1.setFont(new Font("Century", 1, 12)); 
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel6.setText("* Gender:");

        jRadioButton1.setFont(new Font("Century Schoolbook", 1, 12)); 
        jRadioButton1.setText("Male");
        ButtonGroup group = new ButtonGroup();
        group.add(jRadioButton1);
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new Font("Century", 1, 12)); 
        jRadioButton2.setText("Female");
        group.add(jRadioButton2);
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel7.setText("* Date-of-Birth:");

        jTextField2.setFont(new Font("Century", 1, 12)); 
        jTextField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel8.setText("Address:");

        jTextField3.setFont(new Font("Century", 1, 12)); 
        jTextField3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new Font("Comic Sans MS", 0, 12)); 
        jLabel9.setText("* Line 1:");

        jLabel10.setFont(new Font("Comic Sans MS", 0, 12)); 
        jLabel10.setText("Line 2: (Optional)");

        jTextField4.setFont(new Font("Century", 1, 12)); 
        jTextField4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new Font("Comic Sans MS", 0, 12)); 
        jLabel11.setText("* Town/City:");

        jTextField5.setFont(new Font("Century", 1, 12)); 
        jTextField5.setText("Mumbai");
        jTextField5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new Font("Comic Sans MS", 0, 12)); 
        jLabel12.setText("* State:");

        jLabel13.setFont(new Font("Comic Sans MS", 0, 12)); 
        jLabel13.setText("PinCode");

        jTextField6.setFont(new Font("Century", 1, 12)); 
        jTextField6.setText("Maharashtra");
        jTextField6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new Font("Century", 1, 12)); 
        jTextField7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton1.setFont(new Font("Comic Sans MS", 1, 14)); 
        jButton1.setText("GET FARE");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new Font("Sitka Small", 3, 10)); 
        jLabel14.setText("* Fields are Mandatory");

        jLabel15.setFont(new Font("Comic Sans MS", 0, 14)); 
        jLabel15.setText("* Age:");

        jTextField8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Comic Sans MS", 1, 14)); 
        jButton2.setText("Go Back");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 530, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 472, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jTextField5ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField4ActionPerformed(ActionEvent evt) {                                            
        line2 = jTextField4.getText();
    }                                           

    private void jTextField3ActionPerformed(ActionEvent evt) {                                            
        line1 = jTextField3.getText();
       
    }                                           

    private void jTextField2ActionPerformed(ActionEvent evt) {                                            
        dob = jTextField2.getText();
                
    }                                           

    private void jRadioButton2ActionPerformed(ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jRadioButton1ActionPerformed(ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jTextField1ActionPerformed(ActionEvent evt) {                                            
        name = jTextField1.getText();        
    }                                           

    private void jComboBox3ActionPerformed(ActionEvent evt) {                                           
        class_type = (String)jComboBox3.getSelectedItem();
    }                                          

    private void jComboBox2ActionPerformed(ActionEvent evt) {                                           
        duration = (String)jComboBox2.getSelectedItem();
    }                                          

    private void jTextField7ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField6ActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jComboBox1ActionPerformed(ActionEvent evt) {                                           
        train_type = (String)jComboBox1.getSelectedItem();
    }                                          

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        if (name==null || name.equals("") || age==null || age.equals("") || dob==null || dob.equals("") || line1==null || line1.equals(""))
        {   
            JOptionPane.showMessageDialog(null,"Please,fill up all the Mandatory Details.","Wrong Pass",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            TicketSummary ts = new TicketSummary(this);
            ts.setVisible(true);
            dispose();
        }
    }                                        

    private void jTextField8ActionPerformed(ActionEvent evt) {                                            
        age = jTextField8.getText();
    }                                           

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
        FromTo v3 = new FromTo();
        v3.setVisible(true);
        dispose();
    }                                        

    
    public static void main(String args[]) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(RegistrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(RegistrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(RegistrationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationFrame().setVisible(true);
            }
        });
    }
    
    private JButton jButton1;
    private JButton jButton2;
    public JComboBox<String> jComboBox1;
    public JComboBox<String> jComboBox2;
    public JComboBox<String> jComboBox3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JScrollPane jScrollPane2;
    public JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    public JTextField jTextField8;
    
}
