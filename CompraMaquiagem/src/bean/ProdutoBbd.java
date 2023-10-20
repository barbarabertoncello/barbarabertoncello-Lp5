package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto_bbd",
        catalog = "db_barbara_dias"
)
public class ProdutoBbd implements java.io.Serializable {

    private int idprodutoBbd;
    private String nomeBbd;
    private double valorBbd;
    private double quantidadeUnitariaBbd;

    public ProdutoBbd() {
    }

    public ProdutoBbd(int idprodutoBbd) {
        this.idprodutoBbd = idprodutoBbd;
    }

    public ProdutoBbd(int idprodutoBbd, String nomeBbd, double valorBbd, double quantidadeUnitariaBbd) {
        this.idprodutoBbd = idprodutoBbd;
        this.nomeBbd = nomeBbd;
        this.valorBbd = valorBbd;
        this.quantidadeUnitariaBbd = quantidadeUnitariaBbd;
    }

    @Id

    @Column(name = "idproduto_bbd", unique = true, nullable = false)
    public int getIdprodutoBbd() {
        return this.idprodutoBbd;
    }

    public void setIdprodutoBbd(int idprodutoBbd) {
        this.idprodutoBbd = idprodutoBbd;
    }

    @Column(name = "nome_bbd", length = 50)
    public String getNomeBbd() {
        return this.nomeBbd;
    }

    public void setNomeBbd(String nomeBbd) {
        this.nomeBbd = nomeBbd;
    }

    @Column(name = "valor_bbd", precision = 7)
    public double getValorBbd() {
        return this.valorBbd;
    }

    public void setValorBbd(double valorBbd) {
        this.valorBbd = valorBbd;
    }

    @Column(name = "quantidade_unitaria_bbd", precision = 7)
    public double getQuantidadeUnitariaBbd() {
        return this.quantidadeUnitariaBbd;
    }

    public void setQuantidadeUnitariaBbd(double quantidadeUnitariaBbd) {
        this.quantidadeUnitariaBbd = quantidadeUnitariaBbd;
    }

}
