package bean;
// Generated 16/09/2023 19:54:44 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RtaUsuarios generated by hbm2java
 */
@Entity
@Table(name="rta_usuarios"
    ,catalog="db_raul_torres"
)
public class RtaUsuarios  implements java.io.Serializable {


     private int idrtaUsuarios;
     private String rtaNome;
     private String rtaApelido;
     private String rtaCpf;
     private Date rtaDataNascimento;
     private String rtaSenha;
     private int rtaNivel;
     private String rtaAtivo;
     private Set rtaVendases = new HashSet(0);

    public RtaUsuarios() {
    }

	
    public RtaUsuarios(int idrtaUsuarios, String rtaNome, String rtaApelido, String rtaCpf, Date rtaDataNascimento, String rtaSenha, int rtaNivel, String rtaAtivo) {
        this.idrtaUsuarios = idrtaUsuarios;
        this.rtaNome = rtaNome;
        this.rtaApelido = rtaApelido;
        this.rtaCpf = rtaCpf;
        this.rtaDataNascimento = rtaDataNascimento;
        this.rtaSenha = rtaSenha;
        this.rtaNivel = rtaNivel;
        this.rtaAtivo = rtaAtivo;
    }
    public RtaUsuarios(int idrtaUsuarios, String rtaNome, String rtaApelido, String rtaCpf, Date rtaDataNascimento, String rtaSenha, int rtaNivel, String rtaAtivo, Set rtaVendases) {
       this.idrtaUsuarios = idrtaUsuarios;
       this.rtaNome = rtaNome;
       this.rtaApelido = rtaApelido;
       this.rtaCpf = rtaCpf;
       this.rtaDataNascimento = rtaDataNascimento;
       this.rtaSenha = rtaSenha;
       this.rtaNivel = rtaNivel;
       this.rtaAtivo = rtaAtivo;
       this.rtaVendases = rtaVendases;
    }
   
     @Id 

    
    @Column(name="idrta_usuarios", unique=true, nullable=false)
    public int getIdrtaUsuarios() {
        return this.idrtaUsuarios;
    }
    
    public void setIdrtaUsuarios(int idrtaUsuarios) {
        this.idrtaUsuarios = idrtaUsuarios;
    }

    
    @Column(name="rta_nome", nullable=false, length=45)
    public String getRtaNome() {
        return this.rtaNome;
    }
    
    public void setRtaNome(String rtaNome) {
        this.rtaNome = rtaNome;
    }

    
    @Column(name="rta_apelido", nullable=false, length=45)
    public String getRtaApelido() {
        return this.rtaApelido;
    }
    
    public void setRtaApelido(String rtaApelido) {
        this.rtaApelido = rtaApelido;
    }

    
    @Column(name="rta_cpf", nullable=false, length=25)
    public String getRtaCpf() {
        return this.rtaCpf;
    }
    
    public void setRtaCpf(String rtaCpf) {
        this.rtaCpf = rtaCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="rta_dataNascimento", nullable=false, length=10)
    public Date getRtaDataNascimento() {
        return this.rtaDataNascimento;
    }
    
    public void setRtaDataNascimento(Date rtaDataNascimento) {
        this.rtaDataNascimento = rtaDataNascimento;
    }

    
    @Column(name="rta_senha", nullable=false, length=50)
    public String getRtaSenha() {
        return this.rtaSenha;
    }
    
    public void setRtaSenha(String rtaSenha) {
        this.rtaSenha = rtaSenha;
    }

    
    @Column(name="rta_nivel", nullable=false)
    public int getRtaNivel() {
        return this.rtaNivel;
    }
    
    public void setRtaNivel(int rtaNivel) {
        this.rtaNivel = rtaNivel;
    }

    
    @Column(name="rta_ativo", nullable=false, length=50)
    public String getRtaAtivo() {
        return this.rtaAtivo;
    }
    
    public void setRtaAtivo(String rtaAtivo) {
        this.rtaAtivo = rtaAtivo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rtaUsuarios")
    public Set getRtaVendases() {
        return this.rtaVendases;
    }
    
    public void setRtaVendases(Set rtaVendases) {
        this.rtaVendases = rtaVendases;
    }




}


