/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeclipselink;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nico
 */
@Entity
@Table(name = "descuentos")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Descuentos.findAll", query = "SELECT d FROM Descuentos d"),
    @NamedQuery(name = "Descuentos.findById", query = "SELECT d FROM Descuentos d WHERE d.id = :id"),
    @NamedQuery(name = "Descuentos.findByPorcentaje", query = "SELECT d FROM Descuentos d WHERE d.porcentaje = :porcentaje"),
    @NamedQuery(name = "Descuentos.findByDesde", query = "SELECT d FROM Descuentos d WHERE d.desde = :desde"),
    @NamedQuery(name = "Descuentos.findByHasta", query = "SELECT d FROM Descuentos d WHERE d.hasta = :hasta")
})
public class Descuentos implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "porcentaje")
    private int porcentaje;
    @Basic(optional = false)
    @Column(name = "desde")
    @Temporal(TemporalType.DATE)
    private Date desde;
    @Basic(optional = false)
    @Column(name = "hasta")
    @Temporal(TemporalType.DATE)
    private Date hasta;
    @JoinColumn(name = "fkExcursion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Excursiones fkExcursion;

    public Descuentos()
    {
    }

    public Descuentos(Integer id)
    {
        this.id = id;
    }

    public Descuentos(Integer id, int porcentaje, Date desde, Date hasta)
    {
        this.id = id;
        this.porcentaje = porcentaje;
        this.desde = desde;
        this.hasta = hasta;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public int getPorcentaje()
    {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje)
    {
        this.porcentaje = porcentaje;
    }

    public Date getDesde()
    {
        return desde;
    }

    public void setDesde(Date desde)
    {
        this.desde = desde;
    }

    public Date getHasta()
    {
        return hasta;
    }

    public void setHasta(Date hasta)
    {
        this.hasta = hasta;
    }

    public Excursiones getFkExcursion()
    {
        return fkExcursion;
    }

    public void setFkExcursion(Excursiones fkExcursion)
    {
        this.fkExcursion = fkExcursion;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descuentos))
        {
            return false;
        }
        Descuentos other = (Descuentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "testeclipselink.Descuentos[ id=" + id + " ]";
    }
    
}
