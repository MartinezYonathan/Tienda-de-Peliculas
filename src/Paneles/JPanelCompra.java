/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import DAO.PeliculaDAO;
import Modelo.DetalleCarrito;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author MABY
 */
public class JPanelCompra extends javax.swing.JPanel {

    DetalleCarrito dC;
    ArrayList<DetalleCarrito> carrito;

    String codigo;
    boolean bandera = false;

    /**
     * Creates new form JPanelAgregar
     */
    public JPanelCompra(ArrayList<DetalleCarrito> carrito) {
        initComponents();
        this.carrito = carrito;
    }

    public void VerElemento(JLabel imagen, String codigo, String titulo) {
        lbPrevio.setIcon(imagen.getIcon());
        lbCodigo.setText(String.valueOf("Codigo: " + codigo));
        this.codigo = codigo;
        PeliculaDAO peliculaConeccion = new PeliculaDAO();
        ResultSet rs = peliculaConeccion.ClickPelicula(codigo);
        try {

            while (rs.next()) {
                lbTitulo.setText(String.valueOf(rs.getObject(2)));
                lbDirector.setText(String.valueOf(rs.getObject(3)));
                lbActorP.setText(String.valueOf(rs.getObject(4)));
                lbGenero.setText(String.valueOf(rs.getObject(5)));
                lbPrecio.setText(String.valueOf(rs.getObject(6)));
            }
            bandera = true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPrevio = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbDirector = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        lbActorP = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        btnAgregarPelicula = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        lbCodigo1 = new javax.swing.JLabel();
        lbTitulo1 = new javax.swing.JLabel();
        lbDirector1 = new javax.swing.JLabel();
        lbGenero1 = new javax.swing.JLabel();
        lbActorP1 = new javax.swing.JLabel();
        lbPrecio1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPrevio.setText("Previo");

        lbCodigo.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lbCodigo.setText("________");

        lbTitulo.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lbTitulo.setText("________");

        lbDirector.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lbDirector.setText("________");

        lbGenero.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lbGenero.setText("________");

        lbActorP.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lbActorP.setText("________");

        lbPrecio.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        lbPrecio.setText("________");

        lbCantidad.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbCantidad.setText("Agregar Cantidad de peliculas:");

        btnAgregarPelicula.setText("Agregar");
        btnAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPeliculaActionPerformed(evt);
            }
        });

        txtCantidad.setText("0");

        lbCodigo1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbCodigo1.setText("Codigo:");

        lbTitulo1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbTitulo1.setText("Titulo:");

        lbDirector1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbDirector1.setText("Director:");

        lbGenero1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbGenero1.setText("Genero:");

        lbActorP1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbActorP1.setText("Actor Principal:");

        lbPrecio1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbPrecio1.setText("Precio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(lbPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbCantidad))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(btnAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtCantidad)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo1)
                    .addComponent(lbCodigo1)
                    .addComponent(lbDirector1)
                    .addComponent(lbGenero1)
                    .addComponent(lbActorP1)
                    .addComponent(lbPrecio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo)
                    .addComponent(lbCodigo)
                    .addComponent(lbDirector)
                    .addComponent(lbGenero)
                    .addComponent(lbActorP)
                    .addComponent(lbPrecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbPrevio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDirector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbActorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrecio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCodigo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDirector1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbGenero1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbActorP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrecio1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAgregarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<DetalleCarrito> RetornaCarrito() {
        return carrito;
    }

    public void agregarDetCarrito() {

        int cantidad = Integer.parseInt(txtCantidad.getText());
        String nombre = lbTitulo.getText();
        float precio = Float.parseFloat(lbPrecio.getText());

        if (carrito != null) {
            float subtotal = (float)cantidad * precio;
            dC = new DetalleCarrito(codigo, nombre, cantidad, precio, subtotal);
            carrito.add(dC);
        } else {
            carrito = new ArrayList<>();
            float subtotal = (float)cantidad * precio;
            dC = new DetalleCarrito(codigo, nombre, cantidad, precio, subtotal);
            carrito.add(dC);
        }
    }

    private void btnAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPeliculaActionPerformed
        if (bandera) {
            agregarDetCarrito();
            JOptionPane.showMessageDialog(null, "Agregado Corectamente", "Agregado", JOptionPane.NO_OPTION);
            bandera = false;
        }
        else{
        JOptionPane.showMessageDialog(null, "Selecciona una pelicula", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarPeliculaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPelicula;
    private javax.swing.JLabel lbActorP;
    private javax.swing.JLabel lbActorP1;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigo1;
    private javax.swing.JLabel lbDirector;
    private javax.swing.JLabel lbDirector1;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbGenero1;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbPrecio1;
    private javax.swing.JLabel lbPrevio;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
