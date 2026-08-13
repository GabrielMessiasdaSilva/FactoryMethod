package abstractfactory;

import javax.swing.JOptionPane;

public class FiatCronos implements Sedan {
    @Override
    public void exibirPortaMalas() {
        JOptionPane.showMessageDialog(null, "Fiat Cronos: Porta-malas de 525L", "Fiat Sedan", JOptionPane.INFORMATION_MESSAGE);
    }
}