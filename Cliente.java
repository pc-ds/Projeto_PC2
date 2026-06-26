import java.util.ArrayList;
import java.util.bool;

public class Cliente extends Pessoa {
    private int telefone;
    private ArrayList<Animal> animais;
    private ArrayList<Consulta> minhas_consultas; //ele vai ter acesso as consultas que ele fez ou que estão pendente ainda

    public Cliente (String nome, String CPF, int telefone) {
        super(nome, CPF);
        this.telefone = telefone;
        this.animais = new ArrayList<>();
    }

    //da para fazer no sistema para fazer do cliente olhar as datas disponiveis antes de marcar a consulta, antes msm de chamar a função

    public void exibirDatas (Clinica clinica) {
        for (Consulta c : clinica.getConsultas()) {
            System.println(clinica.getConsultas().getData());
        }      
    }
    
    public Consulta marcarConsulta (String data, Veterinario veterinarioResp, Animal animal, Motivo motivo) { // o cliente marca a consulta, o atendente confirma.
        Consulta c = new Consulta(data, veterinarioResp, animal, motivo); // ai adiciona em no array quando confirmar com o atendente
        c.setSituacao(status.Agendado);
        return c;
    }

    public void atualizarValorConsulta(Consulta consulta, double valor_pago) { // função para atualizar o valor da consulta se n for pago totalmente
        double total = 0.0;
        total = consulta.getValorConsulta() - valor_pago;
        consulta.setValorConsulta(total);
    }

    public bool pagar (Consulta consulta, double valor_pago) { // essa função pode ser bool não? ai retorna se pagou ou não // a pessoa informa o valor pago e se for igual o da consulta ele vai retornar true
        if(!consulta.getTaPago()){
            if (valor_pago == consulta.getValorConsulta()) {
                return true;
            }
            else {
                this.atualizarValorConsulta(consulta, valor_pago);
                return false;
            }
        }
    }

    public Consulta exibirPendente() {
        for (Consulta c :  this.getMinhas_consultas()) {
            if (!c.getTaPago()) {
                return c;
            }
        }
        return NULL;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public ArrayList<Consulta> getMinhas_consultas() {
        return minhas_consultas;
    }

    public void setMinhas_consultas(ArrayList<Consulta> minhas_consultas) {
        this.minhas_consultas = minhas_consultas;
    }
    

    
}