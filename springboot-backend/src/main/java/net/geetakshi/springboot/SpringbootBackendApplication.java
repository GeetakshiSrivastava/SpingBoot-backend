package net.geetakshi.springboot;

import net.geetakshi.springboot.model.Employee;
import net.geetakshi.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication{


	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

//	@Autowired
//	private EmployeeRepository employeeRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Geetakshi");
//		employee.setLastName("Srivastava");
//		employee.setEmailId("gs@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Ajay");
//		employee1.setLastName("Pandey");
//		employee1.setEmailId("ajju@gmail.com");
//		employeeRepository.save(employee1);
//
//
//	}
}
