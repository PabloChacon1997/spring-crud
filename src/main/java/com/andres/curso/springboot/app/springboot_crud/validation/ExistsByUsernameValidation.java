package com.andres.curso.springboot.app.springboot_crud.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.andres.curso.springboot.app.springboot_crud.services.UserService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class ExistsByUsernameValidation implements ConstraintValidator<ExixtsByUsername, String>{

  @Autowired
  private UserService service;

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if(service == null) return true;
    return service.existsByUsername(value);
  }

}
