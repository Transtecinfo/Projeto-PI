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
import model.Higiene;

/**
 *
 * @author Home
 */
public class HigieneDAO {
    
     public static void inserir(Higiene higiene) {
        String sql = "INSERT  INTO higienes "
                + "(nome, descricao, situacao, minimo, medio, "
                + " maximo, quantidade) VALUES ( "
                + " '" + higiene.getNome() + "', "
                + " '" + higiene.getDescricao()+ "', "
                + " '" + higiene.getSituacao()+ "', "
                + "  " + higiene.getMinimo()+ ", "
                + "  " + higiene.getMedio()+ ", "
                + "  " + higiene.getMaximo() + ", "
                + " ) ";
        Conexao.executar(sql);
    }
    
   public static void editar(Higiene higiene) {
        String sql = "UPDATE SET alimentos "
                + " nome         = '" + higiene.getNome() + "', "
                + " descricao    = '" + higiene.getDescricao()+ "', "
                + " situacao     = '" + higiene.getSituacao()+ "', "
                + " minimo       =  " + higiene.getMinimo()+ ", "
                + " medio        =  " + higiene.getMedio()+ ", "
                + " maximo       =  " + higiene.getMaximo() + ", "
                + " quantidade   = '" + higiene.getQuantidade()+ "', "
                + " WHERE codigo = " + higiene.getCodigo();
        Conexao.executar(sql);
    }
   
   public static void excluir(Higiene higiene) {
        String sql = "DELETE FROM  higienes "
                + " WHERE codigo = " + higiene.getCodigo();

        Conexao.executar(sql);
    }
   
    public static List<Higiene> getHigienes() {
        List<Higiene> lista = new ArrayList<>();

        String sql = "SELECT h.codigo, h.nome, h.descricao, h.situacao, "
                + "h.minimo, h.medio, h.maximo,"
                + "h.quantidade "
                + " FROM higienes h "
                + " ORDER BY h.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Higiene higiene = new Higiene();
                    higiene.setCodigo(rs.getInt(1));
                    higiene.setNome(rs.getString(2));
                    higiene.setDescricao(rs.getString(3));
                    higiene.setSituacao(rs.getString(4));
                    higiene.setMinimo(rs.getDouble(5));
                    higiene.setMedio(rs.getDouble(6));
                    higiene.setMaximo(rs.getDouble(7));
                    higiene.setQuantidade(rs.getDouble(8));

                    lista.add(higiene);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());

            }
        }

        return lista;
    }
    
    public static Higiene getHigienesByCodigo(int codigo) {

        String sql = "SELECT h.codigo, h.nome, h.descricao, h.situacao, "
                + "h.minimo, h.medio, h.maximo,"
                + "h.quantidade "
                + " FROM alimentos h "
                + " ORDER BY h.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                    rs.next();
                    Higiene higiene = new Higiene();
                    higiene.setCodigo(rs.getInt(1));
                    higiene.setNome(rs.getString(2));
                    higiene.setDescricao(rs.getString(3));
                    higiene.setSituacao(rs.getString(4));
                    higiene.setMinimo(rs.getDouble(5));
                    higiene.setMedio(rs.getDouble(6));
                    higiene.setMaximo(rs.getDouble(7));
                    higiene.setQuantidade(rs.getDouble(8));
                    
                    return higiene;
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
                return null;
            }
        }else{
            return null;
        }
    }
    
}
