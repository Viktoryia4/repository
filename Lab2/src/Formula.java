import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formula extends JFrame {
    private static double summ;
    public double SUMM(Double x, Double y,Double z){summ=x+y+z;return summ; }
    
    private void addRadioButton(String buttonName, final int formulaId)
    {
        JRadioButton button = new JRadioButton(buttonName);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                MainFrame.this.formulaId = formulaId;
                //imagePane.updateUI();
            }
        });
        radioButtons.add(button);
        hboxFormulaType.add(button);
    }
    
    public Formula(){
        // Создать кнопку «SUMM»
    }
        JButton buttonCalc = new JButton("SUMM");
// Определить и зарегистрировать обработчик нажатия на кнопку
        buttonCalc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {

                try {
                    Double x = Double.parseDouble(textFieldX.getText());
                    Double y = Double.parseDouble(textFieldY.getText());
                    Double z = Double.parseDouble(textFieldZ.getText());

                    Double result;
                    if (formulaId == 1)
                        result = SUMM(x, y);


// Установить текст надписи равным результату
                    labelResult.setText(result.toString());
                } /*catch (NumberFormatException ex) {
// В случае исключительной ситуации показать сообщение
                    JOptionPane.showMessageDialog(Formula.this, "Ошибка в
                            формате записи числа с плавающей точкой", "Ошибочный формат числа",
                            JOptionPane.WARNING_MESSAGE);
                }*/
            } 
        }
        
       
                JButton buttonCalc = new JButton("MC");
// Определить и зарегистрировать обработчик нажатия на кнопку
        buttonCalc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {

                try {
                    Double x = Double.parseDouble(textFieldX.getText());
                    Double y = Double.parseDouble(textFieldY.getText());
                    Double z = Double.parseDouble(textFieldZ.getText());

                    Double result;
                    if (formulaId==1)
                        result = SUMM(x, y);


// Установить текст надписи равным результату
                    labelResult.setText(result.toString());
                } /*catch (NumberFormatException ex) {
// В случае исключительной ситуации показать сообщение
                    JOptionPane.showMessageDialog(Formula.this, "Ошибка в
                            формате записи числа с плавающей точкой", "Ошибочный формат числа",
                            JOptionPane.WARNING_MESSAGE);
                }*/
            }
        }
                JButton buttonCalc = new JButton("M+");
// Определить и зарегистрировать обработчик нажатия на кнопку
        buttonCalc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
            {

                try {
                    Double x = Double.parseDouble(textFieldX.getText());
                    Double y = Double.parseDouble(textFieldY.getText());
                    Double z = Double.parseDouble(textFieldZ.getText());

                    Double result;
                    if (formulaId==1)
                        result = SUMM(x, y);


// Установить текст надписи равным результату
                    labelResult.setText(result.toString());
                } /*catch (NumberFormatException ex) {
// В случае исключительной ситуации показать сообщение
                    JOptionPane.showMessageDialog(Formula.this, "Ошибка в
                            формате записи числа с плавающей точкой", "Ошибочный формат числа",
                            JOptionPane.WARNING_MESSAGE);
                }*/
            }
        }
}
