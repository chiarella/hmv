package br.com.hmv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.hmv.entity.Paciente;
import br.com.hmv.repository.PacienteRepository;

@Configuration
@Profile("test")
public class Teste implements CommandLineRunner {
	
	
	private PacienteRepository repository;
	
	
    public void run(String... args) throws Exception {
    	
    	Paciente paciente1 = new Paciente();
    	paciente1.setCpf("320320320");
    	
    	repository.save(paciente1);
    	
    	
    }
    
    
}
