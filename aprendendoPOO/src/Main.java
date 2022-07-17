public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setCor("Azul");
        carro.setModelo("Gol");
        carro.setCapacidadeTanque(50.0);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Capacidade: " + carro.getCapacidadeTanque());
        System.out.println("valor para enher tanque: " + carro.valorEncherTanque(5.95));
        System.out.println("");
        Carro carro2 =
                new Carro("branco", "Logan", 60.0);

        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade: " + carro2.getCapacidadeTanque());
        System.out.println("valor para enher tanque: " + carro2.valorEncherTanque(5.95));
    }
}