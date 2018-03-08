package com.web.novel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.web.novel.pojo.Chapter;

public interface EnglishChapterMapper {
	
	/**
	 * 章节数量
	 * @return
	 */
	int selectTotalChapters(int bookId);
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	List<Chapter> selectEmglishChapter(int page ,int size);
	
	/**
	 * 
	 * 查询是否为收费章节
	 * @param bookId
	 * @param isCharge
	 * @return
	 */
	List<Chapter> selectIsCharge(@Param("bookId") Integer bookId,@Param("chapterNumber") Integer chapterNumber);

}
