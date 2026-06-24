public class Consulta {

    private double valorConsulta;
    private Motivo motivo;
    private String data;
    private int diasInternacao;
    private Veterinario veterinarioResp;
    private Animal animal;
    private boolean taPago;
    private Status situacao;

   

    public Consulta(Motivo motivo, String data, Veterinario veterinarioResp, Animal animal){
        this.motivo = motivo;
        this.data = data;
        this.animal = animal;
        this.veterinarioResp = veterinarioResp;
    }

    public void calcularConsulta(){
        double valor = 0.0;
        if(motivo == Motivo.EMERGENCIA) valor += 300;
        else if(motivo == Motivo.CHECK_UP) valor += 120;
        if(animal.getClass() == AnimalVacina.class){
            if(animal.getPorte() == Porte.PEQUENO) valor += 50;
            else if(animal.getPorte() == Porte.MEDIO) valor += 75;
            else if(animal.getPorte() == Porte.GRANDE) valor += 100;
        }
        return valor;
    }



    public Status getSituacao() {
        return situacao;
    }

    public void setSituacao(Status situacao) {
        this.situacao = situacao;
    }
    public double getValorConsulta() {
        return valorConsulta;
    }
    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    public Motivo getMotivo() {
        return motivo;
    }
    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getDiasInternacao() {
        return diasInternacao;
    }
    public void setDiasInternacao(int diasInternacao) {
        this.diasInternacao = diasInternacao;
    }
    public Veterinario getVeterinarioResp() {
        return veterinarioResp;
    }
    public void setVeterinarioResp(Veterinario veterinarioResp) {
        this.veterinarioResp = veterinarioResp;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public bool getTaPago() {
        return taPago;
    }
    public void setTaPago(bool taPago) {
        this.taPago = taPago;
    } 

}
