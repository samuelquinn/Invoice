import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.*;

/**
 * Samuel Quinn
 * 12/5/20
 */

//Plan
    // 1. Make Invoice JFrame.
    // 2. Move all of main to Invoice's constructor.
    // 3. Capture pertinent ui elements as members of Invoice.
    // 4. Create Invoice in main and display it.

class Invoice extends JFrame {
    private final JTextField qScrewdriver;
    private final JLabel tScrewdriver;
    private final JTextField qMeasuringTape;
    private final JLabel tMeasuringTape;
    private final JTextField qToolbox;
    private final JLabel tToolbox;
    private final JTextField qHammer;
    private final JLabel tHammer;
    private final JTextField qDuctTape;
    private final JLabel tDuctTape;
    private final JTextField qFlashlight;
    private final JLabel tFlashlight;
    private final JTextField qPliers;
    private final JLabel tPliers;
    private final JTextField qUtilityKnife;
    private final JLabel tUtilityKnife;
    private final JTextField qPuttyKnife;
    private final JLabel tPuttyKnife;
    private final JTextField qHandsaw;
    private final JLabel tHandsaw;
    private final JTextField qAdjustWrench;
    private final JLabel tAdjustWrench;
    private final JLabel amount;

    public Invoice() {
        super("Tools Invoice");
        GridLayout layout = new GridLayout(20, 4); //format for frame
        setLayout(layout);

        JPanel frameTitle = new JPanel(); //creates new JPanel
        JLabel title = new JLabel("Tools Invoice"); //creates new JLabel
        frameTitle.add(title); //adds label to panel
        add(frameTitle); //adds panel to frame

        JPanel billingAddress = new JPanel(); //creates new JPanel
        JLabel ba = new JLabel("Enter Billing Address: "); //creates new JLabel
        JTextField ba1 = new JTextField(50); //creates new JTextField
        billingAddress.add(ba); //adds label to panel
        billingAddress.add(ba1); //adds textField to panel
        add(billingAddress); //adds panel to frame

        JPanel headers = new JPanel(); //creates new JPanel
        JLabel labels = new JLabel("Description:                       " + //creates new JLabel - for format
                "          Quantity | Unit Price | Total"); //for format
        headers.add(labels); //adds label to panel
        add(headers); //adds panel to frame

        JPanel screwdriver = new JPanel(); //creates new JPanel
        JLabel sd = new JLabel("57 PC Screwdriver Kit               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qScrewdriver = new JTextField(5); //creates new JTextField
        JLabel a = new JLabel("| $"); //creates new JLabel
        JLabel sd2 = new JLabel("35.99"); //creates new JLabel
        JLabel b = new JLabel("| $"); //creates new JLabel
        tScrewdriver = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qScrewdriver, sd2, tScrewdriver); //computes total price for specific item
        screwdriver.add(sd); //adds label to panel
        screwdriver.add(qScrewdriver); //adds textField to panel
        screwdriver.add(a); //adds label to panel
        screwdriver.add(sd2); //adds label to panel
        screwdriver.add(b); //adds label to panel
        screwdriver.add(tScrewdriver); //adds label to panel
        add(screwdriver); //adds panel to frame

        JPanel measuringTape = new JPanel(); //creates new JPanel
        JLabel mt = new JLabel("12' Measuring Tape               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qMeasuringTape = new JTextField(5); //creates new JTextField
        JLabel c = new JLabel("| $"); //creates new JLabel
        JLabel mt2 = new JLabel("7.90"); //creates new JLabel
        JLabel d = new JLabel("| $"); //creates new JLabel
        tMeasuringTape = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qMeasuringTape, mt2, tMeasuringTape); //computes total price for specific item
        measuringTape.add(mt); //adds label to panel
        measuringTape.add(qMeasuringTape); //adds textField to panel
        measuringTape.add(c); //adds label to panel
        measuringTape.add(mt2); //adds label to panel
        measuringTape.add(d); //adds label to panel
        measuringTape.add(tMeasuringTape); //adds label to panel
        add(measuringTape); //adds panel to frame

        JPanel toolbox = new JPanel(); //creates new JPanel
        JLabel tb = new JLabel("14'' Toolbox               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qToolbox = new JTextField(5); //creates new JTextField
        JLabel e = new JLabel("| $"); //creates new JLabel
        JLabel tb2 = new JLabel("19.99"); //creates new JLabel
        JLabel f = new JLabel("| $"); //creates new JLabel
        tToolbox = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qToolbox, tb2, tToolbox); //computes total price for specific item
        toolbox.add(tb); //adds label to panel
        toolbox.add(qToolbox); //adds textField to panel
        toolbox.add(e); //adds label to panel
        toolbox.add(tb2); //adds label to panel
        toolbox.add(f); //adds label to panel
        toolbox.add(tToolbox); //adds label to panel
        add(toolbox); //adds panel to frame

        JPanel hammer = new JPanel(); //creates new JPanel
        JLabel ha = new JLabel("16oz Hammer               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qHammer = new JTextField(5); //creates new JTextField
        JLabel g = new JLabel("| $"); //creates new JLabel
        JLabel ha2 = new JLabel("11.98"); //creates new JLabel
        JLabel h = new JLabel("| $"); //creates new JLabel
        tHammer = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qHammer, ha2, tHammer); //computes total price for specific item
        hammer.add(ha); //adds label to panel
        hammer.add(qHammer); //adds textField to panel
        hammer.add(g); //adds label to panel
        hammer.add(ha2); //adds label to panel
        hammer.add(h); //adds label to panel
        hammer.add(tHammer); //adds label to panel
        add(hammer); //adds panel to frame

        JPanel ductTape = new JPanel(); //creates new JPanel
        JLabel dt = new JLabel("3 Pack Duct Tape               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qDuctTape = new JTextField(5); //creates new JTextField
        JLabel i = new JLabel("| $"); //creates new JLabel
        JLabel dt2 = new JLabel("14.99"); //creates new JLabel
        JLabel j = new JLabel("| $"); //creates new JLabel
        tDuctTape = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qDuctTape, dt2, tDuctTape); //computes total price for specific item
        ductTape.add(dt); //adds label to panel
        ductTape.add(qDuctTape); //adds textField to panel
        ductTape.add(i); //adds label to panel
        ductTape.add(dt2); //adds label to panel
        ductTape.add(j); //adds label to panel
        ductTape.add(tDuctTape); //adds label to panel
        add(ductTape); //adds panel to frame

        JPanel flashlight = new JPanel(); //creates new JPanel
        JLabel fl = new JLabel("2 Pack Flashlight               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qFlashlight = new JTextField(5); //creates new JTextField
        JLabel k = new JLabel("| $"); //creates new JLabel
        JLabel fl2 = new JLabel("9.97"); //creates new JLabel
        JLabel l = new JLabel("| $"); //creates new JLabel
        tFlashlight = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qFlashlight, fl2, tFlashlight); //computes total price for specific item
        flashlight.add(fl); //adds label to panel
        flashlight.add(qFlashlight); //adds textField to panel
        flashlight.add(k); //adds label to panel
        flashlight.add(fl2); //adds label to panel
        flashlight.add(l); //adds label to panel
        flashlight.add(tFlashlight); //adds label to panel
        add(flashlight); //adds panel to frame

        JPanel pliers = new JPanel(); //creates new JPanel
        JLabel pl = new JLabel("6 Pack Pliers               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qPliers = new JTextField(5); //creates new JTextField
        JLabel m = new JLabel("| $"); //creates new JLabel
        JLabel pl2 = new JLabel("21.98"); //creates new JLabel
        JLabel n = new JLabel("| $"); //creates new JLabel
        tPliers = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qPliers, pl2, tPliers); //computes total price for specific item
        pliers.add(pl); //adds label to panel
        pliers.add(qPliers); //adds textField to panel
        pliers.add(m); //adds label to panel
        pliers.add(pl2); //adds label to panel
        pliers.add(n); //adds label to panel
        pliers.add(tPliers); //adds label to panel
        add(pliers); //adds panel to frame

        JPanel utilityKnife = new JPanel(); //creates new JPanel
        JLabel uk = new JLabel("2 Pack Utility Knife               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qUtilityKnife = new JTextField(5); //creates new JTextField
        JLabel o = new JLabel("| $"); //creates new JLabel
        JLabel uk2 = new JLabel("15.99"); //creates new JLabel
        JLabel p = new JLabel("| $"); //creates new JLabel
        tUtilityKnife = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qUtilityKnife, uk2, tUtilityKnife); //computes total price for specific item
        utilityKnife.add(uk); //adds label to panel
        utilityKnife.add(qUtilityKnife); //adds textField to panel
        utilityKnife.add(o); //adds label to panel
        utilityKnife.add(uk2); //adds label to panel
        utilityKnife.add(p); //adds label to panel
        utilityKnife.add(tUtilityKnife); //adds label to panel
        add(utilityKnife); //adds panel to frame

        JPanel puttyKnife = new JPanel(); //creates new JPanel
        JLabel pk = new JLabel("3 Pack Putty Knife               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qPuttyKnife = new JTextField(5); //creates new JTextField
        JLabel q = new JLabel("| $"); //creates new JLabel
        JLabel pk2 = new JLabel("10.45"); //creates new JLabel
        JLabel r = new JLabel("| $"); //creates new JLabel
        tPuttyKnife = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qPuttyKnife, pk2, tPuttyKnife); //computes total price for specific item
        puttyKnife.add(pk); //adds label to panel
        puttyKnife.add(qPuttyKnife); //adds textField to panel
        puttyKnife.add(q); //adds label to panel
        puttyKnife.add(pk2); //adds label to panel
        puttyKnife.add(r); //adds label to panel
        puttyKnife.add(tPuttyKnife); //adds label to panel
        add(puttyKnife); //adds panel to frame

        JPanel handsaw = new JPanel(); //creates new JPanel
        JLabel hs = new JLabel("15'' Handsaw               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qHandsaw = new JTextField(5); //creates new JTextField
        JLabel s = new JLabel("| $"); //creates new JLabel
        JLabel hs2 = new JLabel("9.98"); //creates new JLabel
        JLabel t = new JLabel("| $"); //creates new JLabel
        tHandsaw = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qHandsaw, hs2, tHandsaw); //computes total price for specific item
        handsaw.add(hs); //adds label to panel
        handsaw.add(qHandsaw); //adds textField to panel
        handsaw.add(s); //adds label to panel
        handsaw.add(hs2); //adds label to panel
        handsaw.add(t); //adds label to panel
        handsaw.add(tHandsaw); //adds label to panel
        add(handsaw); //adds panel to frame

        JPanel adjustWrench = new JPanel(); //creates new JPanel
        JLabel aw = new JLabel("4 Pack Adjustable Wrench               " + //creates new JLabel - spaces for format
                "     "); //spaces for format
        qAdjustWrench = new JTextField(5); //creates new JTextField
        JLabel u = new JLabel("| $"); //creates new JLabel
        JLabel aw2 = new JLabel("25.99"); //creates new JLabel
        JLabel v = new JLabel("| $"); //creates new JLabel
        tAdjustWrench = new JLabel(""); //creates new JLabel
        bindUnitsEntered(qAdjustWrench, aw2, tAdjustWrench); //computes total price for specific item
        adjustWrench.add(aw); //adds label to panel
        adjustWrench.add(qAdjustWrench); //adds textField to panel
        adjustWrench.add(u); //adds label to panel
        adjustWrench.add(aw2); //adds label to panel
        adjustWrench.add(v); //adds label to panel
        adjustWrench.add(tAdjustWrench); //adds label to panel
        add(adjustWrench); //adds panel to frame

        JPanel amtDue = new JPanel(); //creates new JPanel
        JLabel amt = new JLabel("Total Amount Due: $"); //creates new JLabel
        amount = new JLabel(""); //creates new JLabel
        amtDue.add(amt); //adds label to panel
        amtDue.add(amount); //adds label to panel
        add(amtDue); //adds panel to frame
        totalAmount();
    }

