public class Veterinario extends Funcionario {

    public Vacina atualizaCarteirinha(String nome, String data, int dose) {
        Vacina v = new Vacina(nome, data, dose);
        return v;
    }

    public void iniciarConsulta(Consulta c) {
        c.setSituacao() = status.Em_Andamento;
    }

    public void finalizarConsulta(Consulta c) {
        c.setSituacao() = status.Finalizado;
    }

    public void internar (Consulta c, int dias) {
        c.setDiasInternacao() = dias;
    }

    @Override
    public void setCPF(String CPF) {
        super.setCPF(CPF);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getCPF() {
        return super.getCPF();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
    

}