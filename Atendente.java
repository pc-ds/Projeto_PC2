public class Atendente extends Funcionario {
    public Atendente (String nome, String CPF, int id) {
        super (nome, CPF, id);
    }

    public void cadastrarDono (Clinica clin,String nome, String CPF, int telefone) {
        Cliente c = new Cliente(nome, CPF, telefone);
        clin.addDonos(c);
    }
    public AnimalVacina cadastrarAnimalComVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, Porte porte) { 
        AnimalVacina av = new AnimalVacina(nome, idade, dono, idAnimal, peso, raca, porte);
        return av;
    }
    public Passaro cadastrarAnimalSemVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, Especie especie) {
        Passaro p = new Passaro(nome, idade, dono, idAnimal, peso, especie);
        return p;
    }

}