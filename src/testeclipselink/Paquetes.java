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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nico
 */
@Entity
@Table(name = "paquetes")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Paquetes.findAll", query = "SELECT p FROM Paquetes p"),
    @NamedQuery(name = "Paquetes.findById", query = "SELECT p FROM Paquetes p WHERE p.id = :id"),
    @NamedQuery(name = "Paquetes.findByPrecio", query = "SELECT p FROM Paquetes p WHERE p.precio = :precio"),
    @NamedQuery(name = "Paquetes.findByHoraPartida", query = "SELECT p FROM Paquetes p WHERE p.horaPartida = :horaPartida"),
    @NamedQuery(name = "Paquetes.findByMinPartida", query = "SELECT p FROM Paquetes p WHERE p.minPartida = :minPartida"),
    @NamedQuery(name = "Paquetes.findByHoraLlegada", query = "SELECT p FROM Paquetes p WHERE p.horaLlegada = :horaLlegada"),
    @NamedQuery(name = "Paquetes.findByMinLlegada", query = "SELECT p FROM Paquetes p WHERE p.minLlegada = :minLlegada"),
    @NamedQuery(name = "Paquetes.findByDuracion", query = "SELECT p FROM Paquetes p WHERE p.duracion = :duracion")
})
public class Paquetes implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Lob
    @Column(name = "texto1")
    private String texto1;
    @Basic(optional = false)
    @Lob
    @Column(name = "texto2")
    private String texto2;
    @Basic(optional = false)
    @Column(name = "precio")
    private double precio;
    @Basic(optional = false)
    @Column(name = "horaPartida")
    private String horaPartida;
    @Basic(optional = false)
    @Column(name = "minPartida")
    private String minPartida;
    @Basic(optional = false)
    @Column(name = "horaLlegada")
    private String horaLlegada;
    @Basic(optional = false)
    @Column(name = "minLlegada")
    private String minLlegada;
    @Basic(optional = false)
    @Column(name = "duracion")
    private String duracion;
    @Basic(optional = false)
    @Lob
    @Column(name = "descripcion")
    private String descripcion;

    public Paquetes()
    {
    }

    public Paquetes(Integer id)
    {
        this.id = id;
    }

    public Paquetes(Integer id, String nombre, String texto1, String texto2, double precio, String horaPartida, String minPartida, String horaLlegada, String minLlegada, String duracion, String descripcion)
    {
        this.id = id;
        this.nombre = nombre;
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.precio = precio;
        this.horaPartida = horaPartida;
        this.minPartida = minPartida;
        this.horaLlegada = horaLlegada;
        this.minLlegada = minLlegada;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTexto1()
    {
        return texto1;
    }

    public void setTexto1(String texto1)
    {
        this.texto1 = texto1;
    }

    public String getTexto2()
    {
        return texto2;
    }

    public void setTexto2(String texto2)
    {
        this.texto2 = texto2;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public String getHoraPartida()
    {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida)
    {
        this.horaPartida = horaPartida;
    }

    public String getMinPartida()
    {
        return minPartida;
    }

    public void setMinPartida(String minPartida)
    {
        this.minPartida = minPartida;
    }

    public String getHoraLlegada()
    {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada)
    {
        this.horaLlegada = horaLlegada;
    }

    public String getMinLlegada()
    {
        return minLlegada;
    }

    public void setMinLlegada(String minLlegada)
    {
        this.minLlegada = minLlegada;
    }

    public String getDuracion()
    {
        return duracion;
    }

    public void setDuracion(String duracion)
    {
        this.duracion = duracion;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
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
        if (!(object instanceof Paquetes))
        {
            return false;
        }
        Paquetes other = (Paquetes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "testeclipselink.Paquetes[ id=" + id + " ]";
    }
    
}
