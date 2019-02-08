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
import model.Usuario;

/**
 *
 * @author 181720019
 */
public class UsuarioDAO {

    public static boolean logar(Usuario usuario) {
        String sql = " SELECT COUNT(codigo) "
                + " FROM usuarios "
                + " WHERE login = '" + usuario.getLogin() + "' AND "
                + " senha = '" + usuario.getSenha() + "' ";
        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                rs.next();
                if (rs.getInt(1) == 0) {
                    return false;
                } else {
                    return true;
                }

            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }

    }

    public static void inserir(Usuario usuario) {
        String sql = " INSERT  INTO usuarios "
                + "( nome, login, senha ) VALUES ( "
                + " '" + usuario.getNome() + "', "
                + " '" + usuario.getLogin()+ "', "
                + " '" + usuario.getSenha()+ "' "
                + " ) ";
        Conexao.executar(sql);
    }

    public static void editar(Usuario usuario) {
        String sql = " UPDATE usuarios SET "
                + " nome     = '" + usuario.getNome() + "', "
                + " senha = '" + usuario.getSenha() + "', "
                + " login = '" + usuario.getLogin() + "', "
                + " WHERE codigo = " + usuario.getCodigo();
        Conexao.executar(sql);
    }

    public static void excluir(Usuario usuario) {
        String sql = "DELETE FROM  usuarios "
                + " WHERE codigo = " + usuario.getCodigo();

        Conexao.executar(sql);
    }

    public static List<Usuario> getUsuarios() {
        List<Usuario> lista = new ArrayList<>();

        String sql = "SELECT u.codigo, u.nome, u.senha, u.login "
                + " FROM usuarios u "
                + " ORDER BY u.nome";

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setCodigo(rs.getInt(1));
                    usuario.setNome(rs.getString(2));
                    usuario.setSenha(rs.getString(3));
                    usuario.setLogin(rs.getString(4));

                    lista.add(usuario);

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());

            }
        }

        return lista;
    }

    public static Usuario getUsuariosByCodigo(int codigo) {

        String sql = "SELECT u.codigo, u.nome, u.senha, u.login, "
                + " FROM usuarios u "
                + " WHERE u.codigo = " + codigo;

        ResultSet rs = Conexao.consultar(sql);
        if (rs != null) {
            try {
                rs.next();
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getInt(1));
                usuario.setNome(rs.getString(2));
                usuario.setSenha(rs.getString(3));
                usuario.setLogin(rs.getString(4));

                return usuario;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
                return null;
            }

        } else {
            return null;
        }
    }

}
