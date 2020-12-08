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
        JLabel a = new JLabel("| $"); //creates new JLabel
        JLabel sd2 = new JLabel("35.99"); //creates new JLabel
        JLabel b = new JLabel("| $"); //creates new JLabel
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
        JLabel mt = new JLabel("12' Measuring Tape               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField mt1 = new JTextField(5); //creates new JTextField
        JLabel c = new JLabel("| $"); //creates new JLabel
        JLabel mt2 = new JLabel("7.90"); //creates new JLabel
        JLabel d = new JLabel("| $"); //creates new JLabel
        JLabel mt3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(mt1, mt2, mt3); //computes total price for specific item
        measuringTape.add(mt); //adds label to panel
        measuringTape.add(mt1); //adds textField to panel
        measuringTape.add(c); //adds label to panel
        measuringTape.add(mt2); //adds label to panel
        measuringTape.add(d); //adds label to panel
        measuringTape.add(mt3); //adds label to panel
        frame.add(measuringTape); //adds panel to frame

        JPanel toolbox = new JPanel(); //creates new JPanel
        JLabel tb = new JLabel("14'' Toolbox               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField tb1 = new JTextField(5); //creates new JTextField
        JLabel e = new JLabel("| $"); //creates new JLabel
        JLabel tb2 = new JLabel("19.99"); //creates new JLabel
        JLabel f = new JLabel("| $"); //creates new JLabel
        JLabel tb3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(tb1, tb2, tb3); //computes total price for specific item
        toolbox.add(tb); //adds label to panel
        toolbox.add(tb1); //adds textField to panel
        toolbox.add(e); //adds label to panel
        toolbox.add(tb2); //adds label to panel
        toolbox.add(f); //adds label to panel
        toolbox.add(tb3); //adds label to panel
        frame.add(toolbox); //adds panel to frame

        JPanel hammer = new JPanel(); //creates new JPanel
        JLabel ha = new JLabel("16oz Hammer               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField ha1 = new JTextField(5); //creates new JTextField
        JLabel g = new JLabel("| $"); //creates new JLabel
        JLabel ha2 = new JLabel("11.98"); //creates new JLabel
        JLabel h = new JLabel("| $"); //creates new JLabel
        JLabel ha3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(ha1, ha2, ha3); //computes total price for specific item
        hammer.add(ha); //adds label to panel
        hammer.add(ha1); //adds textField to panel
        hammer.add(g); //adds label to panel
        hammer.add(ha2); //adds label to panel
        hammer.add(h); //adds label to panel
        hammer.add(ha3); //adds label to panel
        frame.add(hammer); //adds panel to frame

        JPanel ductTape = new JPanel(); //creates new JPanel
        JLabel dt = new JLabel("3 Pack Duct Tape               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField dt1 = new JTextField(5); //creates new JTextField
        JLabel i = new JLabel("| $"); //creates new JLabel
        JLabel dt2 = new JLabel("14.99"); //creates new JLabel
        JLabel j = new JLabel("| $"); //creates new JLabel
        JLabel dt3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(dt1, dt2, dt3); //computes total price for specific item
        ductTape.add(dt); //adds label to panel
        ductTape.add(dt1); //adds textField to panel
        ductTape.add(i); //adds label to panel
        ductTape.add(dt2); //adds label to panel
        ductTape.add(j); //adds label to panel
        ductTape.add(dt3); //adds label to panel
        frame.add(ductTape); //adds panel to frame

        JPanel flashlight = new JPanel(); //creates new JPanel
        JLabel fl = new JLabel("2 Pack Flashlight               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField fl1 = new JTextField(5); //creates new JTextField
        JLabel k = new JLabel("| $"); //creates new JLabel
        JLabel fl2 = new JLabel("9.97"); //creates new JLabel
        JLabel l = new JLabel("| $"); //creates new JLabel
        JLabel fl3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(fl1, fl2, fl3); //computes total price for specific item
        flashlight.add(fl); //adds label to panel
        flashlight.add(fl1); //adds textField to panel
        flashlight.add(k); //adds label to panel
        flashlight.add(fl2); //adds label to panel
        flashlight.add(l); //adds label to panel
        flashlight.add(fl3); //adds label to panel
        frame.add(flashlight); //adds panel to frame

        JPanel pliers = new JPanel(); //creates new JPanel
        JLabel pl = new JLabel("6 Pack Pliers               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField pl1 = new JTextField(5); //creates new JTextField
        JLabel m = new JLabel("| $"); //creates new JLabel
        JLabel pl2 = new JLabel("21.98"); //creates new JLabel
        JLabel n = new JLabel("| $"); //creates new JLabel
        JLabel pl3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(pl1, pl2, pl3); //computes total price for specific item
        pliers.add(pl); //adds label to panel
        pliers.add(pl1); //adds textField to panel
        pliers.add(m); //adds label to panel
        pliers.add(pl2); //adds label to panel
        pliers.add(n); //adds label to panel
        pliers.add(pl3); //adds label to panel
        frame.add(pliers); //adds panel to frame

        JPanel utilityKnife = new JPanel(); //creates new JPanel
        JLabel uk = new JLabel("2 Pack Utility Knife               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField uk1 = new JTextField(5); //creates new JTextField
        JLabel o = new JLabel("| $"); //creates new JLabel
        JLabel uk2 = new JLabel("15.99"); //creates new JLabel
        JLabel p = new JLabel("| $"); //creates new JLabel
        JLabel uk3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(uk1, uk2, uk3); //computes total price for specific item
        utilityKnife.add(uk); //adds label to panel
        utilityKnife.add(uk1); //adds textField to panel
        utilityKnife.add(o); //adds label to panel
        utilityKnife.add(uk2); //adds label to panel
        utilityKnife.add(p); //adds label to panel
        utilityKnife.add(uk3); //adds label to panel
        frame.add(utilityKnife); //adds panel to frame

        JPanel puttyKnife = new JPanel(); //creates new JPanel
        JLabel pk = new JLabel("3 Pack Putty Knife               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField pk1 = new JTextField(5); //creates new JTextField
        JLabel q = new JLabel("| $"); //creates new JLabel
        JLabel pk2 = new JLabel("10.45"); //creates new JLabel
        JLabel r = new JLabel("| $"); //creates new JLabel
        JLabel pk3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(pk1, pk2, pk3); //computes total price for specific item
        puttyKnife.add(pk); //adds label to panel
        puttyKnife.add(pk1); //adds textField to panel
        puttyKnife.add(q); //adds label to panel
        puttyKnife.add(pk2); //adds label to panel
        puttyKnife.add(r); //adds label to panel
        puttyKnife.add(pk3); //adds label to panel
        frame.add(puttyKnife); //adds panel to frame

        JPanel handsaw = new JPanel(); //creates new JPanel
        JLabel hs = new JLabel("15'' Handsaw               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField hs1 = new JTextField(5); //creates new JTextField
        JLabel s = new JLabel("| $"); //creates new JLabel
        JLabel hs2 = new JLabel("9.98"); //creates new JLabel
        JLabel t = new JLabel("| $"); //creates new JLabel
        JLabel hs3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(hs1, hs2, hs3); //computes total price for specific item
        handsaw.add(hs); //adds label to panel
        handsaw.add(hs1); //adds textField to panel
        handsaw.add(s); //adds label to panel
        handsaw.add(hs2); //adds label to panel
        handsaw.add(t); //adds label to panel
        handsaw.add(hs3); //adds label to panel
        frame.add(handsaw); //adds panel to frame

        JPanel adjustWrench = new JPanel(); //creates new JPanel
        JLabel aw = new JLabel("4 Pack Adjustable Wrench               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        JTextField aw1 = new JTextField(5); //creates new JTextField
        JLabel u = new JLabel("| $"); //creates new JLabel
        JLabel aw2 = new JLabel("25.99"); //creates new JLabel
        JLabel v = new JLabel("| $"); //creates new JLabel
        JLabel aw3 = new JLabel(""); //creates new JLabel
        bindUnitsEntered(aw1, aw2, aw3); //computes total price for specific item
        adjustWrench.add(aw); //adds label to panel
        adjustWrench.add(aw1); //adds textField to panel
        adjustWrench.add(u); //adds label to panel
        adjustWrench.add(aw2); //adds label to panel
        adjustWrench.add(v); //adds label to panel
        adjustWrench.add(aw3); //adds label to panel
        frame.add(adjustWrench); //adds panel to frame

        JPanel amtDue = new JPanel(); //creates new JPanel
        JLabel amount = new JLabel("Total Amount Due: "); //creates new JLabel
        JLabel amt = new JLabel (""); //creates new JLabel
        amountDue(sd3, mt3, tb3, ha3, dt3, fl3, pl3, uk3, pk3, hs3, aw3, amt); //computes total amount due
        amtDue.add(amount); //adds label to panel
        amtDue.add(amt); //adds label to panel
        frame.add(amtDue); //adds panel to frame

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
    private static void amountDue(JLabel a, JLabel b, JLabel c, JLabel d, JLabel e, JLabel f, JLabel g, JLabel h,
                                  JLabel i, JLabel j, JLabel k, JLabel l) {
        String aVal = a.getText();
        String bVal = b.getText();
        String cVal = c.getText();
        String dVal = d.getText();
        String eVal = e.getText();
        String fVal = f.getText();
        String gVal = g.getText();
        String hVal = h.getText();
        String iVal = i.getText();
        String jVal = j.getText();
        String kVal = k.getText();
        double aValUnits = Double.parseDouble(aVal);
        double bValUnits = Double.parseDouble(bVal);
        double cValUnits = Double.parseDouble(cVal);
        double dValUnits = Double.parseDouble(dVal);
        double eValUnits = Double.parseDouble(eVal);
        double fValUnits = Double.parseDouble(fVal);
        double gValUnits = Double.parseDouble(gVal);
        double hValUnits = Double.parseDouble(hVal);
        double iValUnits = Double.parseDouble(iVal);
        double jValUnits = Double.parseDouble(jVal);
        double kaValUnits = Double.parseDouble(kVal);
        double amtDue = aValUnits + bValUnits + cValUnits + dValUnits + eValUnits + fValUnits + gValUnits +
                hValUnits + iValUnits + jValUnits + kaValUnits;
        l.setText("" + amtDue);
    }
}