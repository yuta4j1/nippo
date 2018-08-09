package com.yutaka.dayrepo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yutaka.dayrepo.model.entity.CategoryEntity;
import com.yutaka.dayrepo.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<CategoryEntity> getCategoryList() {
		return repository.getCategories();
	}

}
