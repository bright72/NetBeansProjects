package CurrencyView;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ConvertListener implements ActionListener{
   private JTextField usTxtField;
   private JTextField bathTxtField;

    public ConvertListener(JTextField usTxt, JTextField bathTxt) {
        this.usTxtField = usTxt;
        this.bathTxtField = bathTxt;
    }
   
    public void actionPerformed (ActionEvent e){
        System.out.println(e.getActionCommand());
        double usCurr = Double.parseDouble( usTxtField.getText());
        double bathCurr = usCurr *31.5;
        bathTxtField.setText(bathCurr+"");
    }
   
}
