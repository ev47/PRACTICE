/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaSwing;

import java.util.List;
import java.util.ArrayList;
public class crearUsuarios {
     public static List<Usuario> usuarios = new ArrayList<>();   
    public static class Usuario {
        private String usuario;
        private String contraseña;
        public Usuario(String usuario, String contraseña) {
            this.usuario = usuario;
            this.contraseña = contraseña;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }
    }
}
