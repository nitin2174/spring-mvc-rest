package com.mvcrest.example.BootStrap;


import com.mvcrest.example.domain.Customer;
import com.mvcrest.example.repositories.ICustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner{
    private final ICustomerRepository customerRepository;

    public BootStrapData(ICustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}



    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer data");

        Customer c1= new Customer();
        c1.setFirstName("FirstName1");
        c1.setLastName("LastName1");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("FirstName2");
        c2.setLastName("LastName2");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("FirstName3");
        c3.setLastName("LastName3");
        customerRepository.save(c3);

        System.out.println("Customers saved :" + customerRepository.count());

    }
}
