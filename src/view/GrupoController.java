/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.RtaGrupo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
     */
public class GrupoController extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public RtaGrupo getBean(int row) {
        return (RtaGrupo) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int row, int column) {
        RtaGrupo rtaGrupo = (RtaGrupo) lista.get(row);
        if (column == 0) {
           return rtaGrupo.getIdrtaGrupo();
        } 
        if (column == 1) {
           return rtaGrupo.getRtaDescricao();
        } 
        if (column == 2) {
           return rtaGrupo.getRtaMassa();
        } 
        if (column == 3) {
           return rtaGrupo.getRtaRecheio();
        } 
        if (column == 4) {
           return rtaGrupo.getRtaDecoracao();
        } 
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "descrição";
        }
        if (column == 2) {
            return "massa";
        }
        if (column == 3) {
            return "recheio";
        }
        if (column == 4) {
            return "decoração";
        }
        return "";
    }
}
