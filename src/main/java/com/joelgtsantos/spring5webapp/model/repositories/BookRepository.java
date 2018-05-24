package com.joelgtsantos.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.joelgtsantos.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
