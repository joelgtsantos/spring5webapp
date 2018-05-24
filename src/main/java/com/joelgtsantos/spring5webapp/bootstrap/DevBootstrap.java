package com.joelgtsantos.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.joelgtsantos.spring5webapp.model.Author;
import com.joelgtsantos.spring5webapp.model.Book;
import com.joelgtsantos.spring5webapp.model.Publisher;
import com.joelgtsantos.spring5webapp.model.repositories.AuthorRepository;
import com.joelgtsantos.spring5webapp.model.repositories.BookRepository;
import com.joelgtsantos.spring5webapp.model.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}
	
	private void initData() {
		
		Publisher publisher1 = new Publisher("Publisher 1", "Publisher address 1");
		publisherRepository.save(publisher1);
		
		Publisher publisher2 = new Publisher("Publisher 2", "Publisher address 2");
		publisherRepository.save(publisher2);
		
		//Eric
		Author eric = new Author("Eric", "Evans");		
		Book domaind = new Book("Domain Design Driven", "1234", publisher1);
		eric.getBooks().add(domaind);
		domaind.getAuthors().add(eric);
		
		authorRepository.save(eric);
		bookRepository.save(domaind);
		
		
		//Alex
		Author red = new Author("Red", "Johnson");
		
		Book j2ee = new Book("J2EE Development without EJB", "5678", publisher2);
		red.getBooks().add(j2ee);
		
		authorRepository.save(red);
		bookRepository.save(j2ee);
		
	}

	
}
