package patterns.facade.pojos;

public class Cliente {

    public Integer id;
    public String nome;
    public Integer idade;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
