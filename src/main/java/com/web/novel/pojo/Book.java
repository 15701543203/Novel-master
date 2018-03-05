package com.web.novel.pojo;

public class Book {
	//书籍编号
    private Integer bookId;

    //书籍名称
    private String bookName;

    //书籍存放路径
    private String bookUrl;

    //书籍简介
    private String bookDescription;

    //原价
    private String bookOldPrice;

    //现价
    private String bookNewPrice;

    //阅读量
    private Integer bookReadAmount;

    //购买量
    private Integer bookBuyAmount;

    //书籍封面图片路径
    private String bookImage;

    //书籍描述图片路径
    private String bookDetailsImage;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl == null ? null : bookUrl.trim();
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription == null ? null : bookDescription.trim();
    }

    public String getBookOldPrice() {
        return bookOldPrice;
    }

    public void setBookOldPrice(String bookOldPrice) {
        this.bookOldPrice = bookOldPrice == null ? null : bookOldPrice.trim();
    }

    public String getBookNewPrice() {
        return bookNewPrice;
    }

    public void setBookNewPrice(String bookNewPrice) {
        this.bookNewPrice = bookNewPrice == null ? null : bookNewPrice.trim();
    }

    public Integer getBookReadAmount() {
        return bookReadAmount;
    }

    public void setBookReadAmount(Integer bookReadAmount) {
        this.bookReadAmount = bookReadAmount;
    }

    public Integer getBookBuyAmount() {
        return bookBuyAmount;
    }

    public void setBookBuyAmount(Integer bookBuyAmount) {
        this.bookBuyAmount = bookBuyAmount;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookDetailsImage() {
        return bookDetailsImage;
    }

    public void setBookDetailsImage(String bookDetailsImage) {
        this.bookDetailsImage = bookDetailsImage;
    }
}