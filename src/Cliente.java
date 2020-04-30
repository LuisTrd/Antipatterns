public class Cliente {
    private int Id_cliente;
    private String Nome;
    private String Telemovel;

    public Cliente(int id_cliente, String nome, String telemovel) {
        Id_cliente = id_cliente;
        Nome = nome;
        Telemovel = telemovel;
    }

    public int getId_cliente() {
        return Id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        Id_cliente = id_cliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTelemovel() {
        return Telemovel;
    }

    public void setTelemovel(String telemovel) {
        Telemovel = telemovel;
    }
}
