
import java.lang.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.*;
import java.awt.*;
import java.awt.event.*;


public class TicketSummary extends JFrame {
public RegistrationFrame v1;    

public TicketSummary(RegistrationFrame v1) {
        this.v1=v1;
        initComponents();
        
    }

    public TicketSummary() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jSeparator2 = new JSeparator();
        jSeparator3 = new JSeparator();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jSeparator4 = new JSeparator();
        jLabel16 = new JLabel();
        jLabel17 = new JLabel();
        jSeparator5 = new JSeparator();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel21 = new JLabel();
        jButton2 = new JButton();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("IR UNRESERVED TICKETING---Western Railway");
        setMaximumSize(new Dimension(0, 0));
        setResizable(false);

        jLabel1.setFont(new Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jLabel1.setText(" TICKET SUMMARY");

        jLabel2.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel2.setText("Source Station:");

        jLabel3.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel3.setText("Destination Station:");

        jLabel4.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel5.setText("Age:");

        jLabel6.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel6.setText("Class Type:");

        jLabel7.setText((String)v1.v2.jComboBox8.getSelectedItem());
        jLabel7.setFont(new Font("Century", 1, 14)); // NOI18N

        jLabel8.setText((String)v1.v2.jComboBox9.getSelectedItem());
        jLabel8.setFont(new Font("Century", 1, 14)); // NOI18N

        jLabel9.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel9.setText("Train Type:");

        jLabel10.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel10.setText("Duration:");

        RegistrationFrame rfl = v1;
        jLabel11.setText((String)rfl.jTextField1.getText());
        jLabel11.setFont(new Font("Century", 1, 14)); // NOI18N

        jLabel12.setText((String)rfl.jTextField8.getText());
        jLabel12.setFont(new Font("Century", 1, 14)); // NOI18N

        jLabel13.setText((String)rfl.jComboBox3.getSelectedItem());
        jLabel13.setFont(new Font("Century", 1, 14)); // NOI18N

        jLabel14.setText((String)rfl.jComboBox1.getSelectedItem());
        jLabel14.setFont(new Font("Century", 1, 14)); // NOI18N

        jLabel15.setText((String)rfl.jComboBox2.getSelectedItem());
        jLabel15.setFont(new Font("Century", 1, 14)); // NOI18N

        jLabel16.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel16.setText("TOTAL FARE:");

        jLabel17.setFont(new Font("Century", 1, 14)); // NOI18N
        int a=0;
        String text1 = jLabel7.getText();
        String text2 = jLabel8.getText();
        if (text1.equals("Dahanu Rd."))
        a=1;
        else if (text1.equals("Vangaon"))
        a=2;
        else if (text1.equals("Boisar"))
        a=3;
        else if (text1.equals("Umroli"))
        a=4;
        else if (text1.equals("Palghar"))
        a=5;
        else if (text1.equals("Kelve Rd."))
        a=6;
        else if (text1.equals("Saphale"))
        a=7;
        else if(text1.equals("Vaitarna"))
        a=8;
        else if (text1.equals("Virar"))
        a=9;
        else if	(text1.equals("Nallasopara"))
        a=10;
        else if (text1.equals("Vasai Rd."))
        a=11;
        else if (text1.equals("Naigaon"))
        a=12;
        else if (text1.equals("Bhayandar"))
        a=13;
        else if (text1.equals("Mira Rd."))
        a=14;
        else if (text1.equals("Dahisar"))
        a=15;
        else if (text1.equals("Borivali"))
        a=16;
        else if (text1.equals("Kandivali"))
        a=17;
        else if (text1.equals("Malad"))
        a=18;
        else if (text1.equals("Goregaon"))
        a=19;
        else if (text1.equals("Ram Mandir"))
        a=20;
        else if (text1.equals("Jogeshwari"))
        a=21;
        else if (text1.equals("Andheri"))
        a=22;
        else if(text1.equals("Vile Parle"))
        a=23;
        else if (text1.equals("Santacruz"))
        a=24;
        else if (text1.equals("Khar Rd."))
        a=25;
        else if (text1.equals("Bandra"))
        a=26;
        else if (text1.equals("Mahim"))
        a=27;
        else if (text1.equals("Matunga Rd."))
        a=28;
        else if (text1.equals("Dadar"))
        a=29;
        else if (text1.equals("Prabhadevi"))
        a=30;
        else if (text1.equals("Lower Parel"))
        a=31;
        else if (text1.equals("Mahalaxmi"))
        a=32;
        else if (text1.equals("Mumbai Central"))
        a=33;
        else if (text1.equals("Grant Rd."))
        a=34;
        else if (text1.equals("Charni Rd."))
        a=35;
        else if (text1.equals("Marine Lines"))
        a=36;
        else
        a=37;

        int b=0;
        if (text2.equals("Dahanu Rd."))
        b=1;
        else if (text2.equals("Vangaon"))
        b=2;
        else if (text2.equals("Boisar"))
        b=3;
        else if (text2.equals("Umroli"))
        b=4;
        else if (text2.equals("Palghar"))
        b=5;
        else if (text2.equals("Kelve Rd."))
        b=6;
        else if (text2.equals("Saphale"))
        b=7;
        else if (text2.equals("Vaitarna"))
        b=8;
        else if (text2.equals("Virar"))
        b=9;
        else if	(text2.equals("Nallasopara"))
        b=10;
        else if (text2.equals("Vasai Rd."))
        b=11;
        else if (text2.equals("Naigaon"))
        b=12;
        else if (text2.equals("Bhayandar"))
        b=13;
        else if (text2.equals("Mira Rd."))
        b=14;
        else if (text2.equals("Dahisar"))
        b=15;
        else if (text2.equals("Borivali"))
        b=16;
        else if (text2.equals("Kandivali"))
        b=17;
        else if (text2.equals("Malad"))
        b=18;
        else if (text2.equals("Goregaon"))
        b=19;
        else if (text2.equals("Ram Madir"))
        b=20;
        else if (text2.equals("Jogeshwari"))
        b=21;
        else if (text2.equals("Andheri"))
        b=22;
        else if (text2.equals("Vile Parle"))
        b=23;
        else if (text2.equals("Santacruz"))
        b=24;
        else if (text2.equals("Khar Road"))
        b=25;
        else if (text2.equals("Bandra"))
        b=26;
        else if (text2.equals("Mahim"))
        b=27;
        else if (text2.equals("Matunga Rd."))
        b=28;
        else if (text2.equals("Dadar"))
        b=29;
        else if (text2.equals("Prabhadevi"))
        b=30;
        else if (text2.equals("Lower Parel"))
        b=31;
        else if (text2.equals("Mahalaxmi"))
        b=32;
        else if (text2.equals("Mumbai Central"))
        b=33;
        else if (text2.equals("Grant Rd."))
        b=34;
        else if (text2.equals("Charni Rd."))
        b=35;
        else if (text2.equals("Marine Lines"))
        b=36;
        else
        b=37;

        if (Math.abs(b-a)>=0 && Math.abs(b-a)<=6)
        {
            if ((jLabel15.getText()).equals("Monthly(M)"))
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.120/-");
                else
                {
                    if (Math.abs(b-a)>=0 && Math.abs(b-a)<=3)
                    jLabel17.setText("Rs.350/-");
                    else
                    jLabel17.setText("Rs.960/-");
                }
            }
            else
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.360/-");
                else
                {
                    if (Math.abs(b-a)>=0 && Math.abs(b-a)<=3)
                    jLabel17.setText("Rs.1120/-");
                    else
                    jLabel17.setText("Rs.2860/-");
                }
            }
        }
        else if (Math.abs(b-a)>=7 && Math.abs(b-a)<=12)
        {
            if ((jLabel15.getText()).equals("Monthly(M)"))
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.215/-");
                else
                {
                    if (Math.abs(b-a)>=7 && Math.abs(b-a)<=9)
                    jLabel17.setText("Rs.940/-");
                    else
                    jLabel17.setText("Rs.1240/-");
                }
            }
            else
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.650/-");
                else
                {
                    if (Math.abs(b-a)>=0 && Math.abs(b-a)<=3)
                    jLabel17.setText("Rs.2730/-");
                    else
                    jLabel17.setText("Rs.3580/-");
                }
            }
        }
        else if (Math.abs(b-a)>=13 && Math.abs(b-a)<=18)
        {
            if ((jLabel15.getText()).equals("Monthly(M)"))
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.315/-");
                else
                {
                    if (Math.abs(b-a)>=13 && Math.abs(b-a)<=15)
                    jLabel17.setText("Rs.1265/-");
                    else
                    jLabel17.setText("Rs.1493");
                }
            }
            else
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.945/-");
                else
                {
                    if (Math.abs(b-a)>=13 && Math.abs(b-a)<=15)
                    jLabel17.setText("Rs.3335/-");
                    else
                    jLabel17.setText("Rs.3505");
                }
            }
        }
        else if (Math.abs(b-a)>=19 && Math.abs(b-a)<=24)
        {
            if ((jLabel15.getText()).equals("Monthly(M)"))
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.400/-");
                else
                {
                    if (Math.abs(b-a)>=19 && Math.abs(b-a)<=21)
                    jLabel17.setText("Rs.1437/-");
                    else
                    jLabel17.setText("Rs.1576/-");
                }
            }
            else
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.1200/-");
                else
                {
                    if (Math.abs(b-a)>=19 && Math.abs(b-a)<=21)
                    jLabel17.setText("Rs.4244/-");
                    else
                    jLabel17.setText("Rs.4482/-");
                }
            }
        }
        else if (Math.abs(b-a)>=25 && Math.abs(b-a)<=30)
        {
            if ((jLabel15.getText()).equals("Monthly(M)"))
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.470/-");
                else
                {
                    if (Math.abs(b-a)>=25 && Math.abs(b-a)<=27)
                    jLabel17.setText("Rs.1646/-");
                    else
                    jLabel17.setText("Rs.1732/-");
                }
            }
            else
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.1410/-");
                else
                {
                    if (Math.abs(b-a)>=25 && Math.abs(b-a)<=27)
                    jLabel17.setText("Rs.4845/-");
                    else
                    jLabel17.setText("Rs.5036/-");
                }
            }
        }
        else
        {
            if ((jLabel15.getText()).equals("Monthly(M)"))
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.530/-");
                else
                {
                    if (Math.abs(b-a)>=31 && Math.abs(b-a)<=34)
                    jLabel17.setText("Rs.1995/-");
                    else
                    jLabel17.setText("Rs.2158/-");
                }
            }
            else
            {
                if ((jLabel13.getText()).equals("Second(II)"))
                jLabel17.setText("Rs.1550/-");
                else
                {
                    if (Math.abs(b-a)>=31 && Math.abs(b-a)<=34)
                    jLabel17.setText("Rs.5278/-");
                    else
                    jLabel17.setText("Rs.5490/-");
                }
            }
        }

        jLabel18.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel18.setText("Ticket Validity:");

        jLabel19.setFont(new Font("Century", 1, 14)); // NOI18N
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if ((jLabel15.getText()).equals("Monthly(M)"))
		{
			cal.add(Calendar.DATE,30);
        }
		else
		{
			cal.add(Calendar.DATE,90);
        }
		String newdate = sdf.format(cal.getTime());
        jLabel19.setText((String)sdf.format(date));

        jLabel20.setFont(new Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel20.setText("  to");

        jLabel21.setFont(new Font("Century", 1, 14)); // NOI18N
        jLabel21.setText(newdate);

        jButton2.setFont(new Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton2.setText("Go Back");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setText("PRINT");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4, GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator5)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel21, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
        v1.setVisible(true);
        dispose();
    }                                        

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        PrintJTextPane.show();
    }                                        

    public static void main(String args[]) 
    {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicketSummary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TicketSummary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TicketSummary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TicketSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketSummary().setVisible(true);   
            }
        });
        
        
    }                    
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
}
