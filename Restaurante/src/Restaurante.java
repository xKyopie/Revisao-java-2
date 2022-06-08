import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Restaurante {
    
     private ArrayList<Mesa> mesas;
     private static HashMap<String, Double> cardapio = new HashMap<>();

    //Inicializando Array
    public Restaurante() {
        mesas = new ArrayList<>();
    }


     //1. adicionar o cardápio com preço de cada prato + n mesas.

    //adicionando um objeto dentro do Array
    public void adicionarMesa(Mesa mesa){
        mesas.add(mesa);
    }

    //adicionando um objeto dentro do HashMap
    public static void adicionarPrato(String nome, Double valor){
       cardapio.put(nome, valor);
    }
    

    // 2. pesquisar o preço de um prato específico
   public static Double pesquisandoValor(String nomeBusca){
       return cardapio.get(nomeBusca);
   }


    // 3. verificar se uma mesa está disponível 
   
   
    // 4. solicitar a conta de uma das mesas.
    
}
