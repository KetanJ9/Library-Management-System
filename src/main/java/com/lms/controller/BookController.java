package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lms.model.Book;
import com.lms.repos.BookRepository;


@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/")
	public String listBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books";

	}
	
	@GetMapping("/book/new")
	public String showCreateForm(Model model) {
		Book book = new Book();
		model.addAttribute("book",book);
		return "create_book";
		
	}
	
	@PostMapping("/books")
	public String saveBook(Book book) {
		bookRepository.save(book);
		return "redirect:/";
		
	}
	@GetMapping("/book/{id}")
	public String updateBookForm(@PathVariable Long id,Model model) {
		Book book = bookRepository.findById(id).get();
		model.addAttribute("book", book);
		return "update_book";
	}
	
	@PostMapping("/book/update")
	public String updateBook(Book book) {
		bookRepository.save(book);
		return "redirect:/";
	}
	

}










