package com.yutaka.dayrepo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NumberingMapper {

	public Integer getNumber(String type);

	public boolean incrementNumber(String type);

}
