package com.yutaka.dayrepo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yutaka.dayrepo.model.entity.CategoryEntity;

@Mapper
public interface CategoryMapper {

	List<CategoryEntity> listCategories();

}
