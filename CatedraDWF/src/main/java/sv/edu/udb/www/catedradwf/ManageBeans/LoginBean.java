package sv.edu.udb.www.catedradwf.ManageBeans;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private String email;
    private String password;

    // Constructor por defecto
    public LoginBean() {
    }

    // Getters y setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método que simula el proceso de inicio de sesión
    public String login() {
        //aca validan las credenciales
        if ("usuario@example.com".equals(email) && "contraseña".equals(password)) {
            return "home"; //inicio de sesion exitoso
        } else {
            return "login";//inicio de sesion exitoso incorrecto
        }
    }
}
