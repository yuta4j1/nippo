package com.yutaka.dayrepo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yutaka.dayrepo.repository.NumberingRepository;

@Service
public class NumberingService {

	@Autowired
	private NumberingRepository numberingRepository;

	public Integer numbring(String type) {
		Integer num = numberingRepository.getNumber(type);
		numberingRepository.incrementNumber(type);
		return num;
	}

}
