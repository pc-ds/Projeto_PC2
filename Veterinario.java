public class Veterinario extends Funcionario {

    public Veterinario(String nome, String CPF, int id) {
        super(nome, CPF, id);
    }

    public void atualizaCarteirinha(AnimalVacina animal, Consulta consulta, String nome, String data, int dose) {
        Vacina v = new Vacina(nome, data, dose);
        animal.getCartao().add(v);
        consulta.setTemVacina(true);
    }

    public void internar(Consulta c, int dias) {
        if (c.getAnimal() instanceof Internavel) {
            c.setDiasInternacao(dias);
        } else {
            System.out.println("Este animal não pode ser internado.");
        }
    }

    public void iniciarConsulta(Consulta c) {
        c.setSituacao(Status.EM_ANDAMENTO);
    }

    public void finalizarConsulta(Consulta c) {
        c.setSituacao(Status.FINALIZADO);
    }
}
