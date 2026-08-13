package abstractfactory;

import javax.swing.JOptionPane;

public class VolksPolo implements Hatch {
    @Override
    public void exibirConsumo() {
        JOptionPane.showMessageDialog(null, "Volks Polo: Consumo médio de 13.8 km/L", "Volkswagen Hatch", JOptionPane.INFORMATION_MESSAGE);
    }
}