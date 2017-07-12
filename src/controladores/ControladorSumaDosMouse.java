/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class ControladorSumaDosMouse implements MouseListener {
    private JTextField visualizadorRst;

    public ControladorSumaDosMouse(JTextField visualizadorRst) {
        this.visualizadorRst = visualizadorRst;
    }

    
    public void setVisualizadorRst(JTextField visualizadorRst) {
        this.visualizadorRst = visualizadorRst;
    }
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        Integer rst = 2 + 3;
        this.visualizadorRst.setText(rst.toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
