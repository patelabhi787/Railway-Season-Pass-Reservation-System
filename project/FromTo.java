
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;

public class FromTo extends JFrame 
{
	public String source,target;
    
    public FromTo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jComboBox8 = new JComboBox<>();
        jComboBox9 = new JComboBox<>();
        jLabel3 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("IR UNRESERVED TICKETING");
        setMaximumSize(new Dimension(0, 0));
        setResizable(false);

        jLabel1.setFont(new Font("Tahoma", 0, 14)); 
        jLabel1.setText("    SEASON TICKET ISSUE");
        jLabel1.setMaximumSize(new Dimension(170, 26));
        jLabel1.setMinimumSize(new Dimension(170, 26));
        jLabel1.setPreferredSize(new Dimension(170, 26));

        jLabel2.setFont(new Font("Tahoma", 1, 11)); 
        jLabel2.setText("From Station(s) :");

        jComboBox8.setModel(new DefaultComboBoxModel<>(new String[] { "Dahanu Rd.", "Vangaon", "Boisar", "Umroli", "Palghar", "Kelve Rd.", "Saphale", "Vaitarna", "Virar", "Nallasopara", "Vasai Rd.", "Naigaon", "Bhayandar", "Mira Rd.", "Dahisar", "Borivali", "Kandivali", "Malad", "Goregaon", "Ram Mandir", "Jogeshwari", "Andheri", "Vile Parle", "Santacruz", "Khar Road", "Bandra", "Mahim", "Matunga Rd.", "Dadar", "Prabhadevi", "Lower Parel", "Mahalaxmi", "Mumbai Central", "Grant Rd.", "Charni Rd.", "Marine Lines", "Churchgate" }));
        jComboBox8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jComboBox9.setModel(new DefaultComboBoxModel<>(new String[] { "Dahanu Rd.", "Vangaon", "Boisar", "Umroli", "Palghar", "Kelve Rd.", "Saphale", "Vaitarna", "Virar", "Nallasopara", "Vasai Rd.", "Naigaon", "Bhayandar", "Mira Rd.", "Dahisar", "Borivali", "Kandivali", "Malad", "Goregaon", "Ram Mandir", "Jogeshwari", "Andheri", "Vile Parle", "Santacruz", "Khar Road", "Bandra", "Mahim", "Matunga Rd.", "Dadar", "Prabhadevi", "Lower Parel", "Mahalaxmi", "Mumbai Central", "Grant Rd.", "Charni Rd.", "Marine Lines", "Churchgate" }));
        jComboBox9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new Font("Tahoma", 1, 11)); 
        jLabel3.setText("To Station(s) :");

        jButton1.setText("DONE");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox8, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox8, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox9, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }

    private void jComboBox9ActionPerformed(ActionEvent evt) {                                           
        target = (String)jComboBox9.getSelectedItem();
        
    }                                          

    private void jButton1ActionPerformed(ActionEvent evt) {                                         
        if(source.equals(target))
        {
            JOptionPane.showMessageDialog(null,"You have Selected the same Stations.\nPlease enter the valid details","Wrong Pass",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            RegistrationFrame rf = new RegistrationFrame(this);
            rf.setVisible(true);
            dispose();
        }
        
    }                                        

    private void jComboBox8ActionPerformed(ActionEvent evt) {                                           
        source = (String)jComboBox8.getSelectedItem();
        
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
            Logger.getLogger(FromTo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FromTo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FromTo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(FromTo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromTo().setVisible(true);
            }
        });
    }

    
    private JButton jButton1;
    public JComboBox<String> jComboBox8;
    public JComboBox<String> jComboBox9;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;  
}
