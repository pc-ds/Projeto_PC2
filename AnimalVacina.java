import java.util.ArrayList;

public class AnimalVacina extends Animal {
    private String raca;
    private ArrayList<Vacina> cartao;
    private Porte porte;

    public AnimalVacina(String nome, int idade, Cliente dono, int idAnimal, float peso, String raca, Porte porte) {
        super(nome, idade, dono, idAnimal, peso);
        this.raca = raca;
        this.porte = porte;
        cartao = new ArrayList<>();
    }

    public ArrayList<Vacina> getCartao() {
        return cartao;
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

    public Porte getPorte() {
        return porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setCartao(ArrayList<Vacina> cartao) {
        this.cartao = cartao;
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

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


}