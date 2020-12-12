import javax.swing.*; //imports javax.swing.*
import javax.swing.text.AttributeSet; //imports javax.swing.text.AttributeSet
import javax.swing.text.BadLocationException; //imports javax.swing.text.BadLocationException
import javax.swing.text.DocumentFilter; //imports javax.swing.text.DocumentFilter
import javax.swing.text.PlainDocument; //imports javax.swing.text.PlainDocument
import java.awt.*; //imports java.awt.*

/**
 * Samuel Quinn
 * 12/5/20
 */

class Invoice extends JFrame {
    private final JTextField qScrewdriver; //new member of class
    private final JLabel tScrewdriver; //new member of class
    private final JTextField qMeasuringTape; //new member of class
    private final JLabel tMeasuringTape; //new member of class
    private final JTextField qToolbox; //new member of class
    private final JLabel tToolbox; //new member of class
    private final JTextField qHammer; //new member of class
    private final JLabel tHammer; //new member of class
    private final JTextField qDuctTape; //new member of class
    private final JLabel tDuctTape; //new member of class
    private final JTextField qFlashlight; //new member of class
    private final JLabel tFlashlight; //new member of class
    private final JTextField qPliers; //new member of class
    private final JLabel tPliers; //new member of class
    private final JTextField qUtilityKnife; //new member of class
    private final JLabel tUtilityKnife; //new member of class
    private final JTextField qPuttyKnife; //new member of class
    private final JLabel tPuttyKnife; //new member of class
    private final JTextField qHandsaw; //new member of class
    private final JLabel tHandsaw; //new member of class
    private final JTextField qAdjustWrench; //new member of class
    private final JLabel tAdjustWrench; //new member of class
    private final JLabel amount; //new member of class

