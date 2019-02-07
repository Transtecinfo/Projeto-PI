/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Alimento;

/**
 *
 * @author Home
 */
public class AlimentoDAO {
    
   public static void inserir(Alimento alimento) {
        String sql = "INSERT  INTO alimentos "
                + "(nome, descricao, situacao, minimo, medio, "
                + " maximo, quantidade) VALUES ( "
                + " '" + alimento.getNome() + "', "
                + " '" + alimento.getDescricao()+ "', "
                + " '" + alimento.getSituacao()+ "', "
                + "  " + alimento.getMinimo()+ ", "
                + "  " + alimento.getMedio()+ ", "
                + "  " + alimento.getMaximo() + ", "
                + " ) ";
        Conexao.executar(sql);
    }
    
   public static void editar(Alimento alimento) {
        String sql = "UPDATE SET alimentos "
                + " nome         = '" + alimento.getNome() + "', "
                + " descricao    = '" + alimento.getDescricao()+ "', "
                + " situacao     = '" + alimento.getSituacao()+ "', "
                + " minimo       =  " + alimento.getMinimo()+ ", "
                + " medio        =  " + alimento.getMedio()+ ", "
                + " maximo       =  " + alimento.getMaximo() + ", "
                + " quantidade   = '" + alimento.getQuantidade()+ "', "
                + " WHERE codigo = " + alimento.getCodigo();
        Conexao.executar(sql);
    }
   
   public static void excluir(Alimento alimento) {
        String sql = "DELETE FROM  alimentos "
                + " WHERE codigo = " + alimento.getCodigo();

        Conexao.executar(sql);
    }
   
    public static List<Alimento> getALimentos() {
        List<Alimento> lista = new ArrayList<>();

        String sql = "SELECT a.codigo, a.nome, a.descricao, a.situacao, "
                + "a.minimo, a.medio, a.maximo,"
                + "a.quantidade "
                + " FROM alimentos a "
                + " ORDER BY a.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Alimento alimento = new Alimento();
                    alimento.setCodigo(rs.getInt(1));
                    alimento.setNome(rs.getString(2));
                    alimento.setDescricao(rs.getString(3));
                    alimento.setSituacao(rs.getString(4));
                    alimento.setMinimo(rs.getDouble(5));
                    alimento.setMedio(rs.getDouble(6));
                    alimento.setMaximo(rs.getDouble(7));
                    alimento.setQuantidade(rs.getDouble(8));

                    lista.add(alimento);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());

            }
        }

        return lista;
    }
    
    public static Alimento getALimentosByCodigo(int codigo) {

        String sql = "SELECT a.codigo, a.nome, a.descricao, a.situacao, "
                + "a.minimo, a.medio, a.maximo,"
                + "a.quantidade "
                + " FROM alimentos a "
                + " ORDER BY a.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                    rs.next();
                    Alimento alimento = new Alimento();
                    alimento.setCodigo(rs.getInt(1));
                    alimento.setNome(rs.getString(2));
                    alimento.setDescricao(rs.getString(3));
                    alimento.setSituacao(rs.getString(4));
                    alimento.setMinimo(rs.getDouble(5));
                    alimento.setMedio(rs.getDouble(6));
                    alimento.setMaximo(rs.getDouble(7));
                    alimento.setQuantidade(rs.getDouble(8));
                    
                    return alimento;
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
                return null;
            }
        }else{
            return null;
        }
    }
}


