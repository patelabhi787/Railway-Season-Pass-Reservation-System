
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.html.HTMLEditorKit;

public class PrintJTextPane {
    public static void show() {
        JFrame jframe = new JFrame();
        jframe.setSize(500, 200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTextPane jTextPane = new JTextPane();
        jTextPane.setText("Hello");

        jTextPane.setEditorKit(new HTMLEditorKit());

        JButton btn = new JButton("Print");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    jTextPane.setContentType("text/html");

                    boolean done = jTextPane.print();
                    if (done) {
                        JOptionPane.showMessageDialog(null, "Printing is done");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error while printing");
                    }
                } catch (Exception pex) {
                    JOptionPane.showMessageDialog(null, "Error while printing");
                    pex.printStackTrace();
                }
            }
        });

        jframe.add(btn, BorderLayout.SOUTH);

        jframe.add(jTextPane);
        jframe.setVisible(true);
    }
}