package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario_bbd",
         catalog = "db_barbara_dias"
)
public class UsuarioBbd implements java.io.Serializable {

    private int idusuarioBbd;
    private String nomeBbd;
    private String senhaBbd;
    private String nivelBbd;
    private String ativoBbd;
    private String apelidoBbd;

    public UsuarioBbd() {
    }

    public UsuarioBbd(int idusuarioBbd) {
        this.idusuarioBbd = idusuarioBbd;
    }

    public UsuarioBbd(int idusuarioBbd, String nomeBbd, String senhaBbd, String nivelBbd, String ativoBbd, String apelidoBbd) {
        this.idusuarioBbd = idusuarioBbd;
        this.nomeBbd = nomeBbd;
        this.senhaBbd = senhaBbd;
        this.nivelBbd = nivelBbd;
        this.ativoBbd = ativoBbd;
        this.apelidoBbd = apelidoBbd;
    }

    @Id

    @Column(name = "idusuario_bbd", unique = true, nullable = false)
    public int getIdusuarioBbd() {
        return this.idusuarioBbd;
    }

    public void setIdusuarioBbd(int idusuarioBbd) {
        this.idusuarioBbd = idusuarioBbd;
    }

    @Column(name = "nome_bbd")
    public String getNomeBbd() {
        return this.nomeBbd;
    }

    public void setNomeBbd(String nomeBbd) {
        this.nomeBbd = nomeBbd;
    }

    @Column(name = "senha_bbd")
    public String getSenhaBbd() {
        return this.senhaBbd;
    }

    public void setSenhaBbd(String senhaBbd) {
        this.senhaBbd = senhaBbd;
    }

    @Column(name = "nivel_bbd", length = 5)
    public String getNivelBbd() {
        return this.nivelBbd;
    }

    public void setNivelBbd(String nivelBbd) {
        this.nivelBbd = nivelBbd;
    }

    @Column(name = "ativo_bbd", length = 5)
    public String getAtivoBbd() {
        return this.ativoBbd;
    }

    public void setAtivoBbd(String ativoBbd) {
        this.ativoBbd = ativoBbd;
    }

    @Column(name = "apelido_bbd")
    public String getApelidoBbd() {
        return this.apelidoBbd;
    }

    public void setApelidoBbd(String apelidoBbd) {
        this.apelidoBbd = apelidoBbd;
    }

}