    public Invoice() //constructor to initialize all parts of frame
    {
        super("Tools Invoice");
        GridLayout layout = new GridLayout(20, 4); //format for frame
        setLayout(layout); //sets layout

        JPanel frameTitle = new JPanel(); //creates new JPanel
        JLabel title = new JLabel("Tools Invoice"); //creates new JLabel
        frameTitle.add(title); //adds label to panel
        add(frameTitle); //adds panel to frame

        JPanel extra = new JPanel(); //creates new JPanel - to create space between title and address
        JLabel extraSpace = new JLabel(""); //creates new JLabel - to create space between title and address
        extra.add(extraSpace); //adds label to panel
        add(extra); //adds panel to frame

        JPanel billingAddress = new JPanel(); //creates new JPanel
        JLabel ba = new JLabel("Enter Billing Address: "); //creates new JLabel
        JTextField ba1 = new JTextField(50); //creates new JTextField
        billingAddress.add(ba); //adds label to panel
        billingAddress.add(ba1); //adds textField to panel
        add(billingAddress); //adds panel to frame

        JPanel billingAddressVal = new JPanel(); //creates new JPanel
        JLabel baVal = new JLabel("Billing Address: "); //creates new JLabel
        JLabel baV = new JLabel(""); //creates new JLabel
        billingAddressRepeat(ba1, baV); //prints user address input
        billingAddressVal.add(baVal); //adds label to panel
        billingAddressVal.add(baV); //adds label to panel
        add(billingAddressVal); //adds panel to frame

        JPanel extra2 = new JPanel(); //creates new JPanel - to create space between address and items
        JLabel extraSpace2 = new JLabel(""); //creates new JLabel - to create space between address and items
        extra2.add(extraSpace2); //adds label to panel
        add(extra2); //adds panel to frame

        JPanel headers = new JPanel(); //creates new JPanel
        JLabel labels = new JLabel("Description:                            " + //creates new JLabel - for format
                "                       Quantity | Unit Price | Total"); //for format
        headers.add(labels); //adds label to panel
        add(headers); //adds panel to frame

        JPanel screwdriver = new JPanel(); //creates new JPanel
        JLabel sd = new JLabel("57 PC Screwdriver Kit                " + //creates new JLabel - spaces for format
                "            "); //spaces for format
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
        JLabel mt = new JLabel("12' Measuring Tape                  " + //creates new JLabel - spaces for format
                "               "); //spaces for format
        qMeasuringTape = new JTextField(5); //creates new JTextField
        JLabel c = new JLabel("| $"); //creates new JLabel
        JLabel mt2 = new JLabel("7.90"); //creates new JLabel
        JLabel d = new JLabel(" | $"); //creates new JLabel
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
        JLabel tb = new JLabel("14'' Toolbox                     " + //creates new JLabel - spaces for format
                "                         "); //spaces for format
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
        JLabel ha = new JLabel("16oz Hammer                         " + //creates new JLabel - spaces for format
                "                  "); //spaces for format
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
        JLabel dt = new JLabel("3 Pack Duct Tape                      " + //creates new JLabel - spaces for format
                "             "); //spaces for format
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
                "                    "); //spaces for format
        qFlashlight = new JTextField(5); //creates new JTextField
        JLabel k = new JLabel("| $"); //creates new JLabel
        JLabel fl2 = new JLabel("9.97"); //creates new JLabel
        JLabel l = new JLabel(" | $"); //creates new JLabel
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
                "                           "); //spaces for format
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
                "                "); //spaces for format
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
                "                "); //spaces for format
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
                "                         "); //spaces for format
        qHandsaw = new JTextField(5); //creates new JTextField
        JLabel s = new JLabel("| $"); //creates new JLabel
        JLabel hs2 = new JLabel("9.98"); //creates new JLabel
        JLabel t = new JLabel(" | $"); //creates new JLabel
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
        JLabel aw = new JLabel("4 Pack Adjustable Wrench             " + //creates new JLabel - spaces for format
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

        JPanel extra3 = new JPanel(); //creates new JPanel - to create space between items and total amount due
        JLabel extraSpace3 = new JLabel(""); //creates new JLabel - to create space between items and total amount due
        extra2.add(extraSpace3); //adds label to panel
        add(extra3); //adds panel to frame

        JPanel amtDue = new JPanel(); //creates new JPanel
        JLabel amt = new JLabel("Total Amount Due: $"); //creates new JLabel
        amount = new JLabel(""); //creates new JLabel
        amtDue.add(amt); //adds label to panel
        amtDue.add(amount); //adds label to panel
        add(amtDue); //adds panel to frame
        totalAmount(); //sets all total price labels to a default value of 0
    }

    public static void main(String[] args) //main method
    {
        Invoice frame = new Invoice(); //builds new frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes window
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //sets dimensions for window
        frame.setVisible(true); //makes frame visible
    }

    private void bindUnitsEntered(JTextField units, JLabel pricePerUnit, JLabel total) //method to compute total price for each item and price overall
    {
        units.addActionListener(e ->  //adds ActionListener to units
        {
            String unitsVal = units.getText(); //String to collect units value
            String pricePerUnitVal = pricePerUnit.getText(); //String to collect pricePerUnit value
            double uni = Strings.convertStringToDouble(unitsVal); //converts String to double
            double pri = Strings.convertStringToDouble(pricePerUnitVal); //converts String to double
            double amt = uni * pri; //computes total price for each item
            total.setText("" + amt); //prints total price for each item
            totalAmount(); //updates price overall
        });
        PlainDocument doc = (PlainDocument) units.getDocument(); //adds text reader to units
        doc.setDocumentFilter(new DocumentFilter() //adds DocumentFilter to doc
        {
            @Override //overrides
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException //makes sure numerical input is added
            {
                if (Strings.isNumeric(string)) //checks if input is numerical
                {
                    super.insertString(fb, offset, string, attr); //allows user's input
                }
            }

            @Override //overrides
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException //makes sure numerical input is replaced with a numerical input
            {
                if (text == null || Strings.isNumeric(text)) //checks if replacement is numerical
                {
                    super.replace(fb, offset, length, text, attrs); //allows replacement
                }
            }
        });
    }

    private void billingAddressRepeat(JTextField billingAddress, JLabel billAddress) //prints user Address input
    {
        billingAddress.addActionListener(e -> //adds ActionListener to billingAddress
        {
            String baV = billingAddress.getText(); //String to get billingAddress value
            billAddress.setText("" + baV); //sets text of JLabel to print address input
        });
    }

    private void totalAmount() //computes total amount due
    {
        double totalAmount = 0.0; //creates new double variable
        String screwdriverVal = tScrewdriver.getText(); //String to get tScrewdriver value
        String measuringTapeVal = tMeasuringTape.getText(); //String to get tMeasuringTape value
        String toolboxVal = tToolbox.getText(); //String to get tToolbox value
        String hammerVal = tHammer.getText(); //String to get tHammer value
        String ductTapeVal = tDuctTape.getText(); //String to get tDuctTape value
        String flashlightVal = tFlashlight.getText(); //String to get tFlashlight value
        String pliersVal = tPliers.getText(); //String to get tPliers value
        String utilityKnifeVal = tUtilityKnife.getText(); //String to get tUtilityKnife value
        String puttyKnifeVal = tPuttyKnife.getText(); //String to get tPuttyKnife value
        String handsawVal = tHandsaw.getText(); //String to get tHandsaw value
        String adjustWrenchVal = tAdjustWrench.getText(); //String to get tAdjustWrench value
        double ScrewdriverVal = Strings.convertStringToDouble(screwdriverVal); //converts String to double
        double MeasuringTapeVal = Strings.convertStringToDouble(measuringTapeVal); //converts String to double
        double ToolboxVal = Strings.convertStringToDouble(toolboxVal); //converts String to double
        double HammerVal = Strings.convertStringToDouble(hammerVal); //converts String to double
        double DuctTapeVal = Strings.convertStringToDouble(ductTapeVal); //converts String to double
        double FlashlightVal = Strings.convertStringToDouble(flashlightVal); //converts String to double
        double PliersVal = Strings.convertStringToDouble(pliersVal); //converts String to double
        double UtilityKnifeVal = Strings.convertStringToDouble(utilityKnifeVal); //converts String to double
        double PuttyKnifeVal = Strings.convertStringToDouble(puttyKnifeVal); //converts String to double
        double HandsawVal = Strings.convertStringToDouble(handsawVal); //converts String to double
        double AdjustWrenchVal = Strings.convertStringToDouble(adjustWrenchVal); //converts String to double
        totalAmount += ScrewdriverVal + MeasuringTapeVal + ToolboxVal + HammerVal + DuctTapeVal + FlashlightVal + PliersVal + //computes total amount due
                UtilityKnifeVal + PuttyKnifeVal + HandsawVal + AdjustWrenchVal; //computes total amount due
        amount.setText("" + totalAmount); //prints total amount due
    }
}