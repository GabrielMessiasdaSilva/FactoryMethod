package factorymethod;

import javax.swing.JOptionPane;

public class Carro implements Veiculo {
    @Override
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(
                null,
                "Detalhes do Carro: Veículo de passeio com 4 rodas.",
                "Carro Concreto",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}