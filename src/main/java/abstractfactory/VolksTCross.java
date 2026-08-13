package abstractfactory;

import javax.swing.JOptionPane;

public class VolksTCross implements SUV {
    @Override
    public void exibirTracao() {
        JOptionPane.showMessageDialog(null, "Volks T-Cross: Tração Dianteira com ESC", "Volkswagen SUV", JOptionPane.INFORMATION_MESSAGE);
    }
}