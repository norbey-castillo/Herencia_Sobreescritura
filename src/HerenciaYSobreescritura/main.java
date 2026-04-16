package HerenciaYSobreescritura;

public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan", "12345");

        FacturaContado contado = new FacturaContado(1, cliente, 1000, 100);
        FacturaCredito credito = new FacturaCredito(2, cliente, 1000, 200, 12);

        System.out.println("Total contado: " + contado.calcularTotal());
        System.out.println("Total crédito: " + credito.calcularTotal());
    }
}