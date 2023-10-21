/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDlgFornecedorNovo;

import bean.FornecedorBbd;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class FornecedorControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public FornecedorBbd getBean(int linha) {
        return (FornecedorBbd) lista.get(linha);
    }

    @Override
    public int getRowCount() {

        return lista.size();
    }

    public void addList(FornecedorBbd fornecedorBbd) {
        lista.add(fornecedorBbd);
    }

    public void removeList(int i) {
        lista.remove(i);
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FornecedorBbd FornecedorBbd = (FornecedorBbd) lista.get(rowIndex);
        if (columnIndex == 0) {
            return FornecedorBbd.getIdfornecedorBbd();
        }
        if (columnIndex == 1) {
            return FornecedorBbd.getNomeBbd();
        }
        if (columnIndex == 2) {
            return FornecedorBbd.getCpfBbd();
        }
        if (columnIndex == 3) {
            return FornecedorBbd.getEnderecoBbd();
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
            return "CPF";
        }
        if (columnIndex == 3) {
            return "Endereço";
        }
        return "";
    }

}
