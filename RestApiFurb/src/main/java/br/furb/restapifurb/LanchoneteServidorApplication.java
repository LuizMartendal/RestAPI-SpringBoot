package br.furb.restapifurb;

import br.furb.restapifurb.enuns.Roles;
import br.furb.restapifurb.models.usuario.Usuario;
import br.furb.restapifurb.repositories.usuario.UsuarioRepository;
import br.furb.restapifurb.services.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class LanchoneteServidorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LanchoneteServidorApplication.class, args);
	}

}
