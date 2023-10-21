/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.ClienteBbd;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ClienteControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public ClienteBbd getBean(int linha) {
        return (ClienteBbd) lista.get(linha);
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
        ClienteBbd ClienteBbd = (ClienteBbd) lista.get(rowIndex);
        if (columnIndex == 0) {
            return ClienteBbd.getIdclienteBbd();
        }
        if (columnIndex == 1) {
            return ClienteBbd.getNomeBbd();
        }
        if (columnIndex == 2) {
            return ClienteBbd.getTelefoneBbd();
        }
        if (columnIndex == 3) {
            return ClienteBbd.getEndereco();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "NOME";
        }
        if (columnIndex == 2) {
            return "Telefone";
        }
        if (columnIndex == 3) {
            return "Endereço";
        }
        return "";
    }

}
