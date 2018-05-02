package CurrencyView;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CurrencyView {

    private JFrame currFrame;
    private JLabel usLabel;
    private JLabel bathLabel;
    private JTextField usTxtField;
    private JTextField bahtTxtField;
    private JButton convertBtn;
    private JPanel jpanal;

    public CurrencyView() {
        initGui();
    }

    public void initGui() {
        currFrame = new JFrame("US to Bath Currency Convert");
        usLabel = new JLabel("US Dollar ($)");
        bathLabel = new JLabel("Bath");
        usTxtField = new JTextField("1");
        bahtTxtField = new JTextField("31.50");
        jpanal = new JPanel();;
        convertBtn = new JButton("convert");

    }

    public void loadCurrencyForm() {
        GridLayout grid = new GridLayout(2, 2);
        JPanel currencypanal = new JPanel();
        currencypanal.setLayout(grid);

        //1
        currencypanal.add(usLabel);
        currencypanal.add(usTxtField);
        //2
        currencypanal.add(bathLabel);
        currencypanal.add(bahtTxtField);

        //Convert Panel
        JPanel convertPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

//    jpanal.add(currencypanal ,BorderLayout.NORTH);
//   currencypanal.add(convertBtn);
        ConvertListener cvtListeber = new ConvertListener(usTxtField,bahtTxtField);
        convertBtn.addActionListener(cvtListeber);
        convertPanel.add(convertBtn);

        currFrame.add(c​urrencypanal, BorderLayout.NORTH);
        currFrame.add(c​onvertPanel, BorderLayout.CENTER);

        currFrame.setSize(200, 200);
        currFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        currFrame.setVisible(true);

    }
}
