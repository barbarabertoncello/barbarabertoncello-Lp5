package bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cliente_bbd",
         catalog = "db_barbara_dias"
)
public class ClienteBbd implements java.io.Serializable {

    private int idclienteBbd;
    private String nomeBbd;
    private String telefoneBbd;
    private Date dataNascimentoBbd;
    private String endereco;

    public ClienteBbd() {
    }

    public ClienteBbd(int idclienteBbd) {
        this.idclienteBbd = idclienteBbd;
    }

    public ClienteBbd(int idclienteBbd, String nomeBbd, String telefoneBbd, Date dataNascimentoBbd, String endereco) {
        this.idclienteBbd = idclienteBbd;
        this.nomeBbd = nomeBbd;
        this.telefoneBbd = telefoneBbd;
        this.dataNascimentoBbd = dataNascimentoBbd;
        this.endereco = endereco;

    }

    @Id

    @Column(name = "idcliente_bbd", unique = true, nullable = false)
    public int getIdclienteBbd() {
        return this.idclienteBbd;
    }

    public void setIdclienteBbd(int idclienteBbd) {
        this.idclienteBbd = idclienteBbd;
    }

    @Column(name = "nome_bbd", length = 45)
    public String getNomeBbd() {
        return this.nomeBbd;
    }

    public void setNomeBbd(String nomeBbd) {
        this.nomeBbd = nomeBbd;
    }

    @Column(name = "telefone_bbd", length = 11)
    public String getTelefoneBbd() {
        return this.telefoneBbd;
    }

    public void setTelefoneBbd(String telefoneBbd) {
        this.telefoneBbd = telefoneBbd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento_bbd", length = 10)
    public Date getDataNascimentoBbd() {
        return this.dataNascimentoBbd;
    }

    public void setDataNascimentoBbd(Date dataNascimentoBbd) {
        this.dataNascimentoBbd = dataNascimentoBbd;
    }

    @Column(name = "endereco", length = 45)
    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
