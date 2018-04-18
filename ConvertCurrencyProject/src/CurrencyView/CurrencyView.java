package CurrencyView;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CurrencyView {

    private JFrame currFrame;
    private JLabel usLabel;
    private JLabel bathLabel;
    private JTextField usTxtField;
    private JTextField bahtTxtField;
    private JButton convertBtn;

    public CurrencyView() {
        initGui();
    }

    public void initGui() {
        currFrame = new JFrame("US to Bath Currency Convert");
        usLabel = new JLabel("US Dollar ($)");
        bathLabel = new JLabel("Bath");
        usTxtField = new JTextField("1");
        bahtTxtField = new JTextField("31.50");
        convertBtn = new JButton("convert");

    }
public void loadCurrencyForm(){
    GridLayout grid = new GridLayout(3,2);
    currFrame.setLayout(grid);
    //1
    currFrame.add(usLabel);
    currFrame.add(usTxtField);
    //2
    currFrame.add(bathLabel);
    currFrame.add(bahtTxtField);
    //3
    currFrame.add(convertBtn);
   
    currFrame.setSize(200, 200);
    currFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    currFrame.setVisible(true);
            

}
}
