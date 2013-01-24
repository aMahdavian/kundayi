package au.com.kundayi.cms.service;

import javax.inject.Inject;
import javax.inject.Named;

import au.com.kundayi.cms.domain.Category;
import au.com.kundayi.cms.repository.CategoryRepository;
import au.com.regimo.core.service.GenericService;

@Named
public class CategoryService extends GenericService<CategoryRepository, Category> {

	@Inject
	public CategoryService(CategoryRepository repository) {
		super(repository);
	}

	public Category findBySlug(String slug){
		return repository.findBySlug(slug);
	}

}
