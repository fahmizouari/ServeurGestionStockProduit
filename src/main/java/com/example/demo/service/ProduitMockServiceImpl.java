package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;


@Service
public class ProduitMockServiceImpl implements IProduitService {

	private List<Produit> produits;
	
	
	public ProduitMockServiceImpl() {
		// TODO Auto-generated constructor stub
		produits=new ArrayList<Produit>();
		
		addProduit(new Produit("livre",50,20));
		addProduit(new Produit("cahier",200,5.25f));
		addProduit(new Produit("stylo",500,2.10f));
		
		
	}
	@Override
	public List<Produit> getProduits() {

		return produits;
	}

	@Override
	public void addProduit(Produit produit) {
		produits.add(produit);		
	}

	@Override
	public void updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		
	}

	@Override
	public void deleteProduit(Long id) {
		Produit produit=new Produit();
		produit.setId(id);
		produits.remove(produit);
		
		
	}

}
