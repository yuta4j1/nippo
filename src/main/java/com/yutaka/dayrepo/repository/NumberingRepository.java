package com.yutaka.dayrepo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yutaka.dayrepo.mapper.NumberingMapper;

@Repository
public class NumberingRepository {

	@Autowired
	private NumberingMapper numberingMapper;

	public Integer getNumber(String type) {
		return numberingMapper.getNumber(type);
	}

	public void incrementNumber(String type) {
		boolean updated = numberingMapper.incrementNumber(type);
		if (!updated) {
			// TODO エラー処理
		}
	}

}
