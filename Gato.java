import java.util.ArrayList;

public class Gato extends AnimalVacina {
    public Gato (String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, Porte porte) {
        super(nome, idade, dono, idAnimal, peso, raca, porte);
    }

    @Override
    public ArrayList<Vacina> getCartao() {
        return super.getCartao();
    }

    @Override
    public Cliente getDono() {
        return super.getDono();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public int getIdAnimal() {
        return super.getIdAnimal();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public float getPeso() {
        return super.getPeso();
    }

    @Override
    public Porte getPorte() {
        return super.getPorte();
    }

    @Override
    public String getRaca() {
        return super.getRaca();
    }

    @Override
    public void setCartao(ArrayList<Vacina> cartao) {
        super.setCartao(cartao);
    }

    @Override
    public void setDono(Cliente dono) {
        super.setDono(dono);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void setIdAnimal(int idAnimal) {
        super.setIdAnimal(idAnimal);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setPeso(float peso) {
        super.setPeso(peso);
    }

    @Override
    public void setPorte(Porte porte) {
        super.setPorte(porte);
    }

    @Override
    public void setRaca(String raca) {
        super.setRaca(raca);
    }
    
}
