package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor_bbd",
         catalog = "db_barbara_dias"
)
public class FornecedorBbd implements java.io.Serializable {

    private int idfornecedorBbd;
    private String nomeBbd;
    private String sobrenomeBbd;
    private String cpfBbd;
    private String rgBbd;
    private String enderecoBbd;
    private String ativoBbd;

    public FornecedorBbd() {
    }

    public FornecedorBbd(int idfornecedorBbd) {
        this.idfornecedorBbd = idfornecedorBbd;
    }

    public FornecedorBbd(int idfornecedorBbd, String nomeBbd, String sobrenomeBbd, String cpfBbd, String rgBbd, String enderecoBbd, String ativoBbd) {
        this.idfornecedorBbd = idfornecedorBbd;
        this.nomeBbd = nomeBbd;
        this.sobrenomeBbd = sobrenomeBbd;
        this.cpfBbd = cpfBbd;
        this.rgBbd = rgBbd;
        this.enderecoBbd = enderecoBbd;
        this.ativoBbd = ativoBbd;
    }

    @Id

    @Column(name = "idfornecedor_bbd", unique = true, nullable = false)
    public int getIdfornecedorBbd() {
        return this.idfornecedorBbd;
    }

    public void setIdfornecedorBbd(int idfornecedorBbd) {
        this.idfornecedorBbd = idfornecedorBbd;
    }

    @Column(name = "nome_bbd")
    public String getNomeBbd() {
        return this.nomeBbd;
    }

    public void setNomeBbd(String nomeBbd) {
        this.nomeBbd = nomeBbd;
    }

    @Column(name = "sobrenome_bbd")
    public String getSobrenomeBbd() {
        return this.sobrenomeBbd;
    }

    public void setSobrenomeBbd(String sobrenomeBbd) {
        this.sobrenomeBbd = sobrenomeBbd;
    }

    @Column(name = "cpf_bbd")
    public String getCpfBbd() {
        return this.cpfBbd;
    }

    public void setCpfBbd(String cpfBbd) {
        this.cpfBbd = cpfBbd;
    }

    @Column(name = "rg_bbd")
    public String getRgBbd() {
        return this.rgBbd;
    }

    public void setRgBbd(String rgBbd) {
        this.rgBbd = rgBbd;
    }

    @Column(name = "endereco_bbd")
    public String getEnderecoBbd() {
        return this.enderecoBbd;
    }

    public void setEnderecoBbd(String enderecoBbd) {
        this.enderecoBbd = enderecoBbd;
    }

    @Column(name = "ativo_bbd", length = 5)
    public String getAtivoBbd() {
        return this.ativoBbd;
    }

    public void setAtivoBbd(String ativoBbd) {
        this.ativoBbd = ativoBbd;
    }

}
