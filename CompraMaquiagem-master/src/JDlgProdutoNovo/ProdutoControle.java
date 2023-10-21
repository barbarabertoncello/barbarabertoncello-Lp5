/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDlgProdutoNovo;

import bean.ProdutoBbd;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC
 */
public class ProdutoControle extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public ProdutoBbd getBean(int linha) {
        return (ProdutoBbd) lista.get(linha);
    }

    public void addList(ProdutoBbd produtoBbd) {
        lista.add(produtoBbd);
        this.fireTableDataChanged();
    }

    public void removeList(int i) {
        lista.remove(i);
        this.fireTableDataChanged();
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
        ProdutoBbd ProdutoBbd = (ProdutoBbd) lista.get(rowIndex);
        if (columnIndex == 0) {
            return ProdutoBbd.getIdprodutoBbd();
        }
        if (columnIndex == 1) {
            return ProdutoBbd.getNomeBbd();
        }
        if (columnIndex == 2) {
            return ProdutoBbd.getQuantidadeUnitariaBbd();
        }
        if (columnIndex == 3) {
            return ProdutoBbd.getValorBbd();
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
            return "QUANTIDADE";
        }
        if (columnIndex == 3) {
            return "PREÇO";
        }
        return "";
    }

}
