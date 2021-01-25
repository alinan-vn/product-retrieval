package com.hcl.productcreator.store;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	
	static List<String> names = Arrays.asList(
			"XX-PO2-LL30", "AZ-JK9-OO99", "GK-KS8-PP23", 
			"ZZ-TO6-BB33", "UI-LK9-JS09", "ML-KJ6-LM88",
			"JJ-KO9-AF29", "DF-AF1-DJ49", "DJ-AK4-LH05"
	);
	
	static List<String> types = Arrays.asList(
			"TOY", "EQUIPMENT", "TOOL", "SCIENCE",
			"ENERGY", "NATURAL GAS", "AERONAUTICS",
			"AEROSPACE", "EDUCATION"
	);

	@Autowired
	ProductEntityCrudRepository productEntityCrudRepository;
	
	@GetMapping(path = "/contact")
	String contact() {
		return "phone: 3123 21 3212 3";
	}
	
	@PostMapping(path = "/createProduct")
	void createProduct(@RequestBody ProductEntity product) {
		productEntityCrudRepository.save(product);
	}
	
	@GetMapping(path = "/home")
	String home() {
		
		for(int i = 0; i < 10; i++) {
			
			Random rand = new Random();
			String randomName = names.get(rand.nextInt(names.size()));
			String randomType = types.get(rand.nextInt(types.size()));
			Long leftLimit = 1L;
			Long rightLimit = 1000L;
			Long randomPrice = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
			
			ProductEntity productSample = new ProductEntity();
			productSample.setName(randomName);
			productSample.setType(randomType);
			productSample.setPrice(randomPrice);
			
			productEntityCrudRepository.save(productSample);
		}
		
		Iterable<ProductEntity> products = productEntityCrudRepository.findAll();
		
		products.forEach(p -> {
			System.out.println(p.getName());
		});
		
		return "Hi Home!!!";
	}
}
