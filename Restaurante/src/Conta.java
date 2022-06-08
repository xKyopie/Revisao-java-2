import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Conta {

     
     private HashMap<String, Integer> pratos;


    public Conta() {
        //inicializando o HashMap
        pratos = new HashMap<>();
    }


     // 1. adicionar um pedido informando o nome do prato, e a sua quantidade.
    public void adicionarPrato(String pratoAdicionado, int quantidade){
        pratos.put(pratoAdicionado, quantidade);

    }



    // 2. seu preço + valor corrente da conta. 
    //chamando metodo de outra classe:
    public void valorDaConta(){
        // Iterator<Entry<String,Integer>> it = pratos.entrySet().iterator();
        Iterator it = pratos.entrySet().iterator();

        Double valorTotal = 0.0;
        
    

        while(it.hasNext()){
            // Entry<String, Integer> parKeyValue = it.next();
            // Entry<String, Integer> parKeyValue = s(Entry)it.next();
            Entry parKeyValue = (Entry)it.next();
            valorTotal += Restaurante.pesquisandoValor((String)parKeyValue.getKey())
                            * (Integer) parKeyValue.getValue();
        }
    }


    // 3. imprimir o registro de todos os pratos solicitados 
    public void imprimirConta(){
        // https://pt.stackoverflow.com/questions/510792/como-formatar-uma-string-para-adicionar-espa%C3%A7os-%C3%A0-direita-numa-tabela-impressa
        String format = "#%d \t %6s \t %-4.1f \t %-1d \t %-2f \n";

        String formatCabecalho = "%4s \t %4s \t %4s \t %4s \t %4s \n";

        System.out.format(formatCabecalho, "Num", "Descrição", "Valor Un", "Qtd", "Total Parcial");

        // Iterator<Entry<String,Integer>> it = pratos.entrySet().iterator();
        Iterator it = pratos.entrySet().iterator();
        int count = 1;
        System.out.println("---------------------------------------");
        while(it.hasNext()){
            Entry<String, Integer> parKeyValue = (Entry) it.next();
            double valorPrato = Restaurante.pesquisandoValor((String)parKeyValue.getKey());
            double valorParcial = valorPrato * parKeyValue.getValue();
            System.out.format(format, count, parKeyValue.getKey(), valorPrato, parKeyValue.getValue(), valorParcial);
            count++;
        }
        System.out.println("---------------------------------------");

    }

  

  
}
