import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        //registrando os pratos 
        Restaurante rest = new Restaurante();
        Restaurante.adicionarPrato("Lasanha", 22.90);

        Mesa mesa = new Mesa(true, "Janderson", true);
        rest.adicionarMesa(mesa);
        Conta conta = new Conta();
        conta.adicionarPrato("Lasanha", 3);
        mesa.setConta(conta);

        conta.imprimirConta();

        //criando um cardapio (os pratos com os valores e a mesa)
    }
}