/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import bean.UsuarioBbd;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07329163139
 */
public class UsuariosControle extends AbstractTableModel {
   private List lista;
   
   public void setList(List lista) {
     this.lista = lista;
   }
   public UsuarioBbd getBean(int linha) {
        return (UsuarioBbd) lista.get(linha);
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
        UsuarioBbd UsuarioBbd =(UsuarioBbd) lista.get(rowIndex);
        if(columnIndex == 0) {
            return UsuarioBbd.getIdusuarioBbd();
        }
        if(columnIndex == 1) {
            return UsuarioBbd.getNomeBbd();
        }
        if(columnIndex == 2) {
            return UsuarioBbd.getApelidoBbd();
        }
        if(columnIndex == 3) {
            return UsuarioBbd.getNivelBbd();
        }
        return "";
    }
    @Override
    public String getColumnName(int columnIndex){
        if(columnIndex == 0) {
            return "ID";
        }
        if(columnIndex == 1) {
            return "NOME";
        }
        if(columnIndex == 2) {
            return "APELIDO";
        }
        if(columnIndex == 3) {
            return "Nivel";
        }
        return "";
    }
    
    
}
