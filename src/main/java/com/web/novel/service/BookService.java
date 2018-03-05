package com.web.novel.service;


import com.web.novel.pojo.Book;

public interface BookService {
	/**
	 * 使用id查询书的名称
	 * @param bookId
	 * @return
	 */
     Book getOneBookById(int bookId);
}
