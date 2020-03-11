package cadastros;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Treinador extends Usuario implements GeradorID {
    private Boolean graduacao;

    public Treinador(String nome, String sobrenome, Integer dataDeNascimento, String email, Boolean graduacao) {
        super(nome, sobrenome, dataDeNascimento, email);
        this.setGraduacao(graduacao);
    }


    public Boolean getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(Boolean graduacao) {
        this.graduacao = graduacao;
    }



    public String geradorIDSerial() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/ss/ms");
        String data = sdf.format( new Date( System.currentTimeMillis() ) );
        String[] dataSeparada = data.split("/");
        // cadastrado por ano + id atleta + dia + sequencia contador
        return 2020200+dataSeparada[0]+dataSeparada[1]+dataSeparada[2];
    }

    @Override
    public String toString() {
        return "Treinador{" +
                "graduacao=" + getGraduacao() +
                '}';
    }
}
