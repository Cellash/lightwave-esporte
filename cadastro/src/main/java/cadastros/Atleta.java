package cadastros;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Atleta extends Usuario implements GeradorID{

    private Double altura;
    private Double peso;
    private Double medidaCintura;
    private Double medidaPeitoral;
    private Double medidaBracoEsquerdo;
    private Double medidaBracoDireito;
    private Double medidaPernaEsquerda;
    private Double medidaPernaDireita;




    public Atleta(String nome, String sobrenome, Integer dataDeNascimento, String email, Double altura, Double peso) {
        super(nome, sobrenome, dataDeNascimento, email);
        this.setId(geradorIDSerial());
        this.setAltura(altura);
        this.setPeso(peso);
        this.setMedidaCintura(0.00);
        this.setMedidaPeitoral(0.00);
        this.setMedidaBracoDireito(0.00);
        this.setMedidaBracoEsquerdo(0.00);
        this.setMedidaPernaDireita(0.00);
        this.setMedidaPernaEsquerda(0.00);

    }


    public Atleta(String nome, String sobrenome, Integer dataDeNascimento, String email, Double altura, Double peso, Double medidaCintura, Double medidaPeitoral, Double medidaBracoEsquerdo, Double medidaBracoDireito, Double medidaPernaEsquerda, Double medidaPernaDireita) {
        super(nome, sobrenome, dataDeNascimento, email);
        this.setId(geradorIDSerial());
        this.setAltura(altura);
        this.setPeso(peso);
        this.setMedidaCintura(medidaCintura);
        this.setMedidaPeitoral(medidaPeitoral);
        this.setMedidaBracoEsquerdo(medidaBracoEsquerdo);
        this.setMedidaBracoDireito(medidaBracoDireito);
        this.setMedidaPernaEsquerda(medidaPernaEsquerda);
        this.setMedidaPernaDireita(medidaPernaDireita);

    }



    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(Double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public Double getMedidaPeitoral() {
        return medidaPeitoral;
    }

    public void setMedidaPeitoral(Double medidaPeitoral) {
        this.medidaPeitoral = medidaPeitoral;
    }

    public Double getMedidaBracoEsquerdo() {
        return medidaBracoEsquerdo;
    }

    public void setMedidaBracoEsquerdo(Double medidaBracoEsquerdo) {
        this.medidaBracoEsquerdo = medidaBracoEsquerdo;
    }

    public Double getMedidaBracoDireito() {
        return medidaBracoDireito;
    }

    public void setMedidaBracoDireito(Double medidaBracoDireito) {
        this.medidaBracoDireito = medidaBracoDireito;
    }

    public Double getMedidaPernaEsquerda() {
        return medidaPernaEsquerda;
    }

    public void setMedidaPernaEsquerda(Double medidaPernaEsquerda) {
        this.medidaPernaEsquerda = medidaPernaEsquerda;
    }

    public Double getMedidaPernaDireita() {
        return medidaPernaDireita;
    }

    public void setMedidaPernaDireita(Double medidaPernaDireita) {
        this.medidaPernaDireita = medidaPernaDireita;
    }

    @Override
    public String geradorIDSerial() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/ss/ms");
        String data = sdf.format( new Date( System.currentTimeMillis() ) );
        String[] dataSeparada = data.split("/");
        // cadastrado por ano + id atleta + dia + sequencia contador
        return 2020100+dataSeparada[0]+dataSeparada[1]+dataSeparada[2];
    }
    @Override
    public String toString() {
        return "Atleta{" +
                "id='" + getId() +
                ", nome='" + getNome() +
                ", sobrenome='" + getSobrenome() +
                ", dataDeNascimento=" + getDataDeNascimento() +
                ", email='" + getEmail() +
                ", altura=" + getAltura() +
                ", peso=" + getPeso() +
                ", medidaCintura=" + getMedidaCintura() +
                ", medidaPeitoral=" + getMedidaPeitoral() +
                ", medidaBracoEsquerdo=" + getMedidaBracoEsquerdo() +
                ", medidaBracoDireito=" + getMedidaBracoDireito() +
                ", medidaPernaEsquerda=" + getMedidaPernaEsquerda() +
                ", medidaPernaDireita=" + getMedidaPernaDireita() +
                '}';
    }
}
