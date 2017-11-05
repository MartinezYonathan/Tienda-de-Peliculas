/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendapeliculas;

import Modelo.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author MABY
 */
public class Carrito {

    private ArrayList<Pelicula> peliculas; //Contendor para las peliculas 
    
    public Carrito() {
        peliculas = new ArrayList<Pelicula>();
    }

    /*
    * Este metodo sireve para agregar las peliculas al arreglo
    */
   public String addPelicula(Pelicula pelicula, int numeroPeliculas) {
        for (int i =0; i < numeroPeliculas; i++) {
            peliculas.add(pelicula);
        }
        return numeroPeliculas + " Peliculaw Agregadas";
    }
   
   public String deletPelicula(Pelicula pelicula){
       peliculas.remove(pelicula);
       return " Peliculaw Agregadas";
   }
}
