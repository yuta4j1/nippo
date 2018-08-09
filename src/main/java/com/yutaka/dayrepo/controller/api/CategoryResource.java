package com.yutaka.dayrepo.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yutaka.dayrepo.model.Result;
import com.yutaka.dayrepo.model.entity.CategoryEntity;
import com.yutaka.dayrepo.service.CategoryService;

@Controller
@RequestMapping("nippo/category")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(path = "/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Result searchCategories() {

		List<CategoryEntity> items = categoryService.getCategoryList();
		Result result = new Result();
		result.setSuccess(true);
		result.setData(items);
		return result;

	}

}
