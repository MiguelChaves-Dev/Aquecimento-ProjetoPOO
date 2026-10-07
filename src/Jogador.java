public class Jogador {
    private String nome;
    private Sexo sexo;
    private String CPF;
    private String email;

    public Jogador(String no, Sexo sex, String cpf, String em) {
        nome = no;
        sexo = sex;
        CPF = cpf;
        email = em;
    }

    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sex) {
        this.sexo = sex;
    }
    public String getCPF() {
        return CPF;
    }
    public String getEmail() {
        return email;
    }
}
