public class Vacina {
    private String nome;
    private String data;
    private int dose;

    public Vacina(String nome, String data, int dose) {
        this.nome = nome;
        this.data = data;
        this.dose = dose;
    }

    public String getData() {
        return data;
    }

    public int getDose() {
        return dose;
    }

    public String getNome() {
        return nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}