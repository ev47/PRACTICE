/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaSwing;

/**
 *
 * @author edgva
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import practicaSwing.crearUsuarios.Usuario;
public class VerificarUsuarios {
    private static List<Usuario> usuariosRegistrados = new ArrayList<>();
    private static final String ARCHIVO_DATOS = "usuarios.txt";
    public static List<Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
    public static void agregarUsuario(Usuario usuario) {
        if (!usuariosRegistrados.contains(usuario)) {
            usuariosRegistrados.add(usuario);
            guardarUsuariosEnArchivo();
        }
    }
    public static boolean verificarCredenciales(String usuario, String contraseña) {
        for (Usuario usuarios : usuariosRegistrados) {
            if (usuarios.getUsuario().equalsIgnoreCase(usuario) && usuarios.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }
    public static void eliminarUsuario(Usuario usuario) {
        if (usuario == null) {
            return;
        }

        Usuario usuarioPorEliminar = null;

        for (Usuario usuarioRegistrado : usuariosRegistrados) {
            if (usuarioRegistrado.getUsuario().equals(usuario.getUsuario())) {
                usuarioPorEliminar = usuarioRegistrado;
                break;
            }
        }

        if (usuarioPorEliminar != null) {
            usuariosRegistrados.remove(usuarioPorEliminar);
            guardarUsuariosEnArchivo();
        }
    }
    public static void actualizarUsuario(Usuario usuarioActual) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.equals(usuarioActual)) {
                usuario.setUsuario(usuarioActual.getUsuario());
                usuario.setContraseña(usuarioActual.getContraseña());
                guardarUsuariosEnArchivo();
                break;
            }
        }
    }
    private static void guardarUsuariosEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_DATOS))) {
            for (Usuario usuario : usuariosRegistrados) {
                writer.write(usuario.getUsuario() + "," + usuario.getContraseña());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar los usuarios en el archivo: " + e.getMessage());
        }
    }
    public static void cargarUsuariosDesdeArchivo() {
        File archivo = new File(ARCHIVO_DATOS);
        if (!archivo.exists()) {
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_DATOS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    Usuario usuario = new Usuario(partes[0], partes[1]);
                    usuariosRegistrados.add(usuario);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar los usuarios desde el archivo: " + e.getMessage());
        }
    }
}
