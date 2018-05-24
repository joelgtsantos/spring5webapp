package com.joelgtsantos.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.joelgtsantos.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
