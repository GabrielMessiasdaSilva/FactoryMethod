package abstractfactory;

import javax.swing.JOptionPane;

public class VolksVirtus implements Sedan {
    @Override
    public void exibirPortaMalas() {
        JOptionPane.showMessageDialog(null, "Volks Virtus: Porta-malas de 521L", "Volkswagen Sedan", JOptionPane.INFORMATION_MESSAGE);
    }
}