package com.web.novel.service;

import com.web.novel.pojo.Chapter;

import java.util.List;

public interface ChapterService {
	//全部章节
    List<Chapter> getChapters(int BookId);

    //收费章节
    List<Chapter> getChargeChapters(int bookId);

    //免费章节
    List<Chapter> getFreeChapters(int bookId);

    //是否收费
    Boolean isCharge(int chapterId);

    //单个章节
    Chapter getOneChapter(int chapterId);
}
