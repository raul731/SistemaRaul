/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.RtaCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
     */
public class ClienteController extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }
   
    public RtaCliente getBean(int row) {
        return (RtaCliente) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 15;
    }

    @Override
    public Object getValueAt(int row, int column) {
        RtaCliente rtaCliente = (RtaCliente) lista.get(row);
        if (column == 0) {
           return rtaCliente.getIdrtaCliente();
        } 
        if (column == 1) {
           return rtaCliente.getRtaNome();
        } 
        if (column == 2) {
           return rtaCliente.getRtaCpf();
        } 
        if (column == 3) {
           return rtaCliente.getRtaRg();
        } 
        if (column == 4) {
           return rtaCliente.getRtaPais();
        } 
        if (column == 5) {
           return rtaCliente.getRtaCep();
        } 
        if (column == 6) {
           return rtaCliente.getRtaRua();
        } 
        if (column == 7) {
           return rtaCliente.getRtaNumeroRua();
        } 
        if (column == 8) {
           return rtaCliente.getRtaBairro();
        } 
        if (column == 9) {
           return rtaCliente.getRtaComplemento();
        } 
        if (column == 10) {
           return rtaCliente.getRtaGenero();
        } 
        if (column == 11) {
           return rtaCliente.getRtaCelular();
        } 
        if (column == 12) {
           return rtaCliente.getRtaTelefone();
        } 
        if (column == 13) {
           return rtaCliente.getRtaEstadoCivil();
        } 
        if (column == 14) {
           return rtaCliente.getRtaEndereco();
        } 
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "nome";
        }
        if (column == 2) {
            return "cpf";
        }
        if (column == 3) {
            return "rg";
        }
        if (column == 4) {
            return "pais";
        }
        if (column == 5) {
            return "cep";
        }
        if (column == 6) {
            return "rua";
        }
        if (column == 7) {
            return "numero rua";
        }
        if (column == 8) {
            return "bairro";
        }
        if (column == 9) {
            return "complemento";
        }
        if (column == 10) {
            return "genero";
        }
        if (column == 11) {
            return "celular";
        }
        if (column == 12) {
            return "telefone";
        }
        if (column == 13) {
            return "estado civil";
        }
        if (column == 14) {
            return "endereco";
        }
        
        return "";
    }
}
