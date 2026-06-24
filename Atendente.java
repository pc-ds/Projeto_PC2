public class Atendente extends Funcionario {
    public Atendente (String nome, String CPF, int id) {
        super (nome, CPF, id);
    }

    public Cliente cadastrarDono (String nome, String CPF, int telefone) {
        Cliente c = new Cliente(nome, CPF, telefone);
        return c;
    }
    public AnimalVacina cadastrarAnimalComVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, String porte) { 
        AnimalVacina av = new AnimalVacina(nome, idade, dono, idAnimal, peso, raca, porte);
        return av;
    }
    public Passaro cadastrarAnimalSemVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, String especie) {
        Passaro p = new Passaro(nome, idade, dono, idAnimal, peso, especie);
        return p;
    }

}