    public static void main(String[] args) {
        Invoice frame = new Invoice();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes window
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //sets dimensions for window
        frame.setVisible(true); //makes frame visible
    }

    private void bindUnitsEntered(JTextField units, JLabel pricePerUnit, JLabel total) {
        units.addActionListener(e -> {
            String unitsVal = units.getText();
            String pricePerUnitVal = pricePerUnit.getText();
            double uni = Strings.convertStringToDouble(unitsVal);
            double pri = Strings.convertStringToDouble(pricePerUnitVal);
            double amt = uni * pri;
            total.setText("" + amt);
            totalAmount();
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



    private void totalAmount()
    {
        double totalAmount = 0.0;
        String screwdriverVal = tScrewdriver.getText();
        String measuringTapeVal = tMeasuringTape.getText();
        String toolboxVal = tToolbox.getText();
        String hammerVal = tHammer.getText();
        String ductTapeVal = tDuctTape.getText();
        String flashlightVal = tFlashlight.getText();
        String pliersVal = tPliers.getText();
        String utilityKnifeVal = tUtilityKnife.getText();
        String puttyKnifeVal = tPuttyKnife.getText();
        String handsawVal = tHandsaw.getText();
        String adjustWrenchVal = tAdjustWrench.getText();
        double ScrewdriverVal = Strings.convertStringToDouble(screwdriverVal);
        double MeasuringTapeVal = Strings.convertStringToDouble(measuringTapeVal);
        double ToolboxVal = Strings.convertStringToDouble(toolboxVal);
        double HammerVal = Strings.convertStringToDouble(hammerVal);
        double DuctTapeVal = Strings.convertStringToDouble(ductTapeVal);
        double FlashlightVal = Strings.convertStringToDouble(flashlightVal);
        double PliersVal = Strings.convertStringToDouble(pliersVal);
        double UtilityKnifeVal = Strings.convertStringToDouble(utilityKnifeVal);
        double PuttyKnifeVal = Strings.convertStringToDouble(puttyKnifeVal);
        double HandsawVal = Strings.convertStringToDouble(handsawVal);
        double AdjustWrenchVal = Strings.convertStringToDouble(adjustWrenchVal);
        totalAmount += ScrewdriverVal + MeasuringTapeVal + ToolboxVal + HammerVal + DuctTapeVal + FlashlightVal + PliersVal +
                UtilityKnifeVal + PuttyKnifeVal + HandsawVal + AdjustWrenchVal;
        amount.setText("" + totalAmount);
    }
}