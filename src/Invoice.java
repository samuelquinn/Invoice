import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

/**
 * Samuel Quinn
 * 12/5/20
 */

class Invoice
{
    public static void main(String[] args)
    {
        GridLayout layout = new GridLayout(20, 4); //format for frame
        JFrame frame = new JFrame("Tools Invoice"); //titles frame
        frame.setLayout(layout); //adds format to frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes window
        frame.setSize(300,300); //sets dimensions for window
        frame.setVisible(true); //makes frame visible

        JPanel frameTitle = new JPanel(); //creates new JPanel
        JLabel title = new JLabel("Tools Invoice"); //creates new JLabel
        frameTitle.add(title); //adds label to panel
        frame.add(frameTitle); //adds panel to frame

        JPanel billingAddress = new JPanel(); //creates new JPanel
        JLabel ba = new JLabel("Enter Billing Address: "); //creates new JLabel
        JTextField ba1 = new JTextField(50); //creates new JTextField
        billingAddress.add(ba); //adds label to panel
        billingAddress.add(ba1); //adds textField to panel
        frame.add(billingAddress); //adds panel to frame

        JPanel headers = new JPanel(); //creates new JPanel
        JLabel labels = new JLabel("Description:                       " + //creates new JLabel - for format
                "          Quantity | Unit Price | Total"); //for format
        headers.add(labels); //adds label to panel
        frame.add(headers); //adds panel to frame

        JPanel screwdriver = new JPanel(); //creates new JPanel
        JLabel sd = new JLabel("57 PC Screwdriver Kit               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField sd1 = new JTextField(5); //creates new JTextField
        JLabel a = new JLabel("$"); //creates new JLabel
        JLabel sd2 = new JLabel("35.99"); //creates new JLabel
        JLabel b = new JLabel("$"); //creates new JLabel
        JLabel sd3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(sd1, sd2, sd3); //computes total price for specific item
        screwdriver.add(sd); //adds label to panel
        screwdriver.add(sd1); //adds textField to panel
        screwdriver.add(a); //adds label to panel
        screwdriver.add(sd2); //adds label to panel
        screwdriver.add(b); //adds label to panel
        screwdriver.add(sd3); //adds label to panel
        frame.add(screwdriver); //adds panel to frame

        JPanel measuringTape = new JPanel(); //creates new JPanel
        JLabel mt = new JLabel("57 PC Screwdriver Kit               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField mt1 = new JTextField(5); //creates new JTextField
        JLabel c = new JLabel("$"); //creates new JLabel
        JLabel mt2 = new JLabel("7.90"); //creates new JLabel
        JLabel d = new JLabel("$"); //creates new JLabel
        JLabel mt3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(mt1, mt2, mt3); //computes total price for specific item
        measuringTape.add(mt); //adds label to panel
        measuringTape.add(mt1); //adds textField to panel
        measuringTape.add(c); //adds label to panel
        measuringTape.add(mt2); //adds label to panel
        measuringTape.add(d); //adds label to panel
        measuringTape.add(mt3); //adds label to panel
        frame.add(measuringTape); //adds panel to frame


//
//        JPanel toolbox = new JPanel(); //creates new JPanel
//        JLabel tb = new JLabel("14'' Toolbox                    " + //creates new JLabel - spaces for format
//                "                   "); //spaces for format
//        JTextField tb1 = new JTextField(5); //creates new JTextField
//        JTextField tb2 = new JTextField("$19.99", 5); //creates new JTextField
//        //double priceA2 = Double.parseDouble(tb1.getText()); //converts quantity to double
//        //double priceB2 = Double.parseDouble(tb2.getText()); //converts unit price to double
//        //double tbAmt = priceA2 * priceB2; //multiplies quantity by unit price to get price
//        JTextField tb3 = new JTextField("$", 5); //creates new JTextField
//        toolbox.add(tb); //adds label to panel
//        toolbox.add(tb1); //adds textField to panel
//        toolbox.add(tb2); //adds textField to panel
//        toolbox.add(tb3); //adds textField to panel
//        frame.add(toolbox); //adds panel to frame
//
//        JPanel hammer = new JPanel(); //creates new JPanel
//        JLabel h = new JLabel("16oz Hammer                 " + //creates new JLabel - spaces for format
//                "                   "); //spaces for format
//        JTextField h1 = new JTextField(5); //creates new JTextField
//        JTextField h2 = new JTextField("$11.98", 5); //creates new JTextField
//        //double priceA3 = Double.parseDouble(h1.getText()); //converts quantity to double
//        //double priceB3 = Double.parseDouble(h2.getText()); //converts unit price to double
//        //double hAmt = priceA3 * priceB3; //multiplies quantity by unit price to get price
//        JTextField h3 = new JTextField("$", 5); //creates new JTextField
//        hammer.add(h); //adds label to panel
//        hammer.add(h1); //adds textField to panel
//        hammer.add(h2); //adds textField to panel
//        hammer.add(h3); //adds textField to panel
//        frame.add(hammer); //adds panel to frame
//
//        JPanel ductTape = new JPanel(); //creates new JPanel
//        JLabel dT = new JLabel("3 Pack Duct Tape          " + //creates new JLabel - spaces for format
//                "                   "); //spaces for format
//        JTextField dT1 = new JTextField(5); //creates new JTextField
//        JTextField dT2 = new JTextField("$14.99", 5); //creates new JTextField
//        //double priceA4 = Double.parseDouble(dT1.getText()); //converts quantity to double
//        //double priceB4 = Double.parseDouble(dT2.getText()); //converts unit price to double
//        //double dTAmt = priceA4 * priceB4; //multiplies quantity by unit price to get price
//        JTextField dT3 = new JTextField("$", 5); //creates new JTextField
//        ductTape.add(dT); //adds label to panel
//        ductTape.add(dT1); //adds textField to panel
//        ductTape.add(dT2); //adds textField to panel
//        ductTape.add(dT3); //adds textField to panel
//        frame.add(ductTape); //adds panel to frame
//
//        JPanel flashlight = new JPanel(); //creates new JPanel
//        JLabel fl = new JLabel("2 Pack Flashlight          " + //creates new JLabel - spaces for format
//                "                   "); //spaces for format
//        JTextField fl1 = new JTextField(5); //creates new JTextField
//        JTextField fl2 = new JTextField("$9.97", 5); //creates new JTextField
//        //double priceA5 = Double.parseDouble(fl1.getText()); //converts quantity to double
//        //double priceB5 = Double.parseDouble(fl2.getText()); //converts unit price to double
//        //double dTAmt = priceA5 * priceB5; //multiplies quantity by unit price to get price
//        JTextField fl3 = new JTextField("$", 5); //creates new JTextField
//        flashlight.add(fl); //adds label to panel
//        flashlight.add(fl1); //adds textField to panel
//        flashlight.add(fl2); //adds textField to panel
//        flashlight.add(fl3); //adds textField to panel
//        frame.add(flashlight); //adds panel to frame
//
//        JPanel pliers = new JPanel(); //creates new JPanel
//        JLabel p = new JLabel("6 Pack Pliers                 " + //creates new JLabel - spaces for format
//                "                   "); //spaces for format
//        JTextField p1 = new JTextField(5); //creates new JTextField
//        JTextField p2 = new JTextField("$21.98", 5); //creates new JTextField
//        //double priceA6 = Double.parseDouble(p1.getText()); //converts quantity to double
//        //double priceB6 = Double.parseDouble(p2.getText()); //converts unit price to double
//        //double pAmt = priceA6 * priceB6; //multiplies quantity by unit price to get price
//        JTextField p3 = new JTextField("$", 5); //creates new JTextField
//        pliers.add(p); //adds label to panel
//        pliers.add(p1); //adds textField to panel
//        pliers.add(p2); //adds textField to panel
//        pliers.add(p3); //adds textField to panel
//        frame.add(pliers); //adds panel to frame
    }

    private static void bindUnitsEntered(JTextField units, JLabel pricePerUnit, JLabel total) {
        units.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String unitsVal = units.getText();
                String pricePerUnitVal = pricePerUnit.getText();
                double uni = Double.parseDouble(unitsVal);
                double pri = Double.parseDouble(pricePerUnitVal);
                double amt = uni * pri;
                total.setText("" + amt);
            }
        });
        PlainDocument doc = (PlainDocument) units.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (Strings.isNumeric(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null || Strings.isNumeric(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }
}