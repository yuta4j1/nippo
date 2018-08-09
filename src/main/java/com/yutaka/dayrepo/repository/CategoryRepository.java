package com.yutaka.dayrepo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yutaka.dayrepo.mapper.CategoryMapper;
import com.yutaka.dayrepo.model.entity.CategoryEntity;

@Repository
public class CategoryRepository {
	@Autowired
	private CategoryMapper mapper;

	public List<CategoryEntity> getCategories() {
		return mapper.listCategories();
	}

}
