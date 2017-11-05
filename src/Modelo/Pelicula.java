/*
*Este objeto va hacer referncia un un objeto de la vida que es una pelicula
 */
package Modelo;

/**
 *
 * @author MABY
 */
public class Pelicula { 
    
    //Campos de la clase
    private String codigo; //Codigo de barras para identificar de manera unica
    private String titulo;
    private String director;
    private String actor_Prin;
    private String genero;
    private float precio;
    private String imagen;

     /*
     * Constructor
     */
    public Pelicula(String codigo, String titulo, String director, String actor_Prin, String genero, float precio, String imagen) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.actor_Prin = actor_Prin;
        this.genero = genero;
        this.precio = precio;
        this.imagen = imagen;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.director = autor;
    }

    /**
     * @return the actor_Prin
     */
    public String getActor_Prin() {
        return actor_Prin;
    }

    /**
     * @param actor_Prin the actor_Prin to set
     */
    public void setActor_Prin(String actor_Prin) {
        this.actor_Prin = actor_Prin;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }  //Cierre de la metodo setPrecio

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}//Cierre de la clase
