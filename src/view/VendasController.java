/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.RtaVendas;
import dao.RtaVendas_DAO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u10154925179
 */
public class VendasController extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public RtaVendas getBean(int row){
    return (RtaVendas) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 4;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        RtaVendas rtaVendas = (RtaVendas) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return rtaVendas.getIdrtaVendas();
    }
        if (columnIndex == 1){
    return rtaVendas.getRtaCliente();
    }
        if (columnIndex == 2){
    return rtaVendas.getRtaUsuarios();
    }
         if (columnIndex == 3){
    return rtaVendas.getRtaData();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "Id";
    }
    if (column == 1){
    return "Cliente";
    }
    if (column == 2){
    return "Usuario";
    }
    if (column == 3){
    return "Data";
    }
    return "";
    
    } 
    
}
