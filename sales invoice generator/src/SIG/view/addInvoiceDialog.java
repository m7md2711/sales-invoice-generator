package SIG.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Mohamed
 */

 public class addInvoiceDialog extends JDialog{
    private JTextField customerName;
    private JTextField invoiceDate;
    private JLabel customerNameLabel;
    private JLabel date;
    private JButton ok;
    private JButton cancel;

    public addInvoiceDialog(InvoiceFrame frame) {
        customerNameLabel= new JLabel("Customer Name:");
        customerName = new JTextField(30);
        date = new JLabel("Date:");
        invoiceDate = new JTextField(30);
        ok= new JButton("OK");
        cancel = new JButton("Cancel");
        ok.setActionCommand("createInvoice");
        cancel.setActionCommand("cancelInvoice");
        ok.addActionListener(frame.getController());
        cancel.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 4));
        add(customerNameLabel);
        add(customerName);
        add(date);
        add(invoiceDate);
        add(ok);
        add(cancel);
        
        
        pack();
        
        
    }

    public JTextField getCustomerName() {
        return customerName;
    }

    public JTextField getInvoiceDate() {
        return invoiceDate;
    }
    
    
}
