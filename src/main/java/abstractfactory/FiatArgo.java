package abstractfactory;

import javax.swing.JOptionPane;

public class FiatArgo implements Hatch {
    @Override
    public void exibirConsumo() {
        JOptionPane.showMessageDialog(null, "Fiat Argo: Consumo médio de 13.5 km/L", "Fiat Hatch", JOptionPane.INFORMATION_MESSAGE);
    }
}