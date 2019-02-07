/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Limpeza;

/**
 *
 * @author Home
 */
public class LimpezaDAO {
    
    public static void inserir(Limpeza limpeza) {
        String sql = "INSERT  INTO limpezas "
                + "(nome, descricao, situacao, minimo, medio, "
                + " maximo, quantidade) VALUES ( "
                + " '" + limpeza.getNome() + "', "
                + " '" + limpeza.getDescricao()+ "', "
                + " '" + limpeza.getSituacao()+ "', "
                + "  " + limpeza.getMinimo()+ ", "
                + "  " + limpeza.getMedio()+ ", "
                + "  " + limpeza.getMaximo() + ", "
                + " ) ";
        Conexao.executar(sql);
    }
    
   public static void editar(Limpeza limpeza) {
        String sql = "UPDATE SET limpezas "
                + " nome         = '" + limpeza.getNome() + "', "
                + " descricao    = '" + limpeza.getDescricao()+ "', "
                + " situacao     = '" + limpeza.getSituacao()+ "', "
                + " minimo       =  " + limpeza.getMinimo()+ ", "
                + " medio        =  " + limpeza.getMedio()+ ", "
                + " maximo       =  " + limpeza.getMaximo() + ", "
                + " quantidade   = '" + limpeza.getQuantidade()+ "', "
                + " WHERE codigo = " + limpeza.getCodigo();
        Conexao.executar(sql);
    }
   
   public static void excluir(Limpeza limpeza) {
        String sql = "DELETE FROM  limpezas "
                + " WHERE codigo = " + limpeza.getCodigo();

        Conexao.executar(sql);
    }
   
    public static List<Limpeza> getLimpezas() {
        List<Limpeza> lista = new ArrayList<>();

        String sql = "SELECT l.codigo, l.nome, l.descricao, l.situacao, "
                + "l.minimo, l.medio, l.maximo,"
                + "l.quantidade "
                + " FROM limpezas l "
                + " ORDER BY l.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Limpeza limpeza = new Limpeza();
                    limpeza.setCodigo(rs.getInt(1));
                    limpeza.setNome(rs.getString(2));
                    limpeza.setDescricao(rs.getString(3));
                    limpeza.setSituacao(rs.getString(4));
                    limpeza.setMinimo(rs.getDouble(5));
                    limpeza.setMedio(rs.getDouble(6));
                    limpeza.setMaximo(rs.getDouble(7));
                    limpeza.setQuantidade(rs.getDouble(8));

                    lista.add(limpeza);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());

            }
        }

        return lista;
    }
    
    public static Limpeza getLimpezasByCodigo(int codigo) {

        String sql = "SELECT l.codigo, l.nome, l.descricao, l.situacao, "
                + "l.minimo, l.medio, l.maximo,"
                + "l.quantidade "
                + " FROM alimentos l "
                + " ORDER BY l.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                    rs.next();
                    Limpeza limpeza = new Limpeza();
                    limpeza.setCodigo(rs.getInt(1));
                    limpeza.setNome(rs.getString(2));
                    limpeza.setDescricao(rs.getString(3));
                    limpeza.setSituacao(rs.getString(4));
                    limpeza.setMinimo(rs.getDouble(5));
                    limpeza.setMedio(rs.getDouble(6));
                    limpeza.setMaximo(rs.getDouble(7));
                    limpeza.setQuantidade(rs.getDouble(8));
                    
                    return limpeza;
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
                return null;
            }
        }else{
            return null;
        }
    }
    
}
