package gm.zona_fit.gui;

import ch.qos.logback.core.net.server.Client;
import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private Integer idCliente;

    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
        eliminarButton.addActionListener(e -> eliminarCliente());
        limpiarButton.addActionListener(e -> limpiarFormulario());
    }
    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);//centra la ventana

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        //this.tableModeloClientes = new DefaultTableModel(0,4);
        //evita la edicion de los valores de la celda de las tablas
        this.tableModeloClientes = new DefaultTableModel(0, 4){
             @Override
            public  boolean isCellEditable(int row, int column){
                 return false;
             }
        };

        String[] cabeceros = {"Id","Nombre","Apellido", "Membresia"};
        this.tableModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla= new JTable(tableModeloClientes);

        //restringimops la selecion de la tabla a un solo registo
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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

    private void guardarCliente(){
        if (nombreTexto.getText().equals("")){
            mostrarMensaje("Proporcione un nombre");

            nombreTexto.requestFocusInWindow();

            return;
        }

        if (apellidoTexto.getText().equals("")){
            mostrarMensaje("Proporciona un apellido");

            apellidoTexto.requestFocusInWindow();

            return;
        }

        if(membresiaTexto.getText().equals("")){
            mostrarMensaje("Proporciona una membresia");

            membresiaTexto.requestFocusInWindow();

            return;
        }

        //recuperamos los valores del formulario
        var nombre = nombreTexto.getText();

        var apellido = apellidoTexto.getText();

        var membresia = Integer.parseInt(membresiaTexto.getText());

        var cliente = new Cliente(this.idCliente, nombre, apellido, membresia);

        this.clienteServicio.guardarCliente(cliente);//insertar o modificar

        if(this.idCliente == null){
            mostrarMensaje("Se agrego un nuevo cliente");
        }
        else {
            mostrarMensaje("Se actualizo el cliente");
        }

        limpiarFormulario();

        listarClientes();
    }

    private void cargarClienteSeleccionado(){
        var renglon = clientesTabla.getSelectedRow();

        if (renglon != -1){
            var id = clientesTabla.getModel().getValueAt(renglon, 0).toString();

            this.idCliente = Integer.parseInt(id);

            var nombre = clientesTabla.getModel().getValueAt(renglon, 1).toString();

            this.nombreTexto.setText(nombre);

            var apellido = clientesTabla.getModel().getValueAt(renglon, 2).toString();

            this.apellidoTexto.setText(apellido);

            var membresia = clientesTabla.getModel().getValueAt(renglon, 3).toString();

            this.membresiaTexto.setText(membresia);
        }
    }

    private void eliminarCliente(){
        var renglon = clientesTabla.getSelectedRow();

        if(renglon != -1){
            var idClienteStr = clientesTabla.getModel().getValueAt(renglon, 0).toString();
            this.idCliente = Integer.parseInt(idClienteStr);
            var cliente = new Cliente();
            cliente.setId(this.idCliente);
            clienteServicio.eliminarCliente(cliente);
            mostrarMensaje("Cliente con el id: " + this.idCliente + " eliminado");
            limpiarFormulario();
            listarClientes();
        }else {
            mostrarMensaje("Debe seleccionar un Cliente a eliminar");
        }
    }

    private void limpiarFormulario(){
        nombreTexto.setText("");

        apellidoTexto.setText("");

        membresiaTexto.setText("");

        //liampiamos el id del cliente seleccionado

        this.idCliente = null;

        //Deselecionamos el registro selñeccionado de la tabla

        this.clientesTabla.getSelectionModel().clearSelection();
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
}