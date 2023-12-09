package bean;
// Generated 19/10/2023 21:48:07 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RtaVendas generated by hbm2java
 */
@Entity
@Table(name="rta_vendas"
    ,catalog="db_raul_torres"
)
public class RtaVendas  implements java.io.Serializable {


     private int idrtaVendas;
     private RtaCliente rtaCliente;
     private RtaUsuarios rtaUsuarios;
     private Date rtaData;
     private double rtaValorTotal;
 

    public RtaVendas() {
    }

	
    public RtaVendas(int idrtaVendas, RtaCliente rtaCliente, RtaUsuarios rtaUsuarios, Date rtaData, double rtaValorTotal) {
        this.idrtaVendas = idrtaVendas;
        this.rtaCliente = rtaCliente;
        this.rtaUsuarios = rtaUsuarios;
        this.rtaData = rtaData;
        this.rtaValorTotal = rtaValorTotal;
    }
   
   
     @Id 

    
    @Column(name="idrta_vendas", unique=true, nullable=false)
    public int getIdrtaVendas() {
        return this.idrtaVendas;
    }
    
    public void setIdrtaVendas(int idrtaVendas) {
        this.idrtaVendas = idrtaVendas;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="rta_FKCliente", nullable=false)
    public RtaCliente getRtaCliente() {
        return this.rtaCliente;
    }
    
    public void setRtaCliente(RtaCliente rtaCliente) {
        this.rtaCliente = rtaCliente;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="rta_FKUsuarios", nullable=false)
    public RtaUsuarios getRtaUsuarios() {
        return this.rtaUsuarios;
    }
    
    public void setRtaUsuarios(RtaUsuarios rtaUsuarios) {
        this.rtaUsuarios = rtaUsuarios;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="rta_data", nullable=false, length=10)
    public Date getRtaData() {
        return this.rtaData;
    }
    
    public void setRtaData(Date rtaData) {
        this.rtaData = rtaData;
    }

    
    @Column(name="rta_valorTotal", nullable=false, precision=10)
    public double getRtaValorTotal() {
        return this.rtaValorTotal;
    }
    
    public void setRtaValorTotal(double rtaValorTotal) {
        this.rtaValorTotal = rtaValorTotal;
    }






}


