package lambida;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model_service.ProductService;

public class Program {

	public static void main(String[] args) {

		// Função recebendo uma Função lambida atraves de uma argumento.
		
		List<Product> list = new ArrayList<>();         
		list.add(new Product("Tv", 900.00));           
		list.add(new Product("Mouse", 50.00));         
		list.add(new Product("Tablet", 350.50));        
		list.add(new Product("HD Case", 80.90));       
		
		ProductService ps = new ProductService();
		
		// Função recebendo uma Função atraves de um Predicate
		/* a Função filteredSum() recebeu outra função, se tornando mais flexivel e
		   não precisando ir até classe ProductService(), alterando
		   somente a condição dentro do código principal. */
		 
		 double sum = ps.filteredSum(list,p -> p.getName().charAt(0) == 'T');
		
		     System.out.println("Sum = " + String.format("%.2f", sum ));
   }
}