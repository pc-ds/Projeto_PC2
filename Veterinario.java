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

}