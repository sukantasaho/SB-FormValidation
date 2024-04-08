package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.LICUserForm;
import com.main.services.ILICUserFormServiceMgnt;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/lic/form")
public class LICUserFormController 
{
    @Autowired
	private ILICUserFormServiceMgnt service;
	
    @PostMapping("/saveLICUserForm")
	public ResponseEntity<LICUserForm> register(@Valid @RequestBody LICUserForm form)
	{
		return new ResponseEntity<LICUserForm>(service.save(form), HttpStatus.OK);
	}
}
