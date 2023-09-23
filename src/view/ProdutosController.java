/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.RtaProdutos;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class ProdutosController extends AbstractTableModel{
    
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }

    public RtaProdutos getBean (int row){
    return (RtaProdutos) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RtaProdutos usuarios =(RtaProdutos) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return usuarios.getIdrtaProdutos();
        }
        if (columnIndex == 1 ) {
            return usuarios.getRtaNome();
        }
        if (columnIndex == 2 ) {
            return usuarios.getRtaGrupo();
        }
        if (columnIndex == 3 ) {
            return usuarios.getRtaValor();
        }
      
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 1 ) {
            return "nome";
        }
        if (column == 2 ) {
            return "apelido";
        }
        if (column == 3 ) {
            return "cpf";
        }
        if (column == 4 ) {
            return "senha";
        }
        if (column == 5 ) {
            return "nivel";
        }
        if (column == 6 ) {
            return "ativo";
        }
        if (column == 7 ) {
            return "Data de nascimento";
        }
        return "";
    }
}
