package com.web.novel.pojo;

public class Chapter {
	//章节id
    private Integer chapterId;

    //书籍id
    private Integer bookId;

    //章节名称
    private String chapterName;

    //章节数
    private Integer chapterNumber;

    //章节路径
    private String chapterUrl;

    //章节插图
    private String chapterImage;

    //是否收费
    private Integer chapterIsCharge;

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName == null ? null : chapterName.trim();
    }

    public Integer getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(Integer chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public String getChapterUrl() {
        return chapterUrl;
    }

    public void setChapterUrl(String chapterUrl) {
        this.chapterUrl = chapterUrl == null ? null : chapterUrl.trim();
    }

    public String getChapterImage() {
        return chapterImage;
    }

    public void setChapterImage(String chapterImage) {
        this.chapterImage = chapterImage;
    }

    public Integer getChapterIsCharge() {
        return chapterIsCharge;
    }

    public void setChapterIsCharge(Integer chapterIsCharge) {
        this.chapterIsCharge = chapterIsCharge;
    }
}