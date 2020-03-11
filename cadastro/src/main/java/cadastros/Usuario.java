package cadastros;

public abstract class Usuario {
    private String id;
    private String nome;
    private String sobrenome;
    private Integer dataDeNascimento;
    private String email;

    public Usuario(String nome, String sobrenome, Integer dataDeNascimento, String email) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setDataDeNascimento(dataDeNascimento);
        this.setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public Integer getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Integer dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", email='" + email + '\'' +
                '}';
    }
}
