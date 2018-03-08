package com.web.novel.controller;

import com.google.gson.JsonObject;
import com.web.novel.pojo.Book;
import com.web.novel.pojo.Chapter;
import com.web.novel.service.BookService;
import com.web.novel.service.ChapterService;
import com.web.novel.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContentController {
    @Autowired
    BookService bookService;

    @Autowired
    ContentService contentService;

    @Autowired
    ChapterService chapterService;

    @RequestMapping("get-content.do")
    @ResponseBody
    public String getContent(int chapterId) {
        JsonObject obj = new JsonObject();
        //获取一章
        Chapter chapter = chapterService.getOneChapter(chapterId);
        //获取书籍
        Book book = bookService.getOneBookById(chapter.getBookId());
        //使用章节id获取内容
        String content = contentService.getContentByChapterId(chapterId);
        //判断是否为收费章节
        Boolean isCharge = chapter.getChapterIsCharge() != 0 ? true : false;
        obj.addProperty("isCharge", isCharge);
        if (chapter.getChapterNumber() == 1) {
            obj.addProperty("lastChapter", false);
        } else {
            obj.addProperty("lastChapter", true);
        }

        if (isCharge) {
            obj.addProperty("content", "购买后可下载全文！");
            obj.addProperty("nextChapter", false);
            obj.addProperty("chapterId", chapterId);
            obj.addProperty("imgUrl", chapter.getChapterImage());
            obj.addProperty("bookId", chapter.getBookId());
            obj.addProperty("bookName",book.getBookName());
            return obj.toString();
        } else {
            obj.addProperty("content", content);
            obj.addProperty("nextChapter", true);
            obj.addProperty("chapterId", chapterId);
            obj.addProperty("imgUrl", chapter.getChapterImage());
            obj.addProperty("bookId", chapter.getBookId());
            obj.addProperty("bookName",book.getBookName());
            return obj.toString();
        }
    }

    
//    @RequestMapping("get-english-content.do")
//    @ResponseBody
//    public String getEnglishContent(int chapterId) {
//		JsonObject jsonObject = new JsonObject();
//		//使用章节的id获取章节
//    	Chapter chapter = chapterService.getOneChapter(chapterId);
//    	//获取书
//		Book book=bookService.getOneBookById(chapter.getBookId());
//		//章节内容
//		String content = contentService.getContentByChapterId(chapterId);
//		//收费状态
//		Boolean isCharge = chapter.getChapterIsCharge() != 0 ? true : false;
//		jsonObject.addProperty("isCharge", isCharge);
//        if (chapter.getChapterNumber() == 1) {
//        	jsonObject.addProperty("lastChapter", false);
//        } else {
//        	jsonObject.addProperty("lastChapter", true);
//        }
//
//        if (isCharge) {
//        	jsonObject.addProperty("content", "购买后可下载全文！");
//        	jsonObject.addProperty("nextChapter", false);
//        	jsonObject.addProperty("chapterId", chapterId);
//        	jsonObject.addProperty("imgUrl", chapter.getChapterImage());
//        	jsonObject.addProperty("bookId", chapter.getBookId());
//        	jsonObject.addProperty("bookName",book.getBookName());
//            return jsonObject.toString();
//        } else {
//        	jsonObject.addProperty("content", content);
//        	jsonObject.addProperty("nextChapter", true);
//        	jsonObject.addProperty("chapterId", chapterId);
//        	jsonObject.addProperty("imgUrl", chapter.getChapterImage());
//        	jsonObject.addProperty("bookId", chapter.getBookId());
//        	jsonObject.addProperty("bookName",book.getBookName());
//            return jsonObject.toString();
//        }
//    }

}
