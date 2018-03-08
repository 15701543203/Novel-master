package com.web.novel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.novel.dao.EnglishChapterMapper;
import com.web.novel.pojo.Chapter;
import com.web.novel.service.EnglishChapterService;


@Service
public class EnglishChapterServiceImpl implements EnglishChapterService {

	@Autowired
	private EnglishChapterMapper englishChapterMapper;
	
	@Override
	public int getEnglishChapter(int bookId) {
		int totals=englishChapterMapper.selectTotalChapters(bookId);
		return totals;
	}

	@Override
	public List<Chapter> getPaginatedChapters(int page, int size) {
		List<Chapter> chapters=englishChapterMapper.selectEmglishChapter(page, size);
		return chapters;
	}

	@Override
	public List<Chapter> isCharge(int bookId, int chapterNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
