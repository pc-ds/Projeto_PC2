import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String telefone;
    private ArrayList<Animal> animais;
    private ArrayList<Consulta> minhas_consultas;

    public Cliente(String nome, String CPF, String telefone) {
        super(nome, CPF);
        this.telefone = telefone;
        this.animais = new ArrayList<>();
        this.minhas_consultas = new ArrayList<>();
    }

    public ArrayList<String> exibirDatas(Clinica clinica) {
        ArrayList<String> datas = new ArrayList<>();
        for (Consulta c : clinica.getConsultas()) {
            datas.add(c.getData());
        }
        return datas;
    }

    public void marcarConsulta(Clinica clin, String data, Veterinario veterinarioResp, Animal animal, Motivo motivo) {
        Consulta c = new Consulta(data, veterinarioResp, animal, motivo);
        c.setSituacao(Status.AGENDADO);
        clin.addConsulta(c);
        this.minhas_consultas.add(c);
    }

    public void atualizarValorConsulta(Consulta consulta, double valor_pago) {
        double total = consulta.getValorConsulta() - valor_pago;
        consulta.setValorConsulta(total);
    }

    public boolean pagar(Consulta consulta, double valor_pago) {
        if (!consulta.getTaPago()) {
            if (valor_pago >= consulta.getValorConsulta()) {
                consulta.setTaPago(true);
                return true;
            } else {
                this.atualizarValorConsulta(consulta, valor_pago);
                return false;
            }
        }
        return false;
    }

    public ArrayList<Consulta> exibirPendente() {
        ArrayList<Consulta> pendentes = new ArrayList<>();
        for (Consulta c : minhas_consultas) {
            if (!c.getTaPago()) pendentes.add(c);
        }
        return pendentes;
    }

    public ArrayList<Animal> getAnimais() { return animais; }
    public void setAnimais(ArrayList<Animal> animais) { this.animais = animais; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public ArrayList<Consulta> getMinhas_consultas() { return minhas_consultas; }
    public void setMinhas_consultas(ArrayList<Consulta> minhas_consultas) { this.minhas_consultas = minhas_consultas; }
}
