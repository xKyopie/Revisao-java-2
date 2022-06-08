
public class Mesa {

    private boolean disponivel;
    private boolean contaAberta;
    private String garcom;
    private Conta conta;

    //construtor
    public Mesa(boolean disponivel, String garcom, boolean contaAberta) {
        this.disponivel = disponivel;
        this.garcom = garcom;
        this.contaAberta = contaAberta;
    }

      // 1. verificar se a mesa ta com conta aberta ou fechada,
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }



    // 2. Conta aberta para registrar os seus pedidos. 
    public boolean isContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean contaAberta) {
        this.contaAberta = contaAberta;
    }

    public String getGarcom() {
        return garcom;
    }

    public void setGarcom(String garcom) {
        this.garcom = garcom;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    


    
}
