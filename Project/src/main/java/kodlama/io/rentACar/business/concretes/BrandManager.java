package kodlama.io.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

@Service // bir servis olduğunu belli ediyor, bu sınıf bir business nesnesidir.
public class BrandManager implements BrandService{

	private BrandRepository brandRepository;
	// loosely coupled -- Herhangi bir database den bağımsız çalıştırıyoruz
	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getAll() {
		// business rules
		
		return brandRepository.getAll();
	}

}
