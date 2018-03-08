package com.web.novel.service;

import java.util.List;

import com.web.novel.pojo.Chapter;

public interface EnglishChapterService {
	/**
	 * 章节总数
	 * @param bookId
	 * @return
	 */
	int getEnglishChapter(int bookId);
	
	/**
	 * 章节名称
	 * @param page 第几页
	 * @param size 每页显示几条数据
	 * @return
	 */
	List<Chapter> getPaginatedChapters(int page,int size);
	
	/**
	 * 查询是否为收费章节
	 * @param bookId
	 * @param chapterNumber
	 * @return
	 */
	List<Chapter> isCharge(int bookId,int chapterNumber);
	
	
	
}
