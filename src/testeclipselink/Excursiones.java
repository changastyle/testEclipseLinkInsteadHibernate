/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeclipselink;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author nico
 */
@Entity
@Table(name = "excursiones")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Excursiones.findAll", query = "SELECT e FROM Excursiones e"),
    @NamedQuery(name = "Excursiones.findById", query = "SELECT e FROM Excursiones e WHERE e.id = :id"),
    @NamedQuery(name = "Excursiones.findByPrecio", query = "SELECT e FROM Excursiones e WHERE e.precio = :precio"),
    @NamedQuery(name = "Excursiones.findByCarrusel", query = "SELECT e FROM Excursiones e WHERE e.carrusel = :carrusel"),
    @NamedQuery(name = "Excursiones.findByTop", query = "SELECT e FROM Excursiones e WHERE e.top = :top"),
    @NamedQuery(name = "Excursiones.findByGrilla", query = "SELECT e FROM Excursiones e WHERE e.grilla = :grilla"),
    @NamedQuery(name = "Excursiones.findByBottom", query = "SELECT e FROM Excursiones e WHERE e.bottom = :bottom"),
    @NamedQuery(name = "Excursiones.findByMinPartida", query = "SELECT e FROM Excursiones e WHERE e.minPartida = :minPartida"),
    @NamedQuery(name = "Excursiones.findByHoraLlegada", query = "SELECT e FROM Excursiones e WHERE e.horaLlegada = :horaLlegada"),
    @NamedQuery(name = "Excursiones.findByMinLlegada", query = "SELECT e FROM Excursiones e WHERE e.minLlegada = :minLlegada")
})
public class Excursiones implements Serializable
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
    @Column(name = "carrusel")
    private boolean carrusel;
    @Basic(optional = false)
    @Column(name = "top")
    private boolean top;
    @Basic(optional = false)
    @Column(name = "grilla")
    private boolean grilla;
    @Basic(optional = false)
    @Column(name = "bottom")
    private boolean bottom;
    @Basic(optional = false)
    @Lob
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
    @Lob
    @Column(name = "duracion")
    private String duracion;
    @Basic(optional = false)
    @Lob
    @Column(name = "incluido")
    private String incluido;
    @Basic(optional = false)
    @Lob
    @Column(name = "noIncluido")
    private String noIncluido;
    @Basic(optional = false)
    @Lob
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkExcursion")
    private Collection<Descuentos> descuentosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkExcursion")
    private Collection<Fotos> fotosCollection;

    public Excursiones()
    {
    }

    public Excursiones(Integer id)
    {
        this.id = id;
    }

    public Excursiones(Integer id, String nombre, String texto1, String texto2, double precio, boolean carrusel, boolean top, boolean grilla, boolean bottom, String horaPartida, String minPartida, String horaLlegada, String minLlegada, String duracion, String incluido, String noIncluido, String descripcion)
    {
        this.id = id;
        this.nombre = nombre;
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.precio = precio;
        this.carrusel = carrusel;
        this.top = top;
        this.grilla = grilla;
        this.bottom = bottom;
        this.horaPartida = horaPartida;
        this.minPartida = minPartida;
        this.horaLlegada = horaLlegada;
        this.minLlegada = minLlegada;
        this.duracion = duracion;
        this.incluido = incluido;
        this.noIncluido = noIncluido;
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

    public boolean getCarrusel()
    {
        return carrusel;
    }

    public void setCarrusel(boolean carrusel)
    {
        this.carrusel = carrusel;
    }

    public boolean getTop()
    {
        return top;
    }

    public void setTop(boolean top)
    {
        this.top = top;
    }

    public boolean getGrilla()
    {
        return grilla;
    }

    public void setGrilla(boolean grilla)
    {
        this.grilla = grilla;
    }

    public boolean getBottom()
    {
        return bottom;
    }

    public void setBottom(boolean bottom)
    {
        this.bottom = bottom;
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

    public String getIncluido()
    {
        return incluido;
    }

    public void setIncluido(String incluido)
    {
        this.incluido = incluido;
    }

    public String getNoIncluido()
    {
        return noIncluido;
    }

    public void setNoIncluido(String noIncluido)
    {
        this.noIncluido = noIncluido;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Descuentos> getDescuentosCollection()
    {
        return descuentosCollection;
    }

    public void setDescuentosCollection(Collection<Descuentos> descuentosCollection)
    {
        this.descuentosCollection = descuentosCollection;
    }

    @XmlTransient
    public Collection<Fotos> getFotosCollection()
    {
        return fotosCollection;
    }

    public void setFotosCollection(Collection<Fotos> fotosCollection)
    {
        this.fotosCollection = fotosCollection;
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
        if (!(object instanceof Excursiones))
        {
            return false;
        }
        Excursiones other = (Excursiones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "testeclipselink.Excursiones[ id=" + id + " ]";
    }
    
}
