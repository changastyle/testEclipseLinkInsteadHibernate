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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nico
 */
@Entity
@Table(name = "fotos")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Fotos.findAll", query = "SELECT f FROM Fotos f"),
    @NamedQuery(name = "Fotos.findById", query = "SELECT f FROM Fotos f WHERE f.id = :id"),
    @NamedQuery(name = "Fotos.findByIndice", query = "SELECT f FROM Fotos f WHERE f.indice = :indice"),
    @NamedQuery(name = "Fotos.findByEsPrincipal", query = "SELECT f FROM Fotos f WHERE f.esPrincipal = :esPrincipal")
})
public class Fotos implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "urlFoto")
    private String urlFoto;
    @Basic(optional = false)
    @Column(name = "indice")
    private int indice;
    @Basic(optional = false)
    @Column(name = "esPrincipal")
    private boolean esPrincipal;
    @JoinColumn(name = "fkExcursion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Excursiones fkExcursion;

    public Fotos()
    {
    }

    public Fotos(Integer id)
    {
        this.id = id;
    }

    public Fotos(Integer id, String urlFoto, int indice, boolean esPrincipal)
    {
        this.id = id;
        this.urlFoto = urlFoto;
        this.indice = indice;
        this.esPrincipal = esPrincipal;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getUrlFoto()
    {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto)
    {
        this.urlFoto = urlFoto;
    }

    public int getIndice()
    {
        return indice;
    }

    public void setIndice(int indice)
    {
        this.indice = indice;
    }

    public boolean getEsPrincipal()
    {
        return esPrincipal;
    }

    public void setEsPrincipal(boolean esPrincipal)
    {
        this.esPrincipal = esPrincipal;
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
        if (!(object instanceof Fotos))
        {
            return false;
        }
        Fotos other = (Fotos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "testeclipselink.Fotos[ id=" + id + " ]";
    }
    
}
