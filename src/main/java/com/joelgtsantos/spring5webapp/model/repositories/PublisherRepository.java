package com.joelgtsantos.spring5webapp.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.joelgtsantos.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
