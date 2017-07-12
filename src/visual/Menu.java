package visual;

import controladores.*;
import javax.swing.*;
import java.awt.GridLayout;

public class Menu extends JFrame{
    private JButton sumaUno = new JButton("Suma UNO (2 + 3)");
    private JButton sumaDos = new JButton("Suma DOS (4 + 3)");
    private JTextField cuadroResultado = new JTextField();
    private ControladorMenuWindows menuWindowsListener = new ControladorMenuWindows();
    private ControladorSumaDosMouse sumaDosMouseListener = new ControladorSumaDosMouse(cuadroResultado);
    private ControladorSumaUnoMouse sumaUnoMouseListener = new ControladorSumaUnoMouse();
    private GridLayout contenedorVisual = new GridLayout(2,2);
    private String tituloNombre = "Sin Titulo";
    
    public Menu(String titulo){
        this.tituloNombre = titulo;
        this.cargarObjetos();
    }
    private void cargarObjetos(){
        this.add(cuadroResultado);
        this.sumaDos.addMouseListener(sumaDosMouseListener);
        this.sumaUno.addMouseListener(sumaUnoMouseListener);
        this.addWindowListener(menuWindowsListener);
        this.add(sumaUno);
        this.add(sumaDos);
        this.setLayout(contenedorVisual);
        this.setTitle(tituloNombre);
        this.setSize(300, 300);
        this.setLocation(200, 250);
        this.setVisible(true);
    }
    
    
    
    
}
