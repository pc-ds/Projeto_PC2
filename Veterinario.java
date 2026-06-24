public class Veterinario extends Funcionario {

    public Veterinario (String nome, String CPF, int id) {
        super(nome, CPF, id);
    }

    public Vacina atualizaCarteirinha(String nome, String data, int dose) {
        Vacina v = new Vacina(nome, data, dose);
        return v;
    }

    public void iniciarConsulta(Consulta c) {
        c.setSituacao(Status.EM_ANDAMENTO);
    }

    public void finalizarConsulta(Consulta c) {
        c.setSituacao(Status.FINALIZADO);
    }

    public void internar (Consulta c, int dias) {
        c.setDiasInternacao(dias);
    }

}