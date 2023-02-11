package com.endpoint.produtos;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Essa anotação indica que a classe é um controlador REST, responsável por lidar com requisições HTTP
@RestController
public class EndpointProdutos {
	
	// Lista para armazenar produtos
	private List<String> listaDeProdutos = new ArrayList<>();
	
	// Construtor da classe, inicializa a lista de produtos
	public EndpointProdutos() {
	    listaDeProdutos.add("Produto 1");
	    listaDeProdutos.add("Produto 2");
	    listaDeProdutos.add("Produto 3");
	}

	// Método que irá lidar com requisições GET na rota "/produtos"
	@GetMapping("/produtos")
	public List<String> getProdutos() {
	    // Retorna a lista de produtos
	    return listaDeProdutos;
	}

}
