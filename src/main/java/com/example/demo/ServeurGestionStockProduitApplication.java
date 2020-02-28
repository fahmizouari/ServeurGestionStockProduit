package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@SpringBootApplication
public class ServeurGestionStockProduitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
		/*ProduitRepository produitRepository=ctx.getBean(ProduitRepository.class);
		
		produitRepository.save(new Produit("livre",50,20));
		produitRepository.save(new Produit("cahier",200,5.25f));
		produitRepository.save(new Produit("stylo",500,2.10f));*/
		
	}

}
