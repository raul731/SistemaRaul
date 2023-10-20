/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.RtaUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class UsuariosController extends AbstractTableModel{
    
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
  
    }

    public RtaUsuarios getBean (int row){
    return (RtaUsuarios) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RtaUsuarios usuarios =(RtaUsuarios) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return usuarios.getIdrtaUsuarios();
        }
        if (columnIndex == 1 ) {
            return usuarios.getRtaNome();
        }
        if (columnIndex == 2 ) {
            return usuarios.getRtaApelido();
        }
        if (columnIndex == 3 ) {
            return usuarios.getRtaCpf();
        }
        if (columnIndex == 4 ) {
            return usuarios.getRtaSenha();
        }
        if (columnIndex == 5 ) {
            return usuarios.getRtaNivel();
        }
        if (columnIndex == 6 ) {
            return usuarios.getRtaAtivo();
        }
        if (columnIndex == 7 ) {
            return usuarios.getRtaDataNascimento();
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
