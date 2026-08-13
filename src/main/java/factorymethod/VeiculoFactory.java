package factorymethod;

public class VeiculoFactory {
    public static Veiculo criarVeiculo(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("CARRO")) {
            return new Carro();
        } else if (tipo.equalsIgnoreCase("MOTO")) {
            return new Moto();
        }
        return null;
    }
}