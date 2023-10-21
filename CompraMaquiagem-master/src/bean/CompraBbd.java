package bean;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compra_bbd",
        catalog = "db_barbara_dias"
)
public class CompraBbd implements java.io.Serializable {

    private int idcompraBbd;
    private ClienteBbd clienteBbd;
    private FornecedorBbd fornecedorBbd;
    private double totalBbd;
    private Date dataCompraBbd;

    public CompraBbd() {
    }

    public CompraBbd(int idcompraBbd, ClienteBbd clienteBbd) {
        this.idcompraBbd = idcompraBbd;
        this.clienteBbd = clienteBbd;
    }

    public CompraBbd(int idcompraBbd, ClienteBbd clienteBbd, FornecedorBbd fornecedorBbd, double totalBbd, Date dataCompraBbd) {
        this.idcompraBbd = idcompraBbd;
        this.clienteBbd = clienteBbd;
        this.fornecedorBbd = fornecedorBbd;
        this.totalBbd = totalBbd;
        this.dataCompraBbd = dataCompraBbd;
    }

    @Id

    @Column(name = "idcompra_bbd", unique = true, nullable = false)
    public int getIdcompraBbd() {
        return this.idcompraBbd;
    }

    public void setIdcompraBbd(int idcompraBbd) {
        this.idcompraBbd = idcompraBbd;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_bbd", nullable = false)
    public ClienteBbd getClienteBbd() {
        return this.clienteBbd;
    }

    public void setClienteBbd(ClienteBbd clienteBbd) {
        this.clienteBbd = clienteBbd;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedor_bbd")
    public FornecedorBbd getFornecedorBbd() {
        return this.fornecedorBbd;
    }

    public void setFornecedorBbd(FornecedorBbd fornecedorBbd) {
        this.fornecedorBbd = fornecedorBbd;
    }

    @Column(name = "total_bbd", precision = 10)
    public double getTotalBbd() {
        return this.totalBbd;
    }

    public void setTotalBbd(double totalBbd) {
        this.totalBbd = totalBbd;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "data_compra_bbd", length = 10)
    public Date getDataCompraBbd() {
        return this.dataCompraBbd;
    }

    public void setDataCompraBbd(Date dataCompraBbd) {
        this.dataCompraBbd = dataCompraBbd;
    }

}
