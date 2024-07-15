package com.lms.services;

import com.lms.model.Borrowing;

public interface BorrowingService {
	
	Borrowing borrowBook(Long bookId,Long memberId);
	
	Borrowing returnBook(Long borrowingId);

}
