/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeclipselink;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nico
 */
@Entity
@Table(name = "sugeridos")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Sugeridos.findAll", query = "SELECT s FROM Sugeridos s"),
    @NamedQuery(name = "Sugeridos.findById", query = "SELECT s FROM Sugeridos s WHERE s.id = :id"),
    @NamedQuery(name = "Sugeridos.findByFkExcursionPadre", query = "SELECT s FROM Sugeridos s WHERE s.fkExcursionPadre = :fkExcursionPadre"),
    @NamedQuery(name = "Sugeridos.findByFkExcursionSugerida", query = "SELECT s FROM Sugeridos s WHERE s.fkExcursionSugerida = :fkExcursionSugerida")
})
public class Sugeridos implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fkExcursionPadre")
    private int fkExcursionPadre;
    @Basic(optional = false)
    @Column(name = "fkExcursionSugerida")
    private int fkExcursionSugerida;

    public Sugeridos()
    {
    }

    public Sugeridos(Integer id)
    {
        this.id = id;
    }

    public Sugeridos(Integer id, int fkExcursionPadre, int fkExcursionSugerida)
    {
        this.id = id;
        this.fkExcursionPadre = fkExcursionPadre;
        this.fkExcursionSugerida = fkExcursionSugerida;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public int getFkExcursionPadre()
    {
        return fkExcursionPadre;
    }

    public void setFkExcursionPadre(int fkExcursionPadre)
    {
        this.fkExcursionPadre = fkExcursionPadre;
    }

    public int getFkExcursionSugerida()
    {
        return fkExcursionSugerida;
    }

    public void setFkExcursionSugerida(int fkExcursionSugerida)
    {
        this.fkExcursionSugerida = fkExcursionSugerida;
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
        if (!(object instanceof Sugeridos))
        {
            return false;
        }
        Sugeridos other = (Sugeridos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "testeclipselink.Sugeridos[ id=" + id + " ]";
    }
    
}
