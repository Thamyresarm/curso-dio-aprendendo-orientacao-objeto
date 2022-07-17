public class Main {
    public static void main(String[] args) {

    /*    Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente1 = new Funcionario();
        Gerente gerente1 = (Gerente) new Funcionario();*/

        Funcionario[] funcionarios = new Funcionario[]{
                new Gerente(),
                new Vendedor(),
                new Faxineiro(),
                new Funcionario()
        };

        for (Funcionario func: funcionarios) {
            func.metodo1();
        }

        System.out.println(" ");

        for (Funcionario func: funcionarios) {
            func.metodo2();
        }
    }
}