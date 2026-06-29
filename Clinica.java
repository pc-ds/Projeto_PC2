import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    public double calcularTotal(Animal animal){
        double valor = 0.0;
        for (Consulta c : consultas) {
            if(c.getAnimal() == animal && c.getTaPago() == false){
               valor += c.getValorConsulta(); 
            }
        }
        return valor;
    }

    // Função que calcula o total das consultas nao pagas de todos seus animais de um cliente.
    public double calcularTotal(Cliente cliente){
        double valor = 0.0;
        for (Consulta c : consultas) {
            if(c.getAnimal().getDono() == cliente){
               valor += c.getValorConsulta(); 
            }
        }
        return valor;
    }

    public void exibirRelatorio(String dinicial, String dfinal) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate inicio = LocalDate.parse(dinicial, formato);
        LocalDate fim = LocalDate.parse(dfinal, formato);

        for (Consulta c : consultas) {
            LocalDate dataConsulta = LocalDate.parse(c.getData(), formato);

            if (!dataConsulta.isBefore(inicio) && !dataConsulta.isAfter(fim)) {
                System.out.println("Data: " + c.getData()
                    + " | Animal: " + c.getAnimal().getNome()
                    + " | Veterinário: " + c.getVeterinarioResp().getName()
                    + " | Motivo: " + c.getMotivo()
                    + " | Valor: R$" + c.getValorConsulta()
                    + " | Pago: " + (c.getTaPago() ? "Sim" : "Não")
                    + " | Status: " + c.getSituacao());
            }
        }
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
