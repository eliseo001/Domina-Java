package gm.zona_fit.gui;

import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class ZonaFitForma extends JFrame{
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;

    IClienteServicio clienteServicio;
    private DefaultTableModel tableModeloClientes;

    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);//centra la ventana

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.tableModeloClientes = new DefaultTableModel(0,4);
        String[] cabeceros = {"Id","Nombre","Apellido", "Membresia"};
        this.tableModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla= new JTable(tableModeloClientes);
        //cargar listado de clientes
        listarClientes();


    }
    private void listarClientes(){
        this.tableModeloClientes.setRowCount(0);
        var clientes =this.clienteServicio.listarCliente();
        clientes.forEach(cliente -> {
            Object[] renglonCliente= {
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            this.tableModeloClientes.addRow(renglonCliente);
        });
    }

//
}