package factorymethod;

import javax.swing.JOptionPane;

public class Moto implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(
                null,
                "Detalhes da Moto: Motocicleta com 2 rodas.",
                "Moto Concreta",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}