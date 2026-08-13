package io.github.fatec;
import factorymethod.*;
import abstractfactory.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // TESTE DA PARTE 1 (FACTORY METHOD COM SWING)
        // ==========================================
        JOptionPane.showMessageDialog(null, "Iniciando Teste da PARTE 1 (Factory Method)", "Parte 1", JOptionPane.INFORMATION_MESSAGE);

        // Instanciação dos dois veículos via fábrica sem usar operador 'new' direto em Carro ou Moto
        Veiculo v1 = VeiculoFactory.criarVeiculo("CARRO");
        Veiculo v2 = VeiculoFactory.criarVeiculo("MOTO");

        if (v1 != null) {
            v1.exibirDetalhes();
        }

        if (v2 != null) {
            v2.exibirDetalhes();
        }

        // ==========================================
        // TESTE DAS PARTES 2 E 3 (ABSTRACT FACTORY)
        // ==========================================
        JOptionPane.showMessageDialog(null, "Iniciando Teste das PARTES 2 e 3 (Abstract Factory)", "Partes 2 e 3", JOptionPane.INFORMATION_MESSAGE);

        // Fábrica Fiat
        MontadoraFactory fiatFactory = new FiatFactory();
        Sedan sedanFiat = fiatFactory.criarSedan();
        Hatch hatchFiat = fiatFactory.criarHatch();
        SUV suvFiat = fiatFactory.criarSUV();

        sedanFiat.exibirPortaMalas();
        hatchFiat.exibirConsumo();
        suvFiat.exibirTracao();

        // Fábrica Volkswagen
        MontadoraFactory volksFactory = new VolksFactory();
        Sedan sedanVolks = volksFactory.criarSedan();
        Hatch hatchVolks = volksFactory.criarHatch();
        SUV suvVolks = volksFactory.criarSUV();

        sedanVolks.exibirPortaMalas();
        hatchVolks.exibirConsumo();
        suvVolks.exibirTracao();

        JOptionPane.showMessageDialog(null, "Execução concluída com sucesso!", "Fim", JOptionPane.INFORMATION_MESSAGE);
    }
}