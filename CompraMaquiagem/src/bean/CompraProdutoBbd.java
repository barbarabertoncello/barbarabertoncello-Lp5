package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compra_produto_bbd",
         catalog = "db_barbara_dias"
)
public class CompraProdutoBbd implements java.io.Serializable {

    private int idcompraProdutoBbd;
    private CompraBbd compraBbd;
    private ProdutoBbd produtoBbd;
    private Integer compraBbd_1;
    private Integer quantidadeBbd;
    private double valorUnitarioBdd;

    public CompraProdutoBbd() {
    }

    public CompraProdutoBbd(int idcompraProdutoBbd) {
        this.idcompraProdutoBbd = idcompraProdutoBbd;
    }

    public CompraProdutoBbd(int idcompraProdutoBbd, CompraBbd compraBbd, ProdutoBbd produtoBbd, Integer compraBbd_1, Integer quantidadeBbd, double valorUnitarioBdd) {
        this.idcompraProdutoBbd = idcompraProdutoBbd;
        this.compraBbd = compraBbd;
        this.produtoBbd = produtoBbd;
        this.compraBbd_1 = compraBbd_1;
        this.quantidadeBbd = quantidadeBbd;
        this.valorUnitarioBdd = valorUnitarioBdd;
    }

    @Id

    @Column(name = "idcompra_produto_bbd", unique = true, nullable = false)
    public int getIdcompraProdutoBbd() {
        return this.idcompraProdutoBbd;
    }

    public void setIdcompraProdutoBbd(int idcompraProdutoBbd) {
        this.idcompraProdutoBbd = idcompraProdutoBbd;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_bbd")
    public CompraBbd getCompraBbd() {
        return this.compraBbd;
    }

    public void setCompraBbd(CompraBbd compraBbd) {
        this.compraBbd = compraBbd;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_bbd", insertable = false, updatable = false)
    public ProdutoBbd getProdutoBbd() {
        return this.produtoBbd;
    }

    public void setProdutoBbd(ProdutoBbd produtoBbd) {
        this.produtoBbd = produtoBbd;
    }

    @Column(name = "compra_bbd")
    public Integer getCompraBbd_1() {
        return this.compraBbd_1;
    }

    public void setCompraBbd_1(Integer compraBbd_1) {
        this.compraBbd_1 = compraBbd_1;
    }

    @Column(name = "quantidade_bbd")
    public Integer getQuantidadeBbd() {
        return this.quantidadeBbd;
    }

    public void setQuantidadeBbd(Integer quantidadeBbd) {
        this.quantidadeBbd = quantidadeBbd;
    }

    @Column(name = "valor_unitario_bdd", precision = 10)
    public double getValorUnitarioBdd() {
        return this.valorUnitarioBdd;
    }

    public void setValorUnitarioBdd(double valorUnitarioBdd) {
        this.valorUnitarioBdd = valorUnitarioBdd;
    }

}
