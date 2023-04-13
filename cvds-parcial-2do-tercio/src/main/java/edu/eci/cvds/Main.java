package edu.eci.cvds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import edu.eci.cvds.model.Users;
import edu.eci.cvds.services.UsersService;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import java.util.Arrays;

@SpringBootApplication
public class Main {
        @Autowired
        UsersService usersService;
    public static void main (String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    ServletRegistrationBean jsfServletRegistration (ServletContext servletContext) {
        //spring boot only works if this is set
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());

        //registration
        ServletRegistrationBean srb = new ServletRegistrationBean();
        srb.setServlet(new FacesServlet());
        srb.setUrlMappings(Arrays.asList("*.xhtml"));
        srb.setLoadOnStartup(1);
        return srb;
    }
    @Bean
	public CommandLineRunner run() throws Exception {
		return (args) -> {
			
			System.out.println("Adding users....\n");
			usersService.addUsers(new Users("Hank", "2345"));
			usersService.addUsers(new Users("Mario", "aaaa"));
			usersService.addUsers(new Users("Juana", "bbbb"));
			usersService.addUsers(new Users("Esteban", "2334"));
			usersService.addUsers(new Users("Ana", "qwer"));
		};
	}
}
