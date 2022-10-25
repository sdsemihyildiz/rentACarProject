package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController 
@RequestMapping("/api/brands") 
public class BrandsController {
	// annotation (bilgilendirme)
	// tarayıcıdan nasıl ulaşılabileceği
	private BrandService brandService;
	
	
	// autowired yaparak yeniden new'lemek zorunda kalmaktan kurtuluyoruz
	@Autowired // git ve parametrelere bak diyoruz (yani tüm uygulamayı tara)
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}

	
	@GetMapping("/getall") 
	public List<Brand> getAll() {
		// buna erişilmek istendiği zaman nasıl çağırmak gerektiği
		// www.kodlama.io/api/brands/getAll
		return brandService.getAll();
	}
}
