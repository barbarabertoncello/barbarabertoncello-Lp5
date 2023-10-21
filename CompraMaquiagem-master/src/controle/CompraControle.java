/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.ClienteBbd;
import bean.CompraBbd;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class CompraControle extends AbstractTableModel{
    
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public CompraBbd getBean(int linha) {
        return (CompraBbd) lista.get(linha);
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
        CompraBbd CompraBbd = (CompraBbd) lista.get(rowIndex);
        if (columnIndex == 0) {
            return CompraBbd.getIdcompraBbd();
        }
        if (columnIndex == 1) {
            return CompraBbd.getClienteBbd();
        }
        if (columnIndex == 2) {
            return CompraBbd.getFornecedorBbd();
        }
        if (columnIndex == 3) {
            return CompraBbd.getTotalBbd();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Cliente";
        }
        if (columnIndex == 2) {
            return "Fornecedor";
        }
        if (columnIndex == 3) {
            return "Total";
        }
        return "";
    }
}
