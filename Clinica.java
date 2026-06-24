import java.util.ArrayList;

public class Clinica {
   
    private String nome;
    private ArrayList<Consulta> consultas;
    private ArrayList<Cliente> donos;

    public Clinica(String nome){
        this.nome = nome;
        this.consultas = new ArrayList<>();
        this.donos = new ArrayList<>();
    }

    // Função para adicionar novas consultas que são marcadas pelo Cliente
    public void addConsulta(Consulta c){
        consultas.add(c);
    }

    // Função que adiciona um novo dono na clinica quando um novo cliente é cadastrado
    public void addDonos(Cliente c){
        donos.add(c);
    }

    // Função que calcula o total das consultas nao pagas de certo animal.
    public double calcularTotal(int idAnimal){
        double valor = 0.0;
        for (Consulta c : consultas) {
            if(c.getAnimal().getId() == idAnimal && c.getTaPago() == false){
               valor += c.getValorConsulta(); 
            }
        }
        return valor;
    }

    // Função que calcula o total das consultas nao pagas de todos seus animais de um cliente.
    public double calcularTotal(int idCliente){
        double valor = 0.0;
        for (Consulta c : consultas) {
            if(c.getAnimal().getDono().getCpf() == idCliente){
               valor += c.getValorConsulta(); 
            }
        }
        return valor;
    }

    public void exibirRelatorio(String dinicial, String dfinal){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public ArrayList<Cliente> getDonos() {
        return donos;
    }

    public void setDonos(ArrayList<Cliente> donos) {
        this.donos = donos;
    }

}
