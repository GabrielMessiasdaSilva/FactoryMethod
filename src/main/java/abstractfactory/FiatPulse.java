package abstractfactory;

import javax.swing.JOptionPane;

public class FiatPulse implements SUV {
    @Override
    public void exibirTracao() {
        JOptionPane.showMessageDialog(null, "Fiat Pulse: Tração Dianteira com TC+", "Fiat SUV", JOptionPane.INFORMATION_MESSAGE);
    }
}