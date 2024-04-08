package com.main.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.main.entity.LICUserForm;
import com.main.repository.ILICUserFormRepository;

@Component("licUserService")
public class LICUserFormMgntImp implements ILICUserFormServiceMgnt {

	@Autowired
	private ILICUserFormRepository licFormRepository;
	
	@Override
	public LICUserForm save(LICUserForm form) {
		LICUserForm licUserForm = licFormRepository.save(form);
		
	return licUserForm;
	}

}
