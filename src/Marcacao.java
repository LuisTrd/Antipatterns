import java.time.LocalDate;
import java.time.LocalDateTime;

public class Marcacao {
    private int Id_marcacao;
    private Cliente Utilizador;
    private Viagem Viagem;
    private LocalDate Hora;

    public Marcacao(Cliente utilizador, Viagem viagem, LocalDate hora) {
        this.Utilizador = utilizador;
        this.Viagem = viagem;
        this.Hora = hora;
    }

    public int getId_marcacao() {
        return Id_marcacao;
    }

    public void setId_marcacao(int id_marcacao) {
        Id_marcacao = id_marcacao;
    }

    public Cliente getUtilizador() {
        return Utilizador;
    }

    public void setUtilizador(Cliente utilizador) {
        Utilizador = utilizador;
    }

    public Viagem getViagem() {
        return Viagem;
    }

    public void setViagem(Viagem viagem) {
        Viagem = viagem;
    }

    public LocalDate getHora() {
        return Hora;
    }

    public void setHora(LocalDate hora) {
        Hora = hora;
    }
}
