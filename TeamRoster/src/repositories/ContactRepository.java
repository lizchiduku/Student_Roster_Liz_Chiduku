package com.codingdojo.web.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.mvc.models.Contact;



public interface ContactRepository extends CrudRepository<Contact, Long> {
	List<Contact> findAll();
}