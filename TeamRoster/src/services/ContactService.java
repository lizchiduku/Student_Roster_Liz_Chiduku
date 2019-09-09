package com.codingdojo.mvc.services;

import java.util.List; 
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Contact;
import com.codingdojo.mvc.repositories.ContactRepository;




@Service
public class ContactService {
	private final ContactRepository contactRepository;
	
	public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
	public List<Contact> allContact() {
        return contactRepository.findAll();
    }
	public Contact createContact(Contact b) {
        return contactRepository.save(b);
    }
	public Contact findContact(Long id) {
        Optional<Contact> optionalContact = contactRepository.findById(id);
        if(optionalContact.isPresent()) {
            return optionalContact.get();
        } else {
            return null;
        }
    }
}