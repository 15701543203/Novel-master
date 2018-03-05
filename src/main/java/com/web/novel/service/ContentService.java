package com.web.novel.service;

public interface ContentService {
	/**
	 * 使用章节id获取内容
	 * @param chapterId
	 * @return
	 */
     String getContentByChapterId(int chapterId);
}
