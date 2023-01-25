import java.util.Date;

public class Task {
    private String nome;
    private String descricao;
    private Date data_termino;
    private short nivel_prioridade;
    private String categoria;
    private String status;

    public Task(String nome, String descricao, Date data_termino, short nivel_prioridade, String categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.data_termino = data_termino;
        this.nivel_prioridade = nivel_prioridade;
        this.categoria = categoria;
        this.status = "ToDo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_termino() {
        return data_termino;
    }

    public void setData_termino(Date data_termino) {
        this.data_termino = data_termino;
    }

    public short getNivel_prioridade() {
        return nivel_prioridade;
    }

    public void setNivel_prioridade(short nivel_prioridade) {
        this.nivel_prioridade = nivel_prioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
