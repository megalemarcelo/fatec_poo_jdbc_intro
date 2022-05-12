import java.sql.Connection;
public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public void inserir() throws Exception{
        //1. Definir o comando SQL
        String sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?)"; //? = placeholder
        //2. Abrir uma conexão com o MySQL Server
        ConnectionFactory factory = new ConnectionFactory();
        Connection conexao = factory.getConnection();
        //3. Preparar o comando (solicita ao MySQL Server que compile o comando SQL previamente)

        //4. Substituir os eventuais placeholders

        //5. Executar o comando

        //6. Fechar os recursos (a conexão e o comando preparado)
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}