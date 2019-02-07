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
import model.Vestuario;

/**
 *
 * @author Home
 */
public class VestuarioDAO {
    
    public static void inserir(Vestuario vestuario) {
        String sql = "INSERT  INTO vestuarios "
                + "(nome, descricao, situacao, minimo, medio, "
                + " maximo, quantidade) VALUES ( "
                + " '" + vestuario.getNome() + "', "
                + " '" + vestuario.getDescricao()+ "', "
                + " '" + vestuario.getSituacao()+ "', "
                + "  " + vestuario.getMinimo()+ ", "
                + "  " + vestuario.getMedio()+ ", "
                + "  " + vestuario.getMaximo() + ", "
                + " ) ";
        Conexao.executar(sql);
    }
    
   public static void editar(Vestuario vestuario) {
        String sql = "UPDATE SET vestuarios "
                + " nome         = '" + vestuario.getNome() + "', "
                + " descricao    = '" + vestuario.getDescricao()+ "', "
                + " situacao     = '" + vestuario.getSituacao()+ "', "
                + " minimo       =  " + vestuario.getMinimo()+ ", "
                + " medio        =  " + vestuario.getMedio()+ ", "
                + " maximo       =  " + vestuario.getMaximo() + ", "
                + " quantidade   = '" + vestuario.getQuantidade()+ "', "
                + " WHERE codigo = " + vestuario.getCodigo();
        Conexao.executar(sql);
    }
   
   public static void excluir(Vestuario vestuario) {
        String sql = "DELETE FROM  vestuarios "
                + " WHERE codigo = " + vestuario.getCodigo();

        Conexao.executar(sql);
    }
   
    public static List<Vestuario> getVestuarios() {
        List<Vestuario> lista = new ArrayList<>();

        String sql = "SELECT v.codigo, v.nome, v.descricao, v.situacao, "
                + "v.minimo, v.medio, v.maximo,"
                + "v.quantidade "
                + " FROM alimentos v "
                + " ORDER BY v.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Vestuario vestuario = new Vestuario();
                    vestuario.setCodigo(rs.getInt(1));
                    vestuario.setNome(rs.getString(2));
                    vestuario.setDescricao(rs.getString(3));
                    vestuario.setSituacao(rs.getString(4));
                    vestuario.setMinimo(rs.getDouble(5));
                    vestuario.setMedio(rs.getDouble(6));
                    vestuario.setMaximo(rs.getDouble(7));
                    vestuario.setQuantidade(rs.getDouble(8));

                    lista.add(vestuario);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());

            }
        }

        return lista;
    }
    
    public static Vestuario getVestuariosByCodigo(int codigo) {

        String sql = "SELECT v.codigo, v.nome, v.descricao, v.situacao, "
                + "v.minimo, v.medio, v.maximo,"
                + "v.quantidade "
                + " FROM vestuarios v "
                + " ORDER BY v.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                    rs.next();
                    Vestuario vestuario = new Vestuario();
                    vestuario.setCodigo(rs.getInt(1));
                    vestuario.setNome(rs.getString(2));
                    vestuario.setDescricao(rs.getString(3));
                    vestuario.setSituacao(rs.getString(4));
                    vestuario.setMinimo(rs.getDouble(5));
                    vestuario.setMedio(rs.getDouble(6));
                    vestuario.setMaximo(rs.getDouble(7));
                    vestuario.setQuantidade(rs.getDouble(8));
                    
                    return vestuario;
              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
                return null;
            }
        }else{
            return null;
        }
    }
    
}